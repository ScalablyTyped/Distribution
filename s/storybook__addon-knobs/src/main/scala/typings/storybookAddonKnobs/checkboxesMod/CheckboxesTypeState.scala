package typings.storybookAddonKnobs.checkboxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesTypeState extends js.Object {
  var values: CheckboxesTypeKnobValue = js.native
}

object CheckboxesTypeState {
  @scala.inline
  def apply(values: CheckboxesTypeKnobValue): CheckboxesTypeState = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxesTypeState]
  }
  @scala.inline
  implicit class CheckboxesTypeStateOps[Self <: CheckboxesTypeState] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: CheckboxesTypeKnobValue): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

