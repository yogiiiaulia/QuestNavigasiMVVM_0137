package com.example.p6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.p6.view.FormIsian
import androidx.navigation.compose.composable
import com.example.p6.view.TampilData

enum class Navigasi {
    FormulirSaya,
    Detail
}


@Composable
fun DataApp(
