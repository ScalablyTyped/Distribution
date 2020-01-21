package typings.requestIp.mod

import typings.requestIp.AnonRemoteAddress
import typings.requestIp.AnonRemoteAddressSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var connection: AnonRemoteAddressSocket
  var headers: RequestHeaders
  var info: js.UndefOr[AnonRemoteAddress] = js.undefined
  var socket: js.UndefOr[AnonRemoteAddress] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    connection: AnonRemoteAddressSocket,
    headers: RequestHeaders,
    info: AnonRemoteAddress = null,
    socket: AnonRemoteAddress = null
  ): Request = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

