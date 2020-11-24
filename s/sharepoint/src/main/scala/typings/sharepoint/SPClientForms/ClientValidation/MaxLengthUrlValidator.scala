package typings.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxLengthUrlValidator extends IValidator
object MaxLengthUrlValidator {
  
  @scala.inline
  def apply(Validate: js.Any => ValidationResult): MaxLengthUrlValidator = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
    __obj.asInstanceOf[MaxLengthUrlValidator]
  }
}
