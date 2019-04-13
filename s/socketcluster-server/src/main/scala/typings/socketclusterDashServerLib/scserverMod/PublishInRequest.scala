package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishInRequest extends js.Object {
  var ackData: js.UndefOr[js.Any] = js.undefined
  var authTokenExpiredError: js.UndefOr[stdLib.Error] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: socketclusterDashServerLib.scserversocketMod.^
}

object PublishInRequest {
  @scala.inline
  def apply(
    socket: socketclusterDashServerLib.scserversocketMod.^,
    ackData: js.Any = null,
    authTokenExpiredError: stdLib.Error = null,
    channel: java.lang.String = null,
    data: js.Any = null
  ): PublishInRequest = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (ackData != null) __obj.updateDynamic("ackData")(ackData)
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[PublishInRequest]
  }
}

