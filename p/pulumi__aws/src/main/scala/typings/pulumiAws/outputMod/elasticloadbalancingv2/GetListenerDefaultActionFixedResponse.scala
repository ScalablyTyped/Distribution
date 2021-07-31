package typings.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListenerDefaultActionFixedResponse extends StObject {
  
  var contentType: String
  
  var messageBody: String
  
  var statusCode: String
}
object GetListenerDefaultActionFixedResponse {
  
  @scala.inline
  def apply(contentType: String, messageBody: String, statusCode: String): GetListenerDefaultActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], messageBody = messageBody.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionFixedResponse]
  }
  
  @scala.inline
  implicit class GetListenerDefaultActionFixedResponseMutableBuilder[Self <: GetListenerDefaultActionFixedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBody(value: String): Self = StObject.set(x, "messageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
