package typings.reactRouterNavigation.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typings.reactRouterNavigation.reactRouterNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarComponentProps extends TabBarProps {
  var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
}

object TabBarComponentProps {
  @scala.inline
  def apply(
    children: js.Array[ReactElement] = null,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    renderLabel: /* props */ TabSubViewProps => ReactNode = null,
    renderTabBar: /* props */ TabSubViewProps => ReactNode = null,
    renderTabIcon: /* props */ TabSubViewProps => ReactNode = null,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabBarPosition: top | bottom = null,
    tabBarStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabTintColor: String = null
  ): TabBarComponentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarIndicatorStyle)) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarStyle)) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(tabStyle)) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarComponentProps]
  }
}

