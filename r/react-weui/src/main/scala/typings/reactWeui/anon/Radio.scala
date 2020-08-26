package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radio extends js.Object {
  var checkbox: Boolean = js.native
  var radio: Boolean = js.native
  var select: Boolean = js.native
  var selectPos: js.Any = js.native
  var switch: Boolean = js.native
  var vcode: Boolean = js.native
  var warn: Boolean = js.native
}

object Radio {
  @scala.inline
  def apply(
    checkbox: Boolean,
    radio: Boolean,
    select: Boolean,
    selectPos: js.Any,
    switch: Boolean,
    vcode: Boolean,
    warn: Boolean
  ): Radio = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectPos = selectPos.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], vcode = vcode.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radio]
  }
  @scala.inline
  implicit class RadioOps[Self <: Radio] (val x: Self) extends AnyVal {
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
    def setCheckbox(value: Boolean): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadio(value: Boolean): Self = this.set("radio", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectPos(value: js.Any): Self = this.set("selectPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitch(value: Boolean): Self = this.set("switch", value.asInstanceOf[js.Any])
    @scala.inline
    def setVcode(value: Boolean): Self = this.set("vcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarn(value: Boolean): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
  
}

