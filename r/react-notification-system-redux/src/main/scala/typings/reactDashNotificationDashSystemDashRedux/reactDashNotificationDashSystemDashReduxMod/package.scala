package typings.reactDashNotificationDashSystemDashRedux

import typings.react.reactMod.Component
import typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.Notification
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNotificationDashSystemDashReduxMod {
  type NotificationShow = js.Function1[/* opts */ js.UndefOr[Notification], Action[js.Any]]
  type Notifications = Component[NotificationsProps, js.Object, js.Any]
  type NotificationsReducer[A /* <: Action[_] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  type NotificationsState = js.Array[Notification]
}
