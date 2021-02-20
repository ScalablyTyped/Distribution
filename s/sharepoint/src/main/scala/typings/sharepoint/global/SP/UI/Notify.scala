package typings.sharepoint.global.SP.UI

import typings.sharepoint.SPNotifications.ContainerID
import typings.sharepoint.SPStatusNotificationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notify {
  
  @JSGlobal("SP.UI.Notify.Notification")
  @js.native
  class Notification protected ()
    extends typings.sharepoint.SP.UI.Notify.Notification {
    def this(containerId: ContainerID, strHtml: String) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Boolean) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: js.UndefOr[scala.Nothing], strTooltip: String) = this()
    def this(containerId: ContainerID, strHtml: String, bSticky: Boolean, strTooltip: String) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: js.UndefOr[scala.Nothing],
      strTooltip: js.UndefOr[scala.Nothing],
      onclickHandler: js.Function0[Unit]
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: js.UndefOr[scala.Nothing],
      strTooltip: String,
      onclickHandler: js.Function0[Unit]
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: js.UndefOr[scala.Nothing],
      onclickHandler: js.Function0[Unit]
    ) = this()
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
      bSticky: js.UndefOr[scala.Nothing],
      strTooltip: js.UndefOr[scala.Nothing],
      onclickHandler: js.UndefOr[scala.Nothing],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: js.UndefOr[scala.Nothing],
      strTooltip: js.UndefOr[scala.Nothing],
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: js.UndefOr[scala.Nothing],
      strTooltip: String,
      onclickHandler: js.UndefOr[scala.Nothing],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: js.UndefOr[scala.Nothing],
      strTooltip: String,
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: js.UndefOr[scala.Nothing],
      onclickHandler: js.UndefOr[scala.Nothing],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: js.UndefOr[scala.Nothing],
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: String,
      onclickHandler: js.UndefOr[scala.Nothing],
      extraData: SPStatusNotificationData
    ) = this()
    def this(
      containerId: ContainerID,
      strHtml: String,
      bSticky: Boolean,
      strTooltip: String,
      onclickHandler: js.Function0[Unit],
      extraData: SPStatusNotificationData
    ) = this()
  }
  
  @JSGlobal("SP.UI.Notify.NotificationContainer")
  @js.native
  class NotificationContainer protected ()
    extends typings.sharepoint.SP.UI.Notify.NotificationContainer {
    def this(id: Double, element: js.Any, layer: Double) = this()
    def this(id: Double, element: js.Any, layer: Double, notificationLimit: Double) = this()
  }
  
  @JSGlobal("SP.UI.Notify.addNotification")
  @js.native
  def addNotification(strHtml: String, bSticky: Boolean): String = js.native
  
  @JSGlobal("SP.UI.Notify.removeNotification")
  @js.native
  def removeNotification(nid: String): Unit = js.native
  
  @JSGlobal("SP.UI.Notify.showLoadingNotification")
  @js.native
  def showLoadingNotification(bSticky: Boolean): String = js.native
}
