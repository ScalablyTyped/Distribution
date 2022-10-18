package typings.reactNavigationDrawer

import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerConfig
import typings.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typings.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import typings.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerRouterConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcNavigatorsCreateDrawerNavigatorMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/navigators/createDrawerNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any], 
      Any
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  inline def default(
    routeConfigs: NavigationRouteConfigMap[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any], 
      Any
    ],
    config: CreateNavigatorConfig[
      NavigationDrawerConfig, 
      NavigationDrawerRouterConfig, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any]
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
}
