package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typings.reactDashNavigation.reactDashNavigationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBottomTabRouterConfig extends NavigationTabRouterConfigBase {
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[NavigationBottomTabScreenOptions]] = js.undefined
  var navigationOptions: js.UndefOr[NavigationTabRouterConfigBase] = js.undefined
}

object NavigationBottomTabRouterConfig {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationBottomTabScreenOptions] = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    navigationOptions: NavigationTabRouterConfigBase = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null
  ): NavigationBottomTabRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[NavigationBottomTabRouterConfig]
  }
}

