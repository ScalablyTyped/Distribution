package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.history
import typings.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typings.reactDashNavigation.reactDashNavigationStrings.none
import typings.reactDashNavigation.reactDashNavigationStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSwitchRouterConfig extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}

object NavigationSwitchRouterConfig {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute | history | order = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined
  ): NavigationSwitchRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSwitchRouterConfig]
  }
}

