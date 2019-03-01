package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps extends TabBarProps {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    hideTabBar: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    renderLabel: js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTabBar: js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTabIcon: js.Function1[/* props */ TabSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabActiveTintColor: java.lang.String = null,
    tabBarIndicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabBarPosition: reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.top | reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.bottom = null,
    tabBarStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabTintColor: java.lang.String = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(renderLabel)
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar)
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(renderTabIcon)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor)
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor)
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

