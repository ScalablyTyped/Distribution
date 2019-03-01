package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends TabBarProps {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* transitionProps */ reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionSpec
    ]
  ] = js.undefined
  // <Tabs /> only:
  var initialLayout: js.UndefOr[reactDashRouterDashNavigationLib.Anon_Height] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    configureTransition: js.Function2[
      /* transitionProps */ reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionSpec
    ] = null,
    hideTabBar: js.UndefOr[scala.Boolean] = js.undefined,
    initialLayout: reactDashRouterDashNavigationLib.Anon_Height = null,
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
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(configureTransition)
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar)
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout)
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
    __obj.asInstanceOf[TabsProps]
  }
}

