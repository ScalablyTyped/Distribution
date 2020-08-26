package typings.rmcTabs.anon

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTextColor extends js.Object {
  var activeTextColor: String = js.native
  var container: Height = js.native
  var inactiveTextColor: String = js.native
  var tab: ViewStyle = js.native
  var tabs: ViewStyle = js.native
  var textStyle: ViewStyle = js.native
  var underline: ViewStyle = js.native
}

object ActiveTextColor {
  @scala.inline
  def apply(
    activeTextColor: String,
    container: Height,
    inactiveTextColor: String,
    tab: ViewStyle,
    tabs: ViewStyle,
    textStyle: ViewStyle,
    underline: ViewStyle
  ): ActiveTextColor = {
    val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTextColor]
  }
  @scala.inline
  implicit class ActiveTextColorOps[Self <: ActiveTextColor] (val x: Self) extends AnyVal {
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
    def setContainer(value: Height): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactiveTextColor(value: String): Self = this.set("inactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: ViewStyle): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabs(value: ViewStyle): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStyle(value: ViewStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: ViewStyle): Self = this.set("underline", value.asInstanceOf[js.Any])
  }
  
}

