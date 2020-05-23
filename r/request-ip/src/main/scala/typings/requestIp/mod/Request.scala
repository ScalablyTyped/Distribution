package typings.requestIp.mod

import typings.requestIp.anon.RemoteAddress
import typings.requestIp.anon.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var connection: Socket
  var headers: RequestHeaders
  var info: js.UndefOr[RemoteAddress] = js.undefined
  var socket: js.UndefOr[RemoteAddress] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    connection: Socket,
    headers: RequestHeaders,
    info: RemoteAddress = null,
    socket: RemoteAddress = null
  ): Request = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

