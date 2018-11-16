package typings
package sharepointLib.SPNs.UINs.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Notify.NotificationContainer")
@js.native
class NotificationContainer protected () extends js.Object {
  def this(id: scala.Double, element: js.Any, layer: scala.Double) = this()
  def this(id: scala.Double, element: js.Any, layer: scala.Double, notificationLimit: scala.Double) = this()
  def Clear(): scala.Unit = js.native
  def GetCount(): scala.Double = js.native
  def SetEventHandler(eventId: sharepointLib.SPNotificationsNs.EventID, eventHandler: js.Any): scala.Unit = js.native
}

