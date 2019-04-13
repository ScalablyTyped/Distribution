package typings
package reactDashNotificationDashSystemDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNotificationDashSystemDashReduxMod {
  type NotificationShow = js.Function1[
    /* opts */ js.UndefOr[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification
    ], 
    reduxLib.reduxMod.Action[js.Any]
  ]
  type Notifications = reactLib.reactMod.Component[NotificationsProps, js.Object, js.Any]
  type NotificationsReducer[A /* <: reduxLib.reduxMod.Action[_] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  type NotificationsState = js.Array[
    reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification
  ]
}
