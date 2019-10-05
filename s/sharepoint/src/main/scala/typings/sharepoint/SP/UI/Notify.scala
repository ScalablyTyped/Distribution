package typings.sharepoint.SP.UI

import typings.sharepoint.SPNotifications.ContainerID
import typings.sharepoint.SPNotifications.EventID
import typings.sharepoint.SPStatusNotificationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Notify")
@js.native
object Notify extends js.Object {
  @js.native
  class Notification protected () extends js.Object {
    def this(containerId: ContainerID, strHtml: String) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Boolean) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Boolean, strTooltip: String) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: String,
      onclickHandler: js.Function0[Unit]
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: String,
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def Hide(bNoAnimate: Boolean): Unit = js.native
    def Show(bNoAnimate: Boolean): Unit = js.native
    def get_id(): String = js.native
  }
  
  @js.native
  class NotificationContainer protected () extends js.Object {
    def this(id: Double, element: js.Any, layer: Double) = this()
    def this(id: Double, element: js.Any, layer: Double, notificationLimit: Double) = this()
    def Clear(): Unit = js.native
    def GetCount(): Double = js.native
    def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit = js.native
  }
  
  def addNotification(strHtml: String, bSticky: Boolean): String = js.native
  def removeNotification(nid: String): Unit = js.native
  def showLoadingNotification(bSticky: Boolean): String = js.native
}

