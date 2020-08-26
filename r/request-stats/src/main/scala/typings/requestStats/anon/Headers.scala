package typings.requestStats.anon

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  /**
    * Number of bytes sent back to the client
    */
  var bytes: Double = js.native
  /**
    * The headers sent back to the client
    */
  var headers: OutgoingHttpHeaders = js.native
  /**
    * The original `http.ServerResponse` object
    */
  var raw: ServerResponse = js.native
  /**
    * The HTTP status code returned to the client
    */
  var status: Double = js.native
}

object Headers {
  @scala.inline
  def apply(bytes: Double, headers: OutgoingHttpHeaders, raw: ServerResponse, status: Double): Headers = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: ServerResponse): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

