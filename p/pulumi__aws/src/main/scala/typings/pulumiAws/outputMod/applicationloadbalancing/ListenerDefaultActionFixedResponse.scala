package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionFixedResponse extends StObject {
  
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
object ListenerDefaultActionFixedResponse {
  
  inline def apply(contentType: String, statusCode: String): ListenerDefaultActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionFixedResponse]
  }
  
  extension [Self <: ListenerDefaultActionFixedResponse](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setMessageBody(value: String): Self = StObject.set(x, "messageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyUndefined: Self = StObject.set(x, "messageBody", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
