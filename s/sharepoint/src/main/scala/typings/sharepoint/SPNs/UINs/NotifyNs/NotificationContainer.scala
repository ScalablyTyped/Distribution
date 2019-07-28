package typings.sharepoint.SPNs.UINs.NotifyNs

import typings.sharepoint.SPNotificationsNs.EventID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Notify.NotificationContainer")
@js.native
class NotificationContainer protected () extends js.Object {
  def this(id: Double, element: js.Any, layer: Double) = this()
  def this(id: Double, element: js.Any, layer: Double, notificationLimit: Double) = this()
  def Clear(): Unit = js.native
  def GetCount(): Double = js.native
  def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit = js.native
}

