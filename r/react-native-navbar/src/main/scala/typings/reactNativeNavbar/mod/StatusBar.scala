package typings.reactNativeNavbar.mod

import typings.reactNativeNavbar.reactNativeNavbarStrings.`light-content`
import typings.reactNativeNavbar.reactNativeNavbarStrings.fade
import typings.reactNativeNavbar.reactNativeNavbarStrings.none
import typings.reactNativeNavbar.reactNativeNavbarStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBar extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.native
  var hideAnimation: js.UndefOr[fade | slide | none] = js.native
  var showAnimation: js.UndefOr[fade | slide | none] = js.native
  var style: js.UndefOr[`light-content` | typings.reactNativeNavbar.reactNativeNavbarStrings.default] = js.native
  var tintColor: js.UndefOr[String] = js.native
}

object StatusBar {
  @scala.inline
  def apply(): StatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBar]
  }
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHideAnimation(value: fade | slide | none): Self = this.set("hideAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAnimation: Self = this.set("hideAnimation", js.undefined)
    @scala.inline
    def setShowAnimation(value: fade | slide | none): Self = this.set("showAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAnimation: Self = this.set("showAnimation", js.undefined)
    @scala.inline
    def setStyle(value: `light-content` | typings.reactNativeNavbar.reactNativeNavbarStrings.default): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
  
}

