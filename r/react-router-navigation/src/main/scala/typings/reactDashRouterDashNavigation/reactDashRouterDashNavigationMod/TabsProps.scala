package typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTransitionProps
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTransitionSpec
import typings.reactDashRouterDashNavigation.Anon_Height
import typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationStrings.bottom
import typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends TabBarProps {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      NavigationTransitionSpec
    ]
  ] = js.undefined
  // <Tabs /> only:
  var initialLayout: js.UndefOr[Anon_Height] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    configureTransition: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => NavigationTransitionSpec = null,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    initialLayout: Anon_Height = null,
    label: String = null,
    labelStyle: StyleProp[TextStyle] = null,
    renderLabel: /* props */ TabSubViewProps => ReactNode = null,
    renderTabBar: /* props */ TabSubViewProps => ReactNode = null,
    renderTabIcon: /* props */ TabSubViewProps => ReactNode = null,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: StyleProp[ViewStyle] = null,
    tabBarPosition: top | bottom = null,
    tabBarStyle: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    tabTintColor: String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2(configureTransition))
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar)
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor)
    if (tabBarIndicatorStyle != null) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor)
    __obj.asInstanceOf[TabsProps]
  }
}

