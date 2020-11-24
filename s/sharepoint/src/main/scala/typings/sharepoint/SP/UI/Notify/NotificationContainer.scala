package typings.sharepoint.SP.UI.Notify

import typings.sharepoint.SPNotifications.EventID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationContainer extends js.Object {
  
  def Clear(): Unit = js.native
  
  def GetCount(): Double = js.native
  
  def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit = js.native
}
object NotificationContainer {
  
  @scala.inline
  def apply(Clear: () => Unit, GetCount: () => Double, SetEventHandler: (EventID, js.Any) => Unit): NotificationContainer = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), GetCount = js.Any.fromFunction0(GetCount), SetEventHandler = js.Any.fromFunction2(SetEventHandler))
    __obj.asInstanceOf[NotificationContainer]
  }
  
  @scala.inline
  implicit class NotificationContainerOps[Self <: NotificationContainer] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("GetCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEventHandler(value: (EventID, js.Any) => Unit): Self = this.set("SetEventHandler", js.Any.fromFunction2(value))
  }
}
