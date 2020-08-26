package typings.rcPicker.pickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerRefConfig extends js.Object {
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

object PickerRefConfig {
  @scala.inline
  def apply(blur: () => Unit, focus: () => Unit): PickerRefConfig = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[PickerRefConfig]
  }
  @scala.inline
  implicit class PickerRefConfigOps[Self <: PickerRefConfig] (val x: Self) extends AnyVal {
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
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
  }
  
}

