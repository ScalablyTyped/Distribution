package typings
package reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NotificationsNs {
  type NotificationShow = js.Function1[
    /* opts */ js.UndefOr[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.Notification
    ], 
    reduxLib.reduxMod.Action[js.Any]
  ]
  type NotificationsReducer[A /* <: reduxLib.reduxMod.Action[_] */] = js.Function2[/* state */ NotificationsState, /* action */ A, NotificationsState]
  type NotificationsState = js.Array[
    reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.Notification
  ]
}
