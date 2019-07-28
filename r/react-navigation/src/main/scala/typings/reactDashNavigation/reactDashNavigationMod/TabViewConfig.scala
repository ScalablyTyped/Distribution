package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactType
import typings.reactDashNavigation.Anon_ActiveBackgroundColorActiveTintColor
import typings.reactDashNavigation.reactDashNavigationStrings.bottom
import typings.reactDashNavigation.reactDashNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabViewConfig extends js.Object {
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  var tabBarComponent: js.UndefOr[ReactType[_]] = js.undefined
  var tabBarOptions: js.UndefOr[Anon_ActiveBackgroundColorActiveTintColor] = js.undefined
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
}

object TabViewConfig {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabBarComponent: ReactType[_] = null,
    tabBarOptions: Anon_ActiveBackgroundColorActiveTintColor = null,
    tabBarPosition: top | bottom = null
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

