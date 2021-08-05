package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateError
  extends StObject
     with Error {
  
  var errors: js.Array[js.Any]
}
object AggregateError {
  
  inline def apply(errors: js.Array[js.Any], message: java.lang.String, name: java.lang.String): AggregateError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateError]
  }
  
  extension [Self <: AggregateError](x: Self) {
    
    inline def setErrors(value: js.Array[js.Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
