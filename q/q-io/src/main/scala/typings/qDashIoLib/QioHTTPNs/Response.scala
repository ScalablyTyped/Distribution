package typings
package qDashIoLib.QioHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: qDashIoLib.QioNs.Reader
  var headers: Headers
  var node: js.Any
  var status: scala.Double
  def onclose(): scala.Unit
}

object Response {
  @scala.inline
  def apply(
    body: qDashIoLib.QioNs.Reader,
    headers: Headers,
    node: js.Any,
    onclose: js.Function0[scala.Unit],
    status: scala.Double
  ): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("onclose")(onclose)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Response]
  }
}

