package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionFixedResponse extends StObject {
  
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: Input[String]
  
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: js.UndefOr[Input[String]] = js.undefined
}
object ListenerRuleActionFixedResponse {
  
  inline def apply(contentType: Input[String]): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
  
  extension [Self <: ListenerRuleActionFixedResponse](x: Self) {
    
    inline def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setMessageBody(value: Input[String]): Self = StObject.set(x, "messageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyUndefined: Self = StObject.set(x, "messageBody", js.undefined)
    
    inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
