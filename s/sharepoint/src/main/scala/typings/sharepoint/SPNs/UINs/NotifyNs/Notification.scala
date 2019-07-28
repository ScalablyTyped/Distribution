package typings.sharepoint.SPNs.UINs.NotifyNs

import typings.sharepoint.SPNotificationsNs.ContainerID
import typings.sharepoint.SPStatusNotificationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Notify.Notification")
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

