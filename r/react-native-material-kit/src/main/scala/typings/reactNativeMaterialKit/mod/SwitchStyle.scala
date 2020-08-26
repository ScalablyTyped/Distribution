package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchStyle extends js.Object {
  var offColor: js.UndefOr[String] = js.native
  var onColor: js.UndefOr[String] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var thumbOffColor: js.UndefOr[String] = js.native
  var thumbOnColor: js.UndefOr[String] = js.native
}

object SwitchStyle {
  @scala.inline
  def apply(): SwitchStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchStyle]
  }
  @scala.inline
  implicit class SwitchStyleOps[Self <: SwitchStyle] (val x: Self) extends AnyVal {
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
    def setOffColor(value: String): Self = this.set("offColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffColor: Self = this.set("offColor", js.undefined)
    @scala.inline
    def setOnColor(value: String): Self = this.set("onColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnColor: Self = this.set("onColor", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setThumbOffColor(value: String): Self = this.set("thumbOffColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbOffColor: Self = this.set("thumbOffColor", js.undefined)
    @scala.inline
    def setThumbOnColor(value: String): Self = this.set("thumbOnColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbOnColor: Self = this.set("thumbOnColor", js.undefined)
  }
  
}

