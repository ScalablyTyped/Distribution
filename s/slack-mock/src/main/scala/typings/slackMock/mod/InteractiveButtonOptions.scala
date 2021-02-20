package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractiveButtonOptions[T] extends StObject {
  
  var body: js.UndefOr[T] = js.native
  
  var headers: js.UndefOr[InteractiveButtonHttpHeaders] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[InteractiveButtonUrl] = js.native
}
object InteractiveButtonOptions {
  
  @scala.inline
  def apply[T](): InteractiveButtonOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveButtonOptions[T]]
  }
  
  @scala.inline
  implicit class InteractiveButtonOptionsMutableBuilder[Self <: InteractiveButtonOptions[_], T] (val x: Self with InteractiveButtonOptions[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: InteractiveButtonHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: InteractiveButtonUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
