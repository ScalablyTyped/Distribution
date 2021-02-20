package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleActionFixedResponse extends StObject {
  
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: Input[String] = js.native
  
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[Input[String]] = js.native
  
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: js.UndefOr[Input[String]] = js.native
}
object ListenerRuleActionFixedResponse {
  
  @scala.inline
  def apply(contentType: Input[String]): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
  
  @scala.inline
  implicit class ListenerRuleActionFixedResponseMutableBuilder[Self <: ListenerRuleActionFixedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBody(value: Input[String]): Self = StObject.set(x, "messageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBodyUndefined: Self = StObject.set(x, "messageBody", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
