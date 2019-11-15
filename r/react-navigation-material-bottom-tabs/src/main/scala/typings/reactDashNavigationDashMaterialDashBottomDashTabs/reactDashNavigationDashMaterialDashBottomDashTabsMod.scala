package typings.reactDashNavigationDashMaterialDashBottomDashTabs

import typings.reactDashNavigation.reactDashNavigationMod.CreateNavigatorConfig
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRouteConfigMap
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTabRouterConfig
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabConfig
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabOptions
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-material-bottom-tabs", JSImport.Namespace)
@js.native
object reactDashNavigationDashMaterialDashBottomDashTabsMod extends js.Object {
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
  def createMaterialBottomTabNavigator(
    routes: NavigationRouteConfigMap[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _]
    ],
    config: CreateNavigatorConfig[
      NavigationMaterialBottomTabConfig, 
      NavigationTabRouterConfig, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
}

