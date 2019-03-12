package typings
package reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationOptions extends js.Object {
  var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, scala.Unit]] = js.undefined
  var onRegister: js.UndefOr[
    js.Function1[/* token */ reactDashNativeDashPushDashNotificationLib.Anon_Os, scala.Unit]
  ] = js.undefined
  var permissions: js.UndefOr[PushNotificationPermissions] = js.undefined
  var popInitialNotification: js.UndefOr[scala.Boolean] = js.undefined
  var requestPermissions: js.UndefOr[scala.Boolean] = js.undefined
  var senderID: js.UndefOr[java.lang.String] = js.undefined
}

object PushNotificationOptions {
  @scala.inline
  def apply(
    onNotification: /* notification */ PushNotification => scala.Unit = null,
    onRegister: /* token */ reactDashNativeDashPushDashNotificationLib.Anon_Os => scala.Unit = null,
    permissions: PushNotificationPermissions = null,
    popInitialNotification: js.UndefOr[scala.Boolean] = js.undefined,
    requestPermissions: js.UndefOr[scala.Boolean] = js.undefined,
    senderID: java.lang.String = null
  ): PushNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (onNotification != null) __obj.updateDynamic("onNotification")(js.Any.fromFunction1(onNotification))
    if (onRegister != null) __obj.updateDynamic("onRegister")(js.Any.fromFunction1(onRegister))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (!js.isUndefined(popInitialNotification)) __obj.updateDynamic("popInitialNotification")(popInitialNotification)
    if (!js.isUndefined(requestPermissions)) __obj.updateDynamic("requestPermissions")(requestPermissions)
    if (senderID != null) __obj.updateDynamic("senderID")(senderID)
    __obj.asInstanceOf[PushNotificationOptions]
  }
}

