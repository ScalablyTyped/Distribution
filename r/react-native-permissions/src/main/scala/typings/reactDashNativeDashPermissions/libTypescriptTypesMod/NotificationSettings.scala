package typings.reactDashNativeDashPermissions.libTypescriptTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSettings extends js.Object {
  var alert: js.UndefOr[Boolean] = js.undefined
  var badge: js.UndefOr[Boolean] = js.undefined
  var carPlay: js.UndefOr[Boolean] = js.undefined
  var criticalAlert: js.UndefOr[Boolean] = js.undefined
  var lockScreen: js.UndefOr[Boolean] = js.undefined
  var notificationCenter: js.UndefOr[Boolean] = js.undefined
  var sound: js.UndefOr[Boolean] = js.undefined
}

object NotificationSettings {
  @scala.inline
  def apply(
    alert: js.UndefOr[Boolean] = js.undefined,
    badge: js.UndefOr[Boolean] = js.undefined,
    carPlay: js.UndefOr[Boolean] = js.undefined,
    criticalAlert: js.UndefOr[Boolean] = js.undefined,
    lockScreen: js.UndefOr[Boolean] = js.undefined,
    notificationCenter: js.UndefOr[Boolean] = js.undefined,
    sound: js.UndefOr[Boolean] = js.undefined
  ): NotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert)
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge)
    if (!js.isUndefined(carPlay)) __obj.updateDynamic("carPlay")(carPlay)
    if (!js.isUndefined(criticalAlert)) __obj.updateDynamic("criticalAlert")(criticalAlert)
    if (!js.isUndefined(lockScreen)) __obj.updateDynamic("lockScreen")(lockScreen)
    if (!js.isUndefined(notificationCenter)) __obj.updateDynamic("notificationCenter")(notificationCenter)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    __obj.asInstanceOf[NotificationSettings]
  }
}

