package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseStatus extends StObject {
  
  var errorCode: String = js.native
  
  var errors: js.Array[ResponseError] = js.native
  
  var message: String = js.native
  
  var stackTrace: String = js.native
}
object ResponseStatus {
  
  @scala.inline
  def apply(errorCode: String, errors: js.Array[ResponseError], message: String, stackTrace: String): ResponseStatus = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseStatus]
  }
  
  @scala.inline
  implicit class ResponseStatusMutableBuilder[Self <: ResponseStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[ResponseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ResponseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
  }
}
