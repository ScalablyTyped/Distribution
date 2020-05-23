package typings.reactNativeScrollableTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeScrollableTabView.mod.RenderTabProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.ScrollableTabBarProps> */
trait TabBarPropsScrollableTabB extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var activeTextColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var inactiveTextColor: js.UndefOr[String] = js.undefined
  var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var scrollValue: js.UndefOr[Value] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  var tabs: js.UndefOr[js.Array[Element]] = js.undefined
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
}

object TabBarPropsScrollableTabB {
  @scala.inline
  def apply(
    activeTab: js.UndefOr[Double] = js.undefined,
    activeTextColor: String = null,
    backgroundColor: String = null,
    containerWidth: js.UndefOr[Double] = js.undefined,
    goToPage: /* pageNumber */ Double => Unit = null,
    inactiveTextColor: String = null,
    renderTab: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element = null,
    scrollOffset: js.UndefOr[Double] = js.undefined,
    scrollValue: Value = null,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null,
    tabs: js.Array[Element] = null,
    tabsContainerStyle: ViewStyle = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null
  ): TabBarPropsScrollableTabB = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeTab)) __obj.updateDynamic("activeTab")(activeTab.get.asInstanceOf[js.Any])
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(containerWidth)) __obj.updateDynamic("containerWidth")(containerWidth.get.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1(goToPage))
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction5(renderTab))
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.get.asInstanceOf[js.Any])
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarPropsScrollableTabB]
  }
}

