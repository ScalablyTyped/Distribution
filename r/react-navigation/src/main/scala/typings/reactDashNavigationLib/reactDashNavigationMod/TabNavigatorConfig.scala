package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorConfig
  extends NavigationTabRouterConfig
     with TabViewConfig {
  var initialLayout: js.UndefOr[reactDashNavigationLib.Anon_HeightWidth] = js.undefined
  var removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined
}

object TabNavigatorConfig {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    backBehavior: reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    initialLayout: reactDashNavigationLib.Anon_HeightWidth = null,
    initialRouteName: java.lang.String = null,
    initialRouteParams: NavigationParams = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    navigationOptions: NavigationTabRouterConfigBase = null,
    order: js.Array[java.lang.String] = null,
    paths: NavigationPathsConfig = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    tabBarOptions: reactDashNavigationLib.Anon_ActiveBackgroundColorActiveTintColor = null,
    tabBarPosition: reactDashNavigationLib.reactDashNavigationLibStrings.top | reactDashNavigationLib.reactDashNavigationLibStrings.bottom = null
  ): TabNavigatorConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout)
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (tabBarComponent != null) __obj.updateDynamic("tabBarComponent")(tabBarComponent.asInstanceOf[js.Any])
    if (tabBarOptions != null) __obj.updateDynamic("tabBarOptions")(tabBarOptions)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabNavigatorConfig]
  }
}

