package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactType
import typings.reactDashNavigation.Anon_ActiveBackgroundColorActiveTintColor
import typings.reactDashNavigation.Anon_HeightWidth
import typings.reactDashNavigation.reactDashNavigationStrings.bottom
import typings.reactDashNavigation.reactDashNavigationStrings.initialRoute
import typings.reactDashNavigation.reactDashNavigationStrings.none
import typings.reactDashNavigation.reactDashNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorConfig
  extends NavigationTabRouterConfig
     with TabViewConfig {
  var initialLayout: js.UndefOr[Anon_HeightWidth] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
}

object TabNavigatorConfig {
  @scala.inline
  def apply(
    animationEnabled: js.UndefOr[Boolean] = js.undefined,
    backBehavior: none | initialRoute = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    initialLayout: Anon_HeightWidth = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    navigationOptions: NavigationTabRouterConfigBase = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabBarComponent: ReactType[_] = null,
    tabBarOptions: Anon_ActiveBackgroundColorActiveTintColor = null,
    tabBarPosition: top | bottom = null
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

