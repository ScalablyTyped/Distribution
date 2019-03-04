package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOutRequest extends js.Object {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
  var useCache: js.UndefOr[scala.Boolean] = js.undefined
}

object PublishOutRequest {
  @scala.inline
  def apply(
    socket: socketclusterDashServerLib.scserversocketMod.namespaced,
    channel: java.lang.String = null,
    data: js.Any = null,
    useCache: js.UndefOr[scala.Boolean] = js.undefined
  ): PublishOutRequest = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    __obj.asInstanceOf[PublishOutRequest]
  }
}

