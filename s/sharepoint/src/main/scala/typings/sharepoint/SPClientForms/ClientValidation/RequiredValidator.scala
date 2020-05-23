package typings.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredValidator extends IValidator

object RequiredValidator {
  @scala.inline
  def apply(Validate: js.Any => ValidationResult): RequiredValidator = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
    __obj.asInstanceOf[RequiredValidator]
  }
}

