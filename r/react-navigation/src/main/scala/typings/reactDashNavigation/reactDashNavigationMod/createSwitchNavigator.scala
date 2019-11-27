package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.CreateNavigatorConfigNavigationSwitchRouterConfigN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "createSwitchNavigator")
@js.native
object createSwitchNavigator extends js.Object {
  def apply(
    routeConfigMap: NavigationRouteConfigMap[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ): NavigationNavigator[js.Object, NavigationProp[NavigationState]] = js.native
  def apply(
    routeConfigMap: NavigationRouteConfigMap[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams]
    ],
    switchConfig: CreateNavigatorConfigNavigationSwitchRouterConfigN
  ): NavigationNavigator[js.Object, NavigationProp[NavigationState]] = js.native
}

