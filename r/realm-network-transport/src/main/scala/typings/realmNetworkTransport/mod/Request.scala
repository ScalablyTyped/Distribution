package typings.realmNetworkTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request[RequestBody] extends js.Object {
  
  var body: js.UndefOr[RequestBody | String] = js.native
  
  var headers: js.UndefOr[Headers] = js.native
  
  var method: Method = js.native
  
  var timeoutMs: js.UndefOr[Double] = js.native
  
  var url: String = js.native
}
object Request {
  
  @scala.inline
  def apply[RequestBody](method: Method, url: String): Request[RequestBody] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[RequestBody]]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request[_], RequestBody] (val x: Self with Request[RequestBody]) extends AnyVal {
    
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
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: RequestBody | String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutMs: Self = this.set("timeoutMs", js.undefined)
  }
}
