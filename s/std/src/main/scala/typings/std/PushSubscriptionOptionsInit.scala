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
    applicationServerKey: BufferSource | java.lang.String = null,
    userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    if (applicationServerKey != null) __obj.updateDynamic("applicationServerKey")(applicationServerKey.asInstanceOf[js.Any])
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly)
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
}

