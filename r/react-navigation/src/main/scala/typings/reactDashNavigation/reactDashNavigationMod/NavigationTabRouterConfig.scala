package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.history
import typings.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typings.reactDashNavigation.reactDashNavigationStrings.none
import typings.reactDashNavigation.reactDashNavigationStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTabRouterConfig extends js.Object {
   // todo: type these as the real route names rather than 'string'
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to 'initialRoute'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}

object NavigationTabRouterConfig {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute | history | order = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined
  ): NavigationTabRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur)
    __obj.asInstanceOf[NavigationTabRouterConfig]
  }
}

