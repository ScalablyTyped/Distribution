package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarProps extends js.Object {
  var hideTabBar: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var renderLabel: js.UndefOr[js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderTabBar: js.UndefOr[js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  // <BottomNavigation /> only:
  var renderTabIcon: js.UndefOr[js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var tabActiveTintColor: js.UndefOr[java.lang.String] = js.undefined
  var tabBarIndicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  // <Tabs /> only:
  var tabBarPosition: js.UndefOr[
    reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.top | reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.bottom
  ] = js.undefined
  var tabBarStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var tabStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var tabTintColor: js.UndefOr[java.lang.String] = js.undefined
}

object TabBarProps {
  @scala.inline
  def apply(
    hideTabBar: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    renderLabel: js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTabBar: js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTabIcon: js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    tabActiveTintColor: java.lang.String = null,
    tabBarIndicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabBarPosition: reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.top | reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.bottom = null,
    tabBarStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabTintColor: java.lang.String = null
  ): TabBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(renderLabel)
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar)
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(renderTabIcon)
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor)
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor)
    __obj.asInstanceOf[TabBarProps]
  }
}

