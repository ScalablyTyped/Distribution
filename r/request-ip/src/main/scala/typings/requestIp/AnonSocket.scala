package typings.requestIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocket extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.undefined
  var socket: js.UndefOr[AnonRemoteAddress] = js.undefined
}

object AnonSocket {
  @scala.inline
  def apply(remoteAddress: String = null, socket: AnonRemoteAddress = null): AnonSocket = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSocket]
  }
}

