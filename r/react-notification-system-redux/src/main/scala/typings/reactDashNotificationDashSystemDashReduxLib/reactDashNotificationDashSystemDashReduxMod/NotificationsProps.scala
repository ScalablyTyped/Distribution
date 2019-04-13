package typings
package reactDashNotificationDashSystemDashReduxLib.reactDashNotificationDashSystemDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsProps
  extends reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Attributes {
  var notifications: js.UndefOr[
    js.Array[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification
    ]
  ] = js.undefined
}

object NotificationsProps {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    noAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    notifications: js.Array[
      reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Notification
    ] = null,
    ref: reactLib.reactMod.LegacyRef[reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.System] = null,
    style: reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.Style | scala.Boolean = null
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

