package typings.storybookApi.notificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubState extends js.Object {
  var notifications: js.Array[Notification] = js.native
}

object SubState {
  @scala.inline
  def apply(notifications: js.Array[Notification]): SubState = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
  }
  
}

