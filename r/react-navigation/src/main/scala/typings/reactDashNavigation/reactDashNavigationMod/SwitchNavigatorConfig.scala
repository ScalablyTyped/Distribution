package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typings.reactDashNavigation.reactDashNavigationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchNavigatorConfig extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute] = js.undefined
  var initialRouteName: String
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}

object SwitchNavigatorConfig {
  @scala.inline
  def apply(
    initialRouteName: String,
    backBehavior: none | initialRoute = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined
  ): SwitchNavigatorConfig = {
    val __obj = js.Dynamic.literal(initialRouteName = initialRouteName)
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur)
    __obj.asInstanceOf[SwitchNavigatorConfig]
  }
}

