package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseError extends StObject {
  
  var errorCode: String
  
  var fieldName: String
  
  var message: String
}
object ResponseError {
  
  @scala.inline
  def apply(errorCode: String, fieldName: String, message: String): ResponseError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseError]
  }
  
  @scala.inline
  implicit class ResponseErrorMutableBuilder[Self <: ResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
