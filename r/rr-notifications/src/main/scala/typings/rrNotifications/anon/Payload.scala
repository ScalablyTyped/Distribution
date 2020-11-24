package typings.rrNotifications.anon

import typings.rrNotifications.mod.NotificationPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payload extends js.Object {
  
  var payload: NotificationPayload = js.native
  
  def removeNotification(): Unit = js.native
}
object Payload {
  
  @scala.inline
  def apply(payload: NotificationPayload, removeNotification: () => Unit): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], removeNotification = js.Any.fromFunction0(removeNotification))
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: NotificationPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveNotification(value: () => Unit): Self = this.set("removeNotification", js.Any.fromFunction0(value))
  }
}
