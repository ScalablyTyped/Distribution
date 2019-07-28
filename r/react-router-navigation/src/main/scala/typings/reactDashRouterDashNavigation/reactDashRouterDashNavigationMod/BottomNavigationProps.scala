package typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationStrings.bottom
import typings.reactDashRouterDashNavigation.reactDashRouterDashNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps extends TabBarProps {
  var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] = null,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelStyle: StyleProp[TextStyle] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    renderLabel: /* props */ TabSubViewProps => ReactNode = null,
    renderTabBar: /* props */ TabSubViewProps => ReactNode = null,
    renderTabIcon: /* props */ TabSubViewProps => ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: StyleProp[ViewStyle] = null,
    tabBarPosition: top | bottom = null,
    tabBarStyle: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    tabTintColor: String = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
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

