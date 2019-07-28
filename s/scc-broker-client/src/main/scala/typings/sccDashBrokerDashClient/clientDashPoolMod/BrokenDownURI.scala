package typings.sccDashBrokerDashClient.clientDashPoolMod

import typings.sccDashBrokerDashClient.sccDashBrokerDashClientNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokenDownURI extends js.Object {
  var hostname: String
  var port: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[`true`] = js.undefined
}

object BrokenDownURI {
  @scala.inline
  def apply(hostname: String, port: String = null, secure: `true` = null): BrokenDownURI = {
    val __obj = js.Dynamic.literal(hostname = hostname)
    if (port != null) __obj.updateDynamic("port")(port)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[BrokenDownURI]
  }
}

