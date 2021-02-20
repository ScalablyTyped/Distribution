package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateError extends Error {
  
  var errors: js.Array[_] = js.native
}
object AggregateError {
  
  @scala.inline
  def apply(errors: js.Array[_], message: java.lang.String, name: java.lang.String): AggregateError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateError]
  }
  
  @scala.inline
  implicit class AggregateErrorMutableBuilder[Self <: AggregateError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
