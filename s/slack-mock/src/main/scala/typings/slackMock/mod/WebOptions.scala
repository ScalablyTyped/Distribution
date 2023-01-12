package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebOptions[T] extends StObject {
  
  var body: js.UndefOr[T] = js.undefined
  
  var headers: js.UndefOr[WebHttpHeaders] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[WebUrl] = js.undefined
}
object WebOptions {
  
  inline def apply[T](): WebOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebOptions[?], T] (val x: Self & WebOptions[T]) extends AnyVal {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: WebHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setUrl(value: WebUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
