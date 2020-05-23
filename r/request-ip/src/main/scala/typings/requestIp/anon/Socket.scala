package typings.requestIp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.undefined
  var socket: js.UndefOr[RemoteAddress] = js.undefined
}

object Socket {
  @scala.inline
  def apply(remoteAddress: String = null, socket: RemoteAddress = null): Socket = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socket]
  }
}

