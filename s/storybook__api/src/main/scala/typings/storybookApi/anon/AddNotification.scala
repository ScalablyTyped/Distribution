package typings.storybookApi.anon

import typings.storybookApi.notificationsMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddNotification extends js.Object {
  def addNotification(notification: Notification): Unit = js.native
  def clearNotification(id: String): Unit = js.native
}

object AddNotification {
  @scala.inline
  def apply(addNotification: Notification => Unit, clearNotification: String => Unit): AddNotification = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
    __obj.asInstanceOf[AddNotification]
  }
  @scala.inline
  implicit class AddNotificationOps[Self <: AddNotification] (val x: Self) extends AnyVal {
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
    def setAddNotification(value: Notification => Unit): Self = this.set("addNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setClearNotification(value: String => Unit): Self = this.set("clearNotification", js.Any.fromFunction1(value))
  }
  
}

