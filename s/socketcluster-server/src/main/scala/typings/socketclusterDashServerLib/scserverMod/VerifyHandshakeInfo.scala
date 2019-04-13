package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyHandshakeInfo extends js.Object {
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var req: nodeLib.httpMod.IncomingMessage
}

object VerifyHandshakeInfo {
  @scala.inline
  def apply(req: nodeLib.httpMod.IncomingMessage, origin: java.lang.String = null): VerifyHandshakeInfo = {
    val __obj = js.Dynamic.literal(req = req)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[VerifyHandshakeInfo]
  }
}

