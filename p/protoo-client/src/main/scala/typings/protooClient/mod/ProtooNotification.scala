package typings.protooClient.mod

import typings.protooClient.protooClientBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtooNotification extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var method: String
  var notification: `true`
}

object ProtooNotification {
  @scala.inline
  def apply(method: String, notification: `true`, data: js.Any = null): ProtooNotification = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtooNotification]
  }
}

