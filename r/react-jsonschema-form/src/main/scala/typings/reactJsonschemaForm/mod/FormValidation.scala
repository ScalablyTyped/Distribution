package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormValidation
  extends StObject
     with FieldValidation
     with /* fieldName */ StringDictionary[FieldValidation]
object FormValidation {
  
  inline def apply(__errors: js.Array[FieldError], addError: String => Unit): FormValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any], addError = js.Any.fromFunction1(addError))
    __obj.asInstanceOf[FormValidation]
  }
}
