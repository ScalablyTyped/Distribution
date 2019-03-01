package typings
package requestDashIpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoteAddressSocket extends js.Object {
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  var socket: js.UndefOr[Anon_RemoteAddress] = js.undefined
}

object Anon_RemoteAddressSocket {
  @scala.inline
  def apply(remoteAddress: java.lang.String = null, socket: Anon_RemoteAddress = null): Anon_RemoteAddressSocket = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[Anon_RemoteAddressSocket]
  }
}

