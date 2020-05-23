package typings.reactNativeScrollableTabView.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    scrollOffset: js.UndefOr[Double] = js.undefined,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null,
    tabsContainerStyle: ViewStyle = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null
  ): ScrollableTabBarProps = {
    val __obj = js.Dynamic.literal()
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction5(renderTab))
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableTabBarProps]
  }
}

