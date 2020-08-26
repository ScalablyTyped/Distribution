package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarIcon extends IconObject {
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object AvatarIcon {
  @scala.inline
  def apply(): AvatarIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarIcon]
  }
  @scala.inline
  implicit class AvatarIconOps[Self <: AvatarIcon] (val x: Self) extends AnyVal {
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
    def setIconStyle(value: StyleProp[TextStyle]): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setIconStyleNull: Self = this.set("iconStyle", null)
  }
  
}

