package typings.sharepoint.global.SP.UI

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
  class Notification protected ()
    extends typings.sharepoint.SP.UI.Notify.Notification {
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
    /* CompleteClass */
    override def Hide(bNoAnimate: Boolean): Unit = js.native
    /* CompleteClass */
    override def Show(bNoAnimate: Boolean): Unit = js.native
    /* CompleteClass */
    override def get_id(): String = js.native
  }
  
  @js.native
  class NotificationContainer protected ()
    extends typings.sharepoint.SP.UI.Notify.NotificationContainer {
    def this(id: Double, element: js.Any, layer: Double) = this()
    def this(id: Double, element: js.Any, layer: Double, notificationLimit: Double) = this()
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /* CompleteClass */
    override def GetCount(): Double = js.native
    /* CompleteClass */
    override def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit = js.native
  }
  
  def addNotification(strHtml: String, bSticky: Boolean): String = js.native
  def removeNotification(nid: String): Unit = js.native
  def showLoadingNotification(bSticky: Boolean): String = js.native
}

