package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that describes the list of errors for a field */
trait FieldErrors extends StObject {
  
  /** The list of errors for the field */
  var __errors: js.UndefOr[js.Array[FieldError]] = js.undefined
}
object FieldErrors {
  
  inline def apply(): FieldErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldErrors] (val x: Self) extends AnyVal {
    
    inline def set__errors(value: js.Array[FieldError]): Self = StObject.set(x, "__errors", value.asInstanceOf[js.Any])
    
    inline def set__errorsUndefined: Self = StObject.set(x, "__errors", js.undefined)
    
    inline def set__errorsVarargs(value: FieldError*): Self = StObject.set(x, "__errors", js.Array(value*))
  }
}
