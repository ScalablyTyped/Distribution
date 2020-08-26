package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types_ extends js.Object {
  var ADD_NOTIFICATION: typings.reapop.mod.ADD_NOTIFICATION = js.native
  var REMOVE_NOTIFICATION: typings.reapop.mod.REMOVE_NOTIFICATION = js.native
  var REMOVE_NOTIFICATIONS: typings.reapop.mod.REMOVE_NOTIFICATIONS = js.native
  var UPDATE_NOTIFICATION: typings.reapop.mod.UPDATE_NOTIFICATION = js.native
}

object Types_ {
  @scala.inline
  def apply(
    ADD_NOTIFICATION: ADD_NOTIFICATION,
    REMOVE_NOTIFICATION: REMOVE_NOTIFICATION,
    REMOVE_NOTIFICATIONS: REMOVE_NOTIFICATIONS,
    UPDATE_NOTIFICATION: UPDATE_NOTIFICATION
  ): Types_ = {
    val __obj = js.Dynamic.literal(ADD_NOTIFICATION = ADD_NOTIFICATION.asInstanceOf[js.Any], REMOVE_NOTIFICATION = REMOVE_NOTIFICATION.asInstanceOf[js.Any], REMOVE_NOTIFICATIONS = REMOVE_NOTIFICATIONS.asInstanceOf[js.Any], UPDATE_NOTIFICATION = UPDATE_NOTIFICATION.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types_]
  }
  @scala.inline
  implicit class Types_Ops[Self <: Types_] (val x: Self) extends AnyVal {
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
    def setADD_NOTIFICATION(value: ADD_NOTIFICATION): Self = this.set("ADD_NOTIFICATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setREMOVE_NOTIFICATION(value: REMOVE_NOTIFICATION): Self = this.set("REMOVE_NOTIFICATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setREMOVE_NOTIFICATIONS(value: REMOVE_NOTIFICATIONS): Self = this.set("REMOVE_NOTIFICATIONS", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPDATE_NOTIFICATION(value: UPDATE_NOTIFICATION): Self = this.set("UPDATE_NOTIFICATION", value.asInstanceOf[js.Any])
  }
  
}

