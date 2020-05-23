package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscriptionOptionsInit extends js.Object {
  var applicationServerKey: js.UndefOr[BufferSource | java.lang.String | Null] = js.undefined
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PushSubscriptionOptionsInit {
  @scala.inline
  def apply(
    applicationServerKey: js.UndefOr[Null | BufferSource | java.lang.String] = js.undefined,
    userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationServerKey)) __obj.updateDynamic("applicationServerKey")(applicationServerKey.asInstanceOf[js.Any])
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
}

