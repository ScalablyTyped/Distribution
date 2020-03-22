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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/navigators/createStackNavigator", JSImport.Namespace)
@js.native
object createStackNavigatorMod extends js.Object {
  def default(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  def default(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ],
    stackConfig: CreateNavigatorConfig[
      StackNavigationConfig, 
      NavigationStackRouterConfig, 
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
}

