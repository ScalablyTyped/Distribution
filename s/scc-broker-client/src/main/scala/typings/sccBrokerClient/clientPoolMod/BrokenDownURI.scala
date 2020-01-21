package typings.sccBrokerClient.clientPoolMod

import typings.sccBrokerClient.sccBrokerClientBooleans.`true`
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
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokenDownURI]
  }
}

