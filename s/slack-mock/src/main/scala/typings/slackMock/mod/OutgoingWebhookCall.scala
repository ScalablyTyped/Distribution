package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingWebhookCall[T] extends StObject {
  
  var headers: OutgoingWebhookHttpHeaders
  
  var params: T
  
  var statusCode: Double
  
  var url: OutgoingWebhookUrl
}
object OutgoingWebhookCall {
  
  @scala.inline
  def apply[T](headers: OutgoingWebhookHttpHeaders, params: T, statusCode: Double, url: OutgoingWebhookUrl): OutgoingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingWebhookCall[T]]
  }
  
  @scala.inline
  implicit class OutgoingWebhookCallMutableBuilder[Self <: OutgoingWebhookCall[?], T] (val x: Self & OutgoingWebhookCall[T]) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: OutgoingWebhookHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: OutgoingWebhookUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
