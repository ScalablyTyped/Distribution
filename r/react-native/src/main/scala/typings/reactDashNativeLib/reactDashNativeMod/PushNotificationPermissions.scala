package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationPermissions extends js.Object {
  var alert: js.UndefOr[scala.Boolean] = js.undefined
  var badge: js.UndefOr[scala.Boolean] = js.undefined
  var sound: js.UndefOr[scala.Boolean] = js.undefined
}

object PushNotificationPermissions {
  @scala.inline
  def apply(
    alert: js.UndefOr[scala.Boolean] = js.undefined,
    badge: js.UndefOr[scala.Boolean] = js.undefined,
    sound: js.UndefOr[scala.Boolean] = js.undefined
  ): PushNotificationPermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert)
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    __obj.asInstanceOf[PushNotificationPermissions]
  }
}

