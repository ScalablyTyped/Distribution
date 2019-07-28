package typings.reapop.reapopMod

import typings.reapop.ADD_NOTIFICATION
import typings.reapop.REMOVE_NOTIFICATION
import typings.reapop.REMOVE_NOTIFICATIONS
import typings.reapop.UPDATE_NOTIFICATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var ADD_NOTIFICATION: typings.reapop.ADD_NOTIFICATION
  var REMOVE_NOTIFICATION: typings.reapop.REMOVE_NOTIFICATION
  var REMOVE_NOTIFICATIONS: typings.reapop.REMOVE_NOTIFICATIONS
  var UPDATE_NOTIFICATION: typings.reapop.UPDATE_NOTIFICATION
}

object Types {
  @scala.inline
  def apply(
    ADD_NOTIFICATION: ADD_NOTIFICATION,
    REMOVE_NOTIFICATION: REMOVE_NOTIFICATION,
    REMOVE_NOTIFICATIONS: REMOVE_NOTIFICATIONS,
    UPDATE_NOTIFICATION: UPDATE_NOTIFICATION
  ): Types = {
    val __obj = js.Dynamic.literal(ADD_NOTIFICATION = ADD_NOTIFICATION, REMOVE_NOTIFICATION = REMOVE_NOTIFICATION, REMOVE_NOTIFICATIONS = REMOVE_NOTIFICATIONS, UPDATE_NOTIFICATION = UPDATE_NOTIFICATION)
  
    __obj.asInstanceOf[Types]
  }
}

