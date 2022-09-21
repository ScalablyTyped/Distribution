package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Type that describes the list of errors for a field being actively validated by a custom validator */
trait FieldValidation
  extends StObject
     with FieldErrors {
  
  /** Function that will add a new `message` to the list of errors */
  def addError(message: String): Unit
}
object FieldValidation {
  
  inline def apply(addError: String => Unit): FieldValidation = {
    val __obj = js.Dynamic.literal(addError = js.Any.fromFunction1(addError))
    __obj.asInstanceOf[FieldValidation]
  }
  
  extension [Self <: FieldValidation](x: Self) {
    
    inline def setAddError(value: String => Unit): Self = StObject.set(x, "addError", js.Any.fromFunction1(value))
  }
}
