package typings.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTabBarProps extends js.Object {
  var activeTextColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var inactiveTextColor: js.UndefOr[String] = js.undefined
  var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
}

object DefaultTabBarProps {
  @scala.inline
  def apply(
    activeTextColor: String = null,
    backgroundColor: String = null,
    inactiveTextColor: String = null,
    renderTab: RenderTabProperties = null,
    tabStyle: ViewStyle = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null
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

