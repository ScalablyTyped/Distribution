package typings.reactForm.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormApiValidator extends js.Object {
  var formApi: Validator[_] = js.native
}

object FormApiValidator {
  @scala.inline
  def apply(formApi: Validator[_]): FormApiValidator = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormApiValidator]
  }
  @scala.inline
  implicit class FormApiValidatorOps[Self <: FormApiValidator] (val x: Self) extends AnyVal {
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
    def setFormApi(value: Validator[_]): Self = this.set("formApi", value.asInstanceOf[js.Any])
  }
  
}

