package typings
package reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-notification-system-redux", JSImport.Namespace)
@js.native
class ^ () extends Notifications

@JSImport("react-notification-system-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val error: NotificationShow = js.native
  val info: NotificationShow = js.native
  val reducer: NotificationsReducer[js.Any] = js.native
  val success: NotificationShow = js.native
  val warning: NotificationShow = js.native
  def hide(): reduxLib.reduxMod.Action[_] = js.native
  def hide(opts: java.lang.String): reduxLib.reduxMod.Action[_] = js.native
  def hide(opts: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification): reduxLib.reduxMod.Action[_] = js.native
  def hide(opts: scala.Double): reduxLib.reduxMod.Action[_] = js.native
  def removeAll(): reduxLib.reduxMod.Action[_] = js.native
  def show(): reduxLib.reduxMod.Action[_] = js.native
  def show(opts: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification): reduxLib.reduxMod.Action[_] = js.native
  def show(
    opts: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification,
    level: NotificationLevel
  ): reduxLib.reduxMod.Action[_] = js.native
}

