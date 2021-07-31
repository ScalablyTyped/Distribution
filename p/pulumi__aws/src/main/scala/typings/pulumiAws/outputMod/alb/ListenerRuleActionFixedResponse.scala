package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionFixedResponse extends StObject {
  
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: String
  
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: String
}
object ListenerRuleActionFixedResponse {
  
  @scala.inline
  def apply(contentType: String, statusCode: String): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
  
  @scala.inline
  implicit class ListenerRuleActionFixedResponseMutableBuilder[Self <: ListenerRuleActionFixedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBody(value: String): Self = StObject.set(x, "messageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBodyUndefined: Self = StObject.set(x, "messageBody", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
