package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebCall[T] extends StObject {
  
  var headers: WebHttpHeaders
  
  var params: T
  
  var url: WebUrl
}
object WebCall {
  
  inline def apply[T](headers: WebHttpHeaders, params: T, url: WebUrl): WebCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCall[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebCall[?], T] (val x: Self & WebCall[T]) extends AnyVal {
    
    inline def setHeaders(value: WebHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: WebUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
