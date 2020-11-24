package typings.snekfetch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnekfetchResponse extends js.Object {
  
  var body: String | js.Object | Buffer = js.native
  
  var headers: StringDictionary[js.Any] = js.native
  
  var ok: Boolean = js.native
  
  var raw: Buffer = js.native
  
  var request: ClientRequest = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
}
object SnekfetchResponse {
  
  @scala.inline
  def apply(
    body: String | js.Object | Buffer,
    headers: StringDictionary[js.Any],
    ok: Boolean,
    raw: Buffer,
    request: ClientRequest,
    status: Double,
    statusText: String
  ): SnekfetchResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnekfetchResponse]
  }
  
  @scala.inline
  implicit class SnekfetchResponseOps[Self <: SnekfetchResponse] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String | js.Object | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Buffer): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ClientRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
  }
}
