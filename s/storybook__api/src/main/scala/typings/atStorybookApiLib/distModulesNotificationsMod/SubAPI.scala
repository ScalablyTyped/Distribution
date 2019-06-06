package typings
package atStorybookApiLib.distModulesNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def addNotification(notification: Notification): scala.Unit
  def clearNotification(id: java.lang.String): scala.Unit
}

object SubAPI {
  @scala.inline
  def apply(addNotification: Notification => scala.Unit, clearNotification: java.lang.String => scala.Unit): SubAPI = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
  
    __obj.asInstanceOf[SubAPI]
  }
}

