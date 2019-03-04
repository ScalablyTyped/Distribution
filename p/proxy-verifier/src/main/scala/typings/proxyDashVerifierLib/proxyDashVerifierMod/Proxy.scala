package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  /**
  	 * Proxy-Authorization header
  	 */
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var ipAddress: java.lang.String
  var port: scala.Double
  var protocol: js.UndefOr[Protocol] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}

object Proxy {
  @scala.inline
  def apply(
    ipAddress: java.lang.String,
    port: scala.Double,
    auth: java.lang.String = null,
    protocol: Protocol = null,
    protocols: js.Array[Protocol] = null
  ): Proxy = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress, port = port)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    __obj.asInstanceOf[Proxy]
  }
}

