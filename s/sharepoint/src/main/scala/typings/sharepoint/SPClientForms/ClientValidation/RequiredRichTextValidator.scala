package typings.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredRichTextValidator extends IValidator

object RequiredRichTextValidator {
  @scala.inline
  def apply(Validate: js.Any => ValidationResult): RequiredRichTextValidator = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
    __obj.asInstanceOf[RequiredRichTextValidator]
  }
}

