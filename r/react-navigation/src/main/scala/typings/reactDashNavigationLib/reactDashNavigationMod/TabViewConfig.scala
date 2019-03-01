package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabViewConfig extends js.Object {
  var animationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var tabBarComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var tabBarOptions: js.UndefOr[reactDashNavigationLib.Anon_ActiveBackgroundColorActiveTintColor] = js.undefined
  var tabBarPosition: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.top | reactDashNavigationLib.reactDashNavigationLibStrings.bottom
  ] = js.undefined
}

object TabViewConfig {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    tabBarOptions: reactDashNavigationLib.Anon_ActiveBackgroundColorActiveTintColor = null,
    tabBarPosition: reactDashNavigationLib.reactDashNavigationLibStrings.top | reactDashNavigationLib.reactDashNavigationLibStrings.bottom = null
  ): TabViewConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (tabBarComponent != null) __obj.updateDynamic("tabBarComponent")(tabBarComponent.asInstanceOf[js.Any])
    if (tabBarOptions != null) __obj.updateDynamic("tabBarOptions")(tabBarOptions)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabViewConfig]
  }
}

