package typings.reapop.mod

import typings.reapop.anon.Payload
import typings.reapop.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
@js.native
trait Actions_ extends js.Object {
  def addNotification(notification: Notification): Notification = js.native
  def removeNotification(notification: Notification): Payload = js.native
  def removeNotifications(): Type = js.native
  def updateNotification(notification: Notification): Notification = js.native
}

object Actions_ {
  @scala.inline
  def apply(
    addNotification: Notification => Notification,
    removeNotification: Notification => Payload,
    removeNotifications: () => Type,
    updateNotification: Notification => Notification
  ): Actions_ = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), removeNotification = js.Any.fromFunction1(removeNotification), removeNotifications = js.Any.fromFunction0(removeNotifications), updateNotification = js.Any.fromFunction1(updateNotification))
    __obj.asInstanceOf[Actions_]
  }
  @scala.inline
  implicit class Actions_Ops[Self <: Actions_] (val x: Self) extends AnyVal {
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
    def setAddNotification(value: Notification => Notification): Self = this.set("addNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNotification(value: Notification => Payload): Self = this.set("removeNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNotifications(value: () => Type): Self = this.set("removeNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateNotification(value: Notification => Notification): Self = this.set("updateNotification", js.Any.fromFunction1(value))
  }
  
}

