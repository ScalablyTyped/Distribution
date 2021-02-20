package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebCall[T] extends StObject {
  
  var headers: WebHttpHeaders = js.native
  
  var params: T = js.native
  
  var url: WebUrl = js.native
}
object WebCall {
  
  @scala.inline
  def apply[T](headers: WebHttpHeaders, params: T, url: WebUrl): WebCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCall[T]]
  }
  
  @scala.inline
  implicit class WebCallMutableBuilder[Self <: WebCall[_], T] (val x: Self with WebCall[T]) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: WebHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: WebUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
