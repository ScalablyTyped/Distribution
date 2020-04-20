package typings.protooServer.mod

import typings.protooServer.protooServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtooNotification extends js.Object {
  var data: js.Any
  var method: String
  var notification: `true`
}

object ProtooNotification {
  @scala.inline
  def apply(data: js.Any, method: String, notification: `true`): ProtooNotification = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtooNotification]
  }
}

