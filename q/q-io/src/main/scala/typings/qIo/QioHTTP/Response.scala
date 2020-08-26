package typings.qIo.QioHTTP

import typings.qIo.Qio.Reader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: Reader = js.native
  var headers: Headers = js.native
  var node: js.Any = js.native
  var status: Double = js.native
  def onclose(): Unit = js.native
}

object Response {
  @scala.inline
  def apply(body: Reader, headers: Headers, node: js.Any, onclose: () => Unit, status: Double): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], onclose = js.Any.fromFunction0(onclose), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setBody(value: Reader): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnclose(value: () => Unit): Self = this.set("onclose", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

