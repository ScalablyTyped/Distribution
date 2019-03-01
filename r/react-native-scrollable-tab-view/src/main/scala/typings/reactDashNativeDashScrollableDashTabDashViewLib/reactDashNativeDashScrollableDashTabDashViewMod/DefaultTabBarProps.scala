package typings
package reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTabBarProps extends js.Object {
  var activeTextColor: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var inactiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
  var tabStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var textStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  var underlineStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object DefaultTabBarProps {
  @scala.inline
  def apply(
    activeTextColor: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    inactiveTextColor: java.lang.String = null,
    renderTab: RenderTabProperties = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    underlineStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): DefaultTabBarProps = {
    val __obj = js.Dynamic.literal()
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor)
    if (renderTab != null) __obj.updateDynamic("renderTab")(renderTab)
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    __obj.asInstanceOf[DefaultTabBarProps]
  }
}

