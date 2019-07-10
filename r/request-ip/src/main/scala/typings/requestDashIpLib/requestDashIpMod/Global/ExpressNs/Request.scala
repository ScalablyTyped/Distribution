package typings
package requestDashIpLib.requestDashIpMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var clientIp: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply(clientIp: java.lang.String = null): Request = {
    val __obj = js.Dynamic.literal()
    if (clientIp != null) __obj.updateDynamic("clientIp")(clientIp)
    __obj.asInstanceOf[Request]
  }
}

