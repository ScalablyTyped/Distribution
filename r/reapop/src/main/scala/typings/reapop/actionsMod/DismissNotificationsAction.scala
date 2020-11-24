package typings.reapop.actionsMod

import typings.reapop.notificationsConstantsMod.NotificationAction.DismissNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DismissNotificationsAction extends NotificationActions {
  
  var `type`: DismissNotifications = js.native
}
object DismissNotificationsAction {
  
  @scala.inline
  def apply(`type`: DismissNotifications): DismissNotificationsAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissNotificationsAction]
  }
  
  @scala.inline
  implicit class DismissNotificationsActionOps[Self <: DismissNotificationsAction] (val x: Self) extends AnyVal {
    
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
    def setType(value: DismissNotifications): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
