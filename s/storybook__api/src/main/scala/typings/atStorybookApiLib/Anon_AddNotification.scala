package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNotification extends js.Object {
  def addNotification(notification: atStorybookApiLib.distModulesNotificationsMod.Notification): scala.Unit
  def clearNotification(id: java.lang.String): scala.Unit
}

object Anon_AddNotification {
  @scala.inline
  def apply(
    addNotification: atStorybookApiLib.distModulesNotificationsMod.Notification => scala.Unit,
    clearNotification: java.lang.String => scala.Unit
  ): Anon_AddNotification = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
  
    __obj.asInstanceOf[Anon_AddNotification]
  }
}

