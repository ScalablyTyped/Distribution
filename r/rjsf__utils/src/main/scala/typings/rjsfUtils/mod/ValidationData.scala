package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that describes the data that is returned from the `ValidatorType.validateFormData()` function */
trait ValidationData[T] extends StObject {
  
  /** The validation errors in the form of an `ErrorSchema` */
  var errorSchema: ErrorSchema[T]
  
  /** The validation errors as a list of `RJSFValidationError` objects */
  var errors: js.Array[RJSFValidationError]
}
object ValidationData {
  
  inline def apply[T](errorSchema: ErrorSchema[T], errors: js.Array[RJSFValidationError]): ValidationData[T] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationData[?], T] (val x: Self & ValidationData[T]) extends AnyVal {
    
    inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[RJSFValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: RJSFValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
