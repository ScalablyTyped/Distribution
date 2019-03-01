package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishInRequest extends js.Object {
  var ackData: js.UndefOr[js.Any] = js.undefined
  var authTokenExpiredError: js.UndefOr[nodeLib.Error] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
}

object PublishInRequest {
  @scala.inline
  def apply(
    socket: socketclusterDashServerLib.scserversocketMod.namespaced,
    ackData: js.Any = null,
    authTokenExpiredError: nodeLib.Error = null,
    channel: java.lang.String = null,
    data: js.Any = null
  ): PublishInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socket")(socket)
    if (ackData != null) __obj.updateDynamic("ackData")(ackData)
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[PublishInRequest]
  }
}

