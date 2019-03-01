package typings
package reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsProps
  extends reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.Attributes {
  var notifications: js.UndefOr[
    js.Array[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.Notification
    ]
  ] = js.undefined
}

object NotificationsProps {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    noAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    notifications: js.Array[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.Notification
    ] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.System
    ] = null,
    style: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs.Style | scala.Boolean = null
  ): NotificationsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation)
    if (notifications != null) __obj.updateDynamic("notifications")(notifications)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsProps]
  }
}

