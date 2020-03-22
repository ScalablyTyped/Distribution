package typings.rcNotification.notificationMod

import typings.rcNotification.AnonHolderCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationState extends js.Object {
  var notices: js.Array[AnonHolderCallback]
}

object NotificationState {
  @scala.inline
  def apply(notices: js.Array[AnonHolderCallback]): NotificationState = {
    val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationState]
  }
}

