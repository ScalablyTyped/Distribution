package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingWebhookCall[T] extends StObject {
  
  var headers: IncomingWebhookHttpHeaders
  
  var params: T
  
  var url: IncomingWebhookUrl
}
object IncomingWebhookCall {
  
  inline def apply[T](headers: IncomingWebhookHttpHeaders, params: T, url: IncomingWebhookUrl): IncomingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingWebhookCall[T]]
  }
  
  extension [Self <: IncomingWebhookCall[?], T](x: Self & IncomingWebhookCall[T]) {
    
    inline def setHeaders(value: IncomingWebhookHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: IncomingWebhookUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
