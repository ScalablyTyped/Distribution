package typings
package sharepointLib.SPNs.UINs.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Notify.Notification")
@js.native
class Notification protected () extends js.Object {
  def this(containerId: sharepointLib.SPNotificationsNs.ContainerID, strHtml: java.lang.String) = this()
  def this(containerId: sharepointLib.SPNotificationsNs.ContainerID, strHtml: java.lang.String, bSticky: scala.Boolean) = this()
  def this(containerId: sharepointLib.SPNotificationsNs.ContainerID, strHtml: java.lang.String, bSticky: scala.Boolean, strTooltip: java.lang.String) = this()
  def this(containerId: sharepointLib.SPNotificationsNs.ContainerID, strHtml: java.lang.String, bSticky: scala.Boolean, strTooltip: java.lang.String, onclickHandler: js.Function0[scala.Unit]) = this()
  def this(containerId: sharepointLib.SPNotificationsNs.ContainerID, strHtml: java.lang.String, bSticky: scala.Boolean, strTooltip: java.lang.String, onclickHandler: js.Function0[scala.Unit], extraData: sharepointLib.SPStatusNotificationData) = this()
  def Hide(bNoAnimate: scala.Boolean): scala.Unit = js.native
  def Show(bNoAnimate: scala.Boolean): scala.Unit = js.native
  def get_id(): java.lang.String = js.native
}

