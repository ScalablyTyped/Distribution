package typings.reactRouterNavigation.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactRouter.mod.RouterProps
import typings.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typings.reactRouterNavigation.reactRouterNavigationStrings.top
import typings.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends RouteProps
     with TabBarProps {
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* props */ TabBarProps with RouteProps, Unit]] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouterProps, ReactNode]) | ReactNode = null,
    component: ComponentClass[RouterProps, ComponentState] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    hideTabBar: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onIndexChange: /* index */ Double => Unit = null,
    onReset: /* props */ TabBarProps with RouteProps => Unit = null,
    path: String = null,
    render: /* props */ RouterProps => ReactNode = null,
    renderLabel: /* props */ TabSubViewProps => ReactNode = null,
    renderTabBar: /* props */ TabSubViewProps => ReactNode = null,
    renderTabIcon: /* props */ TabSubViewProps => ReactNode = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    tabActiveTintColor: String = null,
    tabBarIndicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabBarPosition: top | bottom = null,
    tabBarStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabTintColor: String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTabBar)) __obj.updateDynamic("hideTabBar")(hideTabBar.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1(onIndexChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1(renderTabBar))
    if (renderTabIcon != null) __obj.updateDynamic("renderTabIcon")(js.Any.fromFunction1(renderTabIcon))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (tabActiveTintColor != null) __obj.updateDynamic("tabActiveTintColor")(tabActiveTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarIndicatorStyle)) __obj.updateDynamic("tabBarIndicatorStyle")(tabBarIndicatorStyle.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarStyle)) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(tabStyle)) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabTintColor != null) __obj.updateDynamic("tabTintColor")(tabTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

