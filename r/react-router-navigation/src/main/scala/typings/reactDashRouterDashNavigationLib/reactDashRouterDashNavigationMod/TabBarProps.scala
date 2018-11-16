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

