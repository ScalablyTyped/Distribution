package typings.reapop.reapopMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var ADD_NOTIFICATION: typings.reapop.reapopMod.ADD_NOTIFICATION
  var REMOVE_NOTIFICATION: typings.reapop.reapopMod.REMOVE_NOTIFICATION
  var REMOVE_NOTIFICATIONS: typings.reapop.reapopMod.REMOVE_NOTIFICATIONS
  var UPDATE_NOTIFICATION: typings.reapop.reapopMod.UPDATE_NOTIFICATION
}

object Types {
  @scala.inline
  def apply(
    ADD_NOTIFICATION: ADD_NOTIFICATION,
    REMOVE_NOTIFICATION: REMOVE_NOTIFICATION,
    REMOVE_NOTIFICATIONS: REMOVE_NOTIFICATIONS,
    UPDATE_NOTIFICATION: UPDATE_NOTIFICATION
  ): Types = {
    val __obj = js.Dynamic.literal(ADD_NOTIFICATION = ADD_NOTIFICATION.asInstanceOf[js.Any], REMOVE_NOTIFICATION = REMOVE_NOTIFICATION.asInstanceOf[js.Any], REMOVE_NOTIFICATIONS = REMOVE_NOTIFICATIONS.asInstanceOf[js.Any], UPDATE_NOTIFICATION = UPDATE_NOTIFICATION.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types]
  }
}

@JSImport("reapop", "types")
@js.native
object types extends TopLevel[Types]

