package typings.reactNativePermissions.typesMod

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
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(carPlay)) __obj.updateDynamic("carPlay")(carPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(criticalAlert)) __obj.updateDynamic("criticalAlert")(criticalAlert.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreen)) __obj.updateDynamic("lockScreen")(lockScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationCenter)) __obj.updateDynamic("notificationCenter")(notificationCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSettings]
  }
}

