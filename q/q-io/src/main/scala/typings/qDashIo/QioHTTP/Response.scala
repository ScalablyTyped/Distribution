package typings.qDashIo.QioHTTP

import typings.qDashIo.Qio.Reader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: Reader
  var headers: Headers
  var node: js.Any
  var status: Double
  def onclose(): Unit
}

object Response {
  @scala.inline
  def apply(body: Reader, headers: Headers, node: js.Any, onclose: () => Unit, status: Double): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], onclose = js.Any.fromFunction0(onclose), status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

