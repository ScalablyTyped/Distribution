package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-jsonschema-form.react-jsonschema-form.FieldValidation & {[fieldName: string] : react-jsonschema-form.react-jsonschema-form.FieldValidation} */
@js.native
trait FormValidation extends /* fieldName */ StringDictionary[FieldValidation] {
  
  var __errors: js.Array[FieldError] = js.native
  
  def addError(message: String): Unit = js.native
}
object FormValidation {
  
  @scala.inline
  def apply(__errors: js.Array[FieldError], addError: String => Unit): FormValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any], addError = js.Any.fromFunction1(addError))
    __obj.asInstanceOf[FormValidation]
  }
  
  @scala.inline
  implicit class FormValidationMutableBuilder[Self <: FormValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddError(value: String => Unit): Self = StObject.set(x, "addError", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__errors(value: js.Array[FieldError]): Self = StObject.set(x, "__errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__errorsVarargs(value: FieldError*): Self = StObject.set(x, "__errors", js.Array(value :_*))
  }
}
