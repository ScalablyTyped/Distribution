package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-jsonschema-form.react-jsonschema-form.FieldValidation & {[fieldName: string] : react-jsonschema-form.react-jsonschema-form.FieldValidation} */
trait FormValidation extends /* fieldName */ StringDictionary[FieldValidation] {
  var __errors: js.Array[FieldError]
  def addError(message: String): Unit
}

object FormValidation {
  @scala.inline
  def apply(
    __errors: js.Array[FieldError],
    addError: String => Unit,
    StringDictionary: /* fieldName */ StringDictionary[FieldValidation] = null
  ): FormValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any], addError = js.Any.fromFunction1(addError))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FormValidation]
  }
}

