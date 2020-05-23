package typings.sharepoint.SP.UI.Notify

import typings.sharepoint.SPNotifications.EventID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationContainer extends js.Object {
  def Clear(): Unit
  def GetCount(): Double
  def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit
}

object NotificationContainer {
  @scala.inline
  def apply(Clear: () => Unit, GetCount: () => Double, SetEventHandler: (EventID, js.Any) => Unit): NotificationContainer = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), GetCount = js.Any.fromFunction0(GetCount), SetEventHandler = js.Any.fromFunction2(SetEventHandler))
    __obj.asInstanceOf[NotificationContainer]
  }
}

