package typings.rcSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Combobox extends js.Object {
  var combobox: Boolean = js.native
  var labelInValue: Boolean = js.native
}

object Combobox {
  @scala.inline
  def apply(combobox: Boolean, labelInValue: Boolean): Combobox = {
    val __obj = js.Dynamic.literal(combobox = combobox.asInstanceOf[js.Any], labelInValue = labelInValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combobox]
  }
  @scala.inline
  implicit class ComboboxOps[Self <: Combobox] (val x: Self) extends AnyVal {
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
    def setCombobox(value: Boolean): Self = this.set("combobox", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelInValue(value: Boolean): Self = this.set("labelInValue", value.asInstanceOf[js.Any])
  }
  
}

