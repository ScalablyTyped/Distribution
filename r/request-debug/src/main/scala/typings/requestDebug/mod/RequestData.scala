package typings.requestDebug.mod

import typings.request.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestData extends LogData {
  var body: js.UndefOr[js.Any] = js.native
  var debugId: Double = js.native
  var headers: Headers = js.native
  var method: String = js.native
  var uri: String = js.native
}

object RequestData {
  @scala.inline
  def apply(debugId: Double, headers: Headers, method: String, uri: String): RequestData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestData]
  }
  @scala.inline
  implicit class RequestDataOps[Self <: RequestData] (val x: Self) extends AnyVal {
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
    def setDebugId(value: Double): Self = this.set("debugId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

