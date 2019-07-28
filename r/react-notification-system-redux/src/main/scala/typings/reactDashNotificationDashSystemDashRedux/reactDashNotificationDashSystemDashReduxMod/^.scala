package typings.reactDashNotificationDashSystemDashRedux.reactDashNotificationDashSystemDashReduxMod

import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.Notification
import typings.redux.reduxMod.Action
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
  def hide(): Action[_] = js.native
  def hide(opts: String): Action[_] = js.native
  def hide(opts: Double): Action[_] = js.native
  def hide(opts: Notification): Action[_] = js.native
  def removeAll(): Action[_] = js.native
  def show(): Action[_] = js.native
  def show(opts: Notification): Action[_] = js.native
  def show(opts: Notification, level: NotificationLevel): Action[_] = js.native
}

