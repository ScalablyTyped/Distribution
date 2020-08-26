package typings.reactNativeScrollableTabView.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTabBarProps extends js.Object {
  var activeTextColor: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var inactiveTextColor: js.UndefOr[String] = js.native
  var renderTab: js.UndefOr[RenderTabProperties] = js.native
  var style: js.UndefOr[ViewStyle] = js.native
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  var textStyle: js.UndefOr[TextStyle] = js.native
  var underlineStyle: js.UndefOr[ViewStyle] = js.native
}

object DefaultTabBarProps {
  @scala.inline
  def apply(): DefaultTabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTabBarProps]
  }
  @scala.inline
  implicit class DefaultTabBarPropsOps[Self <: DefaultTabBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveTextColor(value: String): Self = this.set("activeTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTextColor: Self = this.set("activeTextColor", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setInactiveTextColor(value: String): Self = this.set("inactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveTextColor: Self = this.set("inactiveTextColor", js.undefined)
    @scala.inline
    def setRenderTab(
      value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
    ): Self = this.set("renderTab", js.Any.fromFunction5(value))
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabStyle(value: ViewStyle): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setUnderlineStyle(value: ViewStyle): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
  }
  
}

