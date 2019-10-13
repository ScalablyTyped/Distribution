package typings.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableTabBarProps extends DefaultTabBarProps {
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
}

object ScrollableTabBarProps {
  @scala.inline
  def apply(
    activeTextColor: String = null,
    backgroundColor: String = null,
    inactiveTextColor: String = null,
    renderTab: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element = null,
    scrollOffset: Int | Double = null,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null,
    tabsContainerStyle: ViewStyle = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null
  ): ScrollableTabBarProps = {
    val __obj = js.Dynamic.literal()
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor)
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction5(renderTab))
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    __obj.asInstanceOf[ScrollableTabBarProps]
  }
}

