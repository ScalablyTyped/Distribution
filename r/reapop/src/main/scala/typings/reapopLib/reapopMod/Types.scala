package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var ADD_NOTIFICATION: reapopLib.ADD_NOTIFICATION
  var REMOVE_NOTIFICATION: reapopLib.REMOVE_NOTIFICATION
  var REMOVE_NOTIFICATIONS: reapopLib.REMOVE_NOTIFICATIONS
  var UPDATE_NOTIFICATION: reapopLib.UPDATE_NOTIFICATION
}

object Types {
  @scala.inline
  def apply(
    ADD_NOTIFICATION: reapopLib.ADD_NOTIFICATION,
    REMOVE_NOTIFICATION: reapopLib.REMOVE_NOTIFICATION,
    REMOVE_NOTIFICATIONS: reapopLib.REMOVE_NOTIFICATIONS,
    UPDATE_NOTIFICATION: reapopLib.UPDATE_NOTIFICATION
  ): Types = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADD_NOTIFICATION")(ADD_NOTIFICATION)
    __obj.updateDynamic("REMOVE_NOTIFICATION")(REMOVE_NOTIFICATION)
    __obj.updateDynamic("REMOVE_NOTIFICATIONS")(REMOVE_NOTIFICATIONS)
    __obj.updateDynamic("UPDATE_NOTIFICATION")(UPDATE_NOTIFICATION)
    __obj.asInstanceOf[Types]
  }
}

