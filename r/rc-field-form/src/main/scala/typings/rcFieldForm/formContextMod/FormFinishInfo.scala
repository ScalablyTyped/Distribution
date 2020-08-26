package typings.rcFieldForm.formContextMod

import typings.rcFieldForm.interfaceMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFinishInfo extends js.Object {
  var forms: Forms = js.native
  var values: Store = js.native
}

object FormFinishInfo {
  @scala.inline
  def apply(forms: Forms, values: Store): FormFinishInfo = {
    val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFinishInfo]
  }
  @scala.inline
  implicit class FormFinishInfoOps[Self <: FormFinishInfo] (val x: Self) extends AnyVal {
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
    def setForms(value: Forms): Self = this.set("forms", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: Store): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

