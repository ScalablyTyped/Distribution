package typings
package reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableTabBarProps extends DefaultTabBarProps {
  var scrollOffset: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var tabsContainerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object ScrollableTabBarProps {
  @scala.inline
  def apply(
    activeTextColor: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    inactiveTextColor: java.lang.String = null,
    renderTab: RenderTabProperties = null,
    scrollOffset: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    tabsContainerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    underlineStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): ScrollableTabBarProps = {
    val __obj = js.Dynamic.literal()
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor)
    if (renderTab != null) __obj.updateDynamic("renderTab")(renderTab)
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    __obj.asInstanceOf[ScrollableTabBarProps]
  }
}

