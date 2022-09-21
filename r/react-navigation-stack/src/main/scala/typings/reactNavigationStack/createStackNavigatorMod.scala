package typings.reactNavigationStack

import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationStackRouterConfig
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.vendorTypesMod.StackNavigationOptions
import typings.reactNavigationStack.vendorTypesMod.StackNavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStackNavigatorMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/navigators/createStackNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      Any
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  inline def default(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      Any
    ],
    stackConfig: CreateNavigatorConfig[
      StackNavigationConfig, 
      NavigationStackRouterConfig, 
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigMap.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
}
