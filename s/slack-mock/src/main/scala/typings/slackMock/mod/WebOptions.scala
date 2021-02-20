package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebOptions[T] extends StObject {
  
  var body: js.UndefOr[T] = js.native
  
  var headers: js.UndefOr[WebHttpHeaders] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[WebUrl] = js.native
}
object WebOptions {
  
  @scala.inline
  def apply[T](): WebOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebOptions[T]]
  }
  
  @scala.inline
  implicit class WebOptionsMutableBuilder[Self <: WebOptions[_], T] (val x: Self with WebOptions[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: WebHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: WebUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
