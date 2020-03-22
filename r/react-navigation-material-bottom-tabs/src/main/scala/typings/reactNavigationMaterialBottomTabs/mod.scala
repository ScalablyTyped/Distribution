package typings.reactNavigationMaterialBottomTabs

import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationTabRouterConfig
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabConfig
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typings.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-material-bottom-tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ): js.Any = js.native
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ],
    config: CreateNavigatorConfig[
      NavigationMaterialBottomTabConfig, 
      NavigationTabRouterConfig, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

