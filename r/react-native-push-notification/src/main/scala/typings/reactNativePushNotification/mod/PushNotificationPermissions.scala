package typings.reactNativePushNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationPermissions extends js.Object {
  var alert: js.UndefOr[Boolean] = js.undefined
  var badge: js.UndefOr[Boolean] = js.undefined
  var sound: js.UndefOr[Boolean] = js.undefined
}

object PushNotificationPermissions {
  @scala.inline
  def apply(
    alert: js.UndefOr[Boolean] = js.undefined,
    badge: js.UndefOr[Boolean] = js.undefined,
    sound: js.UndefOr[Boolean] = js.undefined
  ): PushNotificationPermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationPermissions]
  }
}

