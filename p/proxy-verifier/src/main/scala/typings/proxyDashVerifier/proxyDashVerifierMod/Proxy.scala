package typings.proxyDashVerifier.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  /**
  	 * Proxy-Authorization header
  	 */
  var auth: js.UndefOr[String] = js.undefined
  var ipAddress: String
  var port: Double
  var protocol: js.UndefOr[Protocol] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}

object Proxy {
  @scala.inline
  def apply(
    ipAddress: String,
    port: Double,
    auth: String = null,
    protocol: Protocol = null,
    protocols: js.Array[Protocol] = null
  ): Proxy = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
}

