package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class FormValidationOps[Self <: FormValidation] (val x: Self) extends AnyVal {
    
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
    def set__errorsVarargs(value: FieldError*): Self = this.set("__errors", js.Array(value :_*))
    
    @scala.inline
    def set__errors(value: js.Array[FieldError]): Self = this.set("__errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddError(value: String => Unit): Self = this.set("addError", js.Any.fromFunction1(value))
  }
}
