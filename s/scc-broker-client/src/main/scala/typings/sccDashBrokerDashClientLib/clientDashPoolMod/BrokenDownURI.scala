package typings
package sccDashBrokerDashClientLib.clientDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokenDownURI extends js.Object {
  var hostname: java.lang.String
  var port: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[sccDashBrokerDashClientLib.sccDashBrokerDashClientLibNumbers.`true`] = js.undefined
}

object BrokenDownURI {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    port: java.lang.String = null,
    secure: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibNumbers.`true` = null
  ): BrokenDownURI = {
    val __obj = js.Dynamic.literal(hostname = hostname)
    if (port != null) __obj.updateDynamic("port")(port)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[BrokenDownURI]
  }
}

