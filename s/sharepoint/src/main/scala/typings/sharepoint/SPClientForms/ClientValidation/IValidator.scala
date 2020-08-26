package typings.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IValidator extends js.Object {
  def Validate(value: js.Any): ValidationResult = js.native
}

object IValidator {
  @scala.inline
  def apply(Validate: js.Any => ValidationResult): IValidator = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
    __obj.asInstanceOf[IValidator]
  }
  @scala.inline
  implicit class IValidatorOps[Self <: IValidator] (val x: Self) extends AnyVal {
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
    def setValidate(value: js.Any => ValidationResult): Self = this.set("Validate", js.Any.fromFunction1(value))
  }
  
}

