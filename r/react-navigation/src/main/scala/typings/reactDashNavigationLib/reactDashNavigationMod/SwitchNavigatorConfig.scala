package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchNavigatorConfig extends js.Object {
  var backBehavior: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute
  ] = js.undefined
  var initialRouteName: java.lang.String
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
  var resetOnBlur: js.UndefOr[scala.Boolean] = js.undefined
}

object SwitchNavigatorConfig {
  @scala.inline
  def apply(
    initialRouteName: java.lang.String,
    backBehavior: reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  ): SwitchNavigatorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur)
    __obj.asInstanceOf[SwitchNavigatorConfig]
  }
}

