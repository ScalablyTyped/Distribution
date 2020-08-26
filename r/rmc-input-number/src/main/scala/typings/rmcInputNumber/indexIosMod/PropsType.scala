package typings.rmcInputNumber.indexIosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType
  extends typings.rmcInputNumber.baseMod.PropsType {
  var downStyle: js.UndefOr[js.Any] = js.native
  var inputStyle: js.UndefOr[js.Any] = js.native
  var keyboardType: js.UndefOr[js.Any] = js.native
  var styles: js.UndefOr[js.Any] = js.native
  var upStyle: js.UndefOr[js.Any] = js.native
}

object PropsType {
  @scala.inline
  def apply(): PropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
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
    def setDownStyle(value: js.Any): Self = this.set("downStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownStyle: Self = this.set("downStyle", js.undefined)
    @scala.inline
    def setInputStyle(value: js.Any): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setKeyboardType(value: js.Any): Self = this.set("keyboardType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardType: Self = this.set("keyboardType", js.undefined)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setUpStyle(value: js.Any): Self = this.set("upStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpStyle: Self = this.set("upStyle", js.undefined)
  }
  
}

