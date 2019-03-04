package typings
package requestDashIpLib.requestDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var connection: requestDashIpLib.Anon_RemoteAddressSocket
  var headers: RequestHeaders
  var info: js.UndefOr[requestDashIpLib.Anon_RemoteAddress] = js.undefined
  var socket: js.UndefOr[requestDashIpLib.Anon_RemoteAddress] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    connection: requestDashIpLib.Anon_RemoteAddressSocket,
    headers: RequestHeaders,
    info: requestDashIpLib.Anon_RemoteAddress = null,
    socket: requestDashIpLib.Anon_RemoteAddress = null
  ): Request = {
    val __obj = js.Dynamic.literal(connection = connection, headers = headers)
    if (info != null) __obj.updateDynamic("info")(info)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[Request]
  }
}

