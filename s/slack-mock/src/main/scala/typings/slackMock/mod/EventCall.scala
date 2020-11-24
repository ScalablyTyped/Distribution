package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCall[T] extends js.Object {
  
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
  implicit class EventCallOps[Self <: EventCall[_], T] (val x: Self with EventCall[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeaders(value: EventHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: EventUrl): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
