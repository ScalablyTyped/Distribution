package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends TabProps {
  var key: java.lang.String
}

object Tab {
  @scala.inline
  def apply(
    key: java.lang.String,
    children: (js.Function1[
      /* props */ reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]) | reactLib.reactMod.ReactNs.ReactNode = null,
    component: reactLib.reactMod.ReactNs.ComponentClass[
      reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ] = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    hideTabBar: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    onIndexChange: /* index */ scala.Double => scala.Unit = null,
    onReset: /* props */ TabBarProps with reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps => scala.Unit = null,
    path: java.lang.String = null,
    render: /* props */ reactDashRouterLib.reactDashRouterMod.RouterProps => reactLib.reactMod.ReactNs.ReactNode = null,
    renderLabel: /* props */ TabSubViewProps => reactLib.reactMod.ReactNs.ReactNode = null,
    renderTabBar: /* props */ TabSubViewProps => reactLib.reactMod.ReactNs.ReactNode = null,
    renderTabIcon: /* props */ TabSubViewProps => reactLib.reactMod.ReactNs.ReactNode = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    tabActiveTintColor: java.lang.String = null,
    tabBarIndicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabBarPosition: reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.top | reactDashRouterDashNavigationLib.reactDashRouterDashNavigationLibStrings.bottom = null,
    tabBarStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabTintColor: java.lang.String = null
  ): Tab = {
    val __obj = js.Dynamic.literal(key = key)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1(onIndexChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (path != null) __obj.updateDynamic("path")(path)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor)
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor)
    __obj.asInstanceOf[Tab]
  }
}

