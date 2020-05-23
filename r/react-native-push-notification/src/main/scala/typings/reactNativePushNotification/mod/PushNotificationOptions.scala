package typings.reactNativePushNotification.mod

import typings.reactNativePushNotification.anon.Os
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationOptions extends js.Object {
  var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, Unit]] = js.undefined
  var onRegister: js.UndefOr[js.Function1[/* token */ Os, Unit]] = js.undefined
  var permissions: js.UndefOr[PushNotificationPermissions] = js.undefined
  var popInitialNotification: js.UndefOr[Boolean] = js.undefined
  var requestPermissions: js.UndefOr[Boolean] = js.undefined
  var senderID: js.UndefOr[String] = js.undefined
}

object PushNotificationOptions {
  @scala.inline
  def apply(
    onNotification: /* notification */ PushNotification => Unit = null,
    onRegister: /* token */ Os => Unit = null,
    permissions: PushNotificationPermissions = null,
    popInitialNotification: js.UndefOr[Boolean] = js.undefined,
    requestPermissions: js.UndefOr[Boolean] = js.undefined,
    senderID: String = null
  ): PushNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (onNotification != null) __obj.updateDynamic("onNotification")(js.Any.fromFunction1(onNotification))
    if (onRegister != null) __obj.updateDynamic("onRegister")(js.Any.fromFunction1(onRegister))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (!js.isUndefined(popInitialNotification)) __obj.updateDynamic("popInitialNotification")(popInitialNotification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPermissions)) __obj.updateDynamic("requestPermissions")(requestPermissions.get.asInstanceOf[js.Any])
    if (senderID != null) __obj.updateDynamic("senderID")(senderID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationOptions]
  }
}

