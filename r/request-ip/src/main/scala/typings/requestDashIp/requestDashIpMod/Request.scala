package typings.requestDashIp.requestDashIpMod

import typings.requestDashIp.Anon_RemoteAddress
import typings.requestDashIp.Anon_RemoteAddressSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var connection: Anon_RemoteAddressSocket
  var headers: RequestHeaders
  var info: js.UndefOr[Anon_RemoteAddress] = js.undefined
  var socket: js.UndefOr[Anon_RemoteAddress] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    connection: Anon_RemoteAddressSocket,
    headers: RequestHeaders,
    info: Anon_RemoteAddress = null,
    socket: Anon_RemoteAddress = null
  ): Request = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

