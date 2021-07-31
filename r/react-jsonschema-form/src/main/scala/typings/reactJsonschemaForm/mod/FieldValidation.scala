package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValidation extends StObject {
  
  var __errors: js.Array[FieldError]
  
  def addError(message: String): Unit
}
object FieldValidation {
  
  @scala.inline
  def apply(__errors: js.Array[FieldError], addError: String => Unit): FieldValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any], addError = js.Any.fromFunction1(addError))
    __obj.asInstanceOf[FieldValidation]
  }
  
  @scala.inline
  implicit class FieldValidationMutableBuilder[Self <: FieldValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddError(value: String => Unit): Self = StObject.set(x, "addError", js.Any.fromFunction1(value))
    
    @scala.inline
    def set__errors(value: js.Array[FieldError]): Self = StObject.set(x, "__errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__errorsVarargs(value: FieldError*): Self = StObject.set(x, "__errors", js.Array(value :_*))
  }
}
