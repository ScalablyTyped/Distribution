package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`fade-in-place`
import typings.reactDashNavigation.reactDashNavigationStrings.uikit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackRouterConfig extends js.Object {
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[NavigationScreenOptions]] = js.undefined
  var headerTransitionPreset: js.UndefOr[`fade-in-place` | uikit] = js.undefined
  var initialRouteKey: js.UndefOr[String] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var navigationOptions: js.UndefOr[NavigationScreenConfig[NavigationScreenOptions]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
}

object NavigationStackRouterConfig {
  @scala.inline
  def apply(
    defaultNavigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    headerTransitionPreset: `fade-in-place` | uikit = null,
    initialRouteKey: String = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    navigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    paths: NavigationPathsConfig = null
  ): NavigationStackRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (initialRouteKey != null) __obj.updateDynamic("initialRouteKey")(initialRouteKey)
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[NavigationStackRouterConfig]
  }
}

