package typings.socketclusterDashServer.scserverMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyHandshakeInfo extends js.Object {
  var origin: js.UndefOr[String] = js.undefined
  var req: IncomingMessage
}

object VerifyHandshakeInfo {
  @scala.inline
  def apply(req: IncomingMessage, origin: String = null): VerifyHandshakeInfo = {
    val __obj = js.Dynamic.literal(req = req)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[VerifyHandshakeInfo]
  }
}

