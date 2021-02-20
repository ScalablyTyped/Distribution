package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCall[T] extends StObject {
  
  var headers: EventHttpHeaders = js.native
  
  var params: T = js.native
  
  var statusCode: Double = js.native
  
  var url: EventUrl = js.native
}
object EventCall {
  
  @scala.inline
  def apply[T](headers: EventHttpHeaders, params: T, statusCode: Double, url: EventUrl): EventCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCall[T]]
  }
  
  @scala.inline
  implicit class EventCallMutableBuilder[Self <: EventCall[_], T] (val x: Self with EventCall[T]) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: EventHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: EventUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
