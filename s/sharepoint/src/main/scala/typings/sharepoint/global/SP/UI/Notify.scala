package typings.sharepoint.global.SP.UI

import typings.sharepoint.SPNotifications.ContainerID
import typings.sharepoint.SPNotifications.EventID
import typings.sharepoint.SPStatusNotificationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notify {
  
  @JSGlobal("SP.UI.Notify")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SP.UI.Notify.Notification")
  @js.native
  class Notification protected ()
    extends StObject
       with typings.sharepoint.SP.UI.Notify.Notification {
    def this(containerId: ContainerID, strHtml: String) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Boolean) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Boolean, strTooltip: String) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Unit, strTooltip: String) = this()
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
      strTooltip: Unit,
      onclickHandler: js.Function0[Unit]
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Unit,
      strTooltip: String,
      onclickHandler: js.Function0[Unit]
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Unit,
      strTooltip: Unit,
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
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: String,
      onclickHandler: Unit,
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: Unit,
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: Unit,
      onclickHandler: Unit,
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Unit,
      strTooltip: String,
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Unit,
      strTooltip: String,
      onclickHandler: Unit,
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Unit,
      strTooltip: Unit,
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Unit,
      strTooltip: Unit,
      onclickHandler: Unit,
      extraData: SPStatusNotificationData
    ) = this()
    
    /* CompleteClass */
    override def Hide(bNoAnimate: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def Show(bNoAnimate: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
  }
  
  @JSGlobal("SP.UI.Notify.NotificationContainer")
  @js.native
  class NotificationContainer protected ()
    extends StObject
       with typings.sharepoint.SP.UI.Notify.NotificationContainer {
    def this(id: Double, element: js.Any, layer: Double) = this()
    def this(id: Double, element: js.Any, layer: Double, notificationLimit: Double) = this()
    
    /* CompleteClass */
    override def Clear(): Unit = js.native
    
    /* CompleteClass */
    override def GetCount(): Double = js.native
    
    /* CompleteClass */
    override def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit = js.native
  }
  
  @scala.inline
  def addNotification(strHtml: String, bSticky: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addNotification")(strHtml.asInstanceOf[js.Any], bSticky.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def removeNotification(nid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNotification")(nid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def showLoadingNotification(bSticky: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("showLoadingNotification")(bSticky.asInstanceOf[js.Any]).asInstanceOf[String]
}
