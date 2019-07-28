package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typings.reactDashNavigation.reactDashNavigationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait NavigationTabRouterConfigBase extends js.Object {
   // todo: type these as the real route names rather than 'string'
  // Does the back button cause the router to switch to the initial tab
  var backBehavior: js.UndefOr[none | initialRoute] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
}

object NavigationTabRouterConfigBase {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null
  ): NavigationTabRouterConfigBase = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[NavigationTabRouterConfigBase]
  }
}

