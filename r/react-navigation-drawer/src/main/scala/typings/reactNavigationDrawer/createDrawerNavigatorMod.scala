package typings.reactNavigationDrawer

import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationDrawer.typesMod.NavigationDrawerConfig
import typings.reactNavigationDrawer.typesMod.NavigationDrawerOptions
import typings.reactNavigationDrawer.typesMod.NavigationDrawerProp
import typings.reactNavigationDrawer.typesMod.NavigationDrawerRouterConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDrawerNavigatorMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/navigators/createDrawerNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any], 
      js.Any
    ]
  ): NavigationNavigator[js.Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[js.Any, NavigationProp[NavigationState]]]
  @scala.inline
  def default(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any], 
      js.Any
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any]
    ]
  ): NavigationNavigator[js.Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[js.Any, NavigationProp[NavigationState]]]
}
