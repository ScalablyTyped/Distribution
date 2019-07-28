package typings.requestDashIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoteAddressSocket extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.undefined
  var socket: js.UndefOr[Anon_RemoteAddress] = js.undefined
}

object Anon_RemoteAddressSocket {
  @scala.inline
  def apply(remoteAddress: String = null, socket: Anon_RemoteAddress = null): Anon_RemoteAddressSocket = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[Anon_RemoteAddressSocket]
  }
}

