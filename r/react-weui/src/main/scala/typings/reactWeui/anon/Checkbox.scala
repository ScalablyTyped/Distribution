package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox extends js.Object {
  var checkbox: Boolean = js.native
  var radio: Boolean = js.native
}

object Checkbox {
  @scala.inline
  def apply(checkbox: Boolean, radio: Boolean): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  @scala.inline
  implicit class CheckboxOps[Self <: Checkbox] (val x: Self) extends AnyVal {
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
  }
  
}

