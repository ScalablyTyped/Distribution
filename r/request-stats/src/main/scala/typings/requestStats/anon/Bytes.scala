package typings.requestStats.anon

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bytes extends js.Object {
  /**
    * Number of bytes sent by the client
    */
  var bytes: Double = js.native
  /**
    * The headers sent by the client
    */
  var headers: IncomingHttpHeaders = js.native
  /**
    * The remote ip
    */
  var ip: String = js.native
  /**
    * The HTTP method used by the client
    */
  var method: String = js.native
  /**
    * The path part of the request URL
    */
  var path: String = js.native
  /**
    * The original `http.IncomingMessage` object
    */
  var raw: IncomingMessage = js.native
}

object Bytes {
  @scala.inline
  def apply(
    bytes: Double,
    headers: IncomingHttpHeaders,
    ip: String,
    method: String,
    path: String,
    raw: IncomingMessage
  ): Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes]
  }
  @scala.inline
  implicit class BytesOps[Self <: Bytes] (val x: Self) extends AnyVal {
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
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: IncomingMessage): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

