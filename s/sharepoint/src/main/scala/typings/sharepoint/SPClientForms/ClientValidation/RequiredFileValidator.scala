package typings.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredFileValidator extends IValidator

object RequiredFileValidator {
  @scala.inline
  def apply(Validate: js.Any => ValidationResult): RequiredFileValidator = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
    __obj.asInstanceOf[RequiredFileValidator]
  }
}

