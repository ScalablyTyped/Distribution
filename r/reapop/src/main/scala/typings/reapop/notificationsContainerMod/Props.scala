package typings.reapop.notificationsContainerMod

import typings.reapop.notificationsSystemMod.DismissNotification
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var dismissNotification: DismissNotification = js.native
  
  var notifications: js.Array[Notification] = js.native
  
  var position: Position = js.native
  
  var singleContainer: Boolean = js.native
}
object Props {
  
  @scala.inline
  def apply(
    dismissNotification: /* id */ String => Unit,
    notifications: js.Array[Notification],
    position: Position,
    singleContainer: Boolean
  ): Props = {
    val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], singleContainer = singleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDismissNotification(value: /* id */ String => Unit): Self = this.set("dismissNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleContainer(value: Boolean): Self = this.set("singleContainer", value.asInstanceOf[js.Any])
  }
}
