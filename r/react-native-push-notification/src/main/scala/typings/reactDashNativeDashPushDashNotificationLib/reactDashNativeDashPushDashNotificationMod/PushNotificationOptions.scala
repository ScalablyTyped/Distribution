package typings
package reactDashNativeDashPushDashNotificationLib.reactDashNativeDashPushDashNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PushNotificationOptions extends js.Object {
  var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, scala.Unit]] = js.undefined
  var onRegister: js.UndefOr[
    js.Function1[/* token */ reactDashNativeDashPushDashNotificationLib.Anon_Token, scala.Unit]
  ] = js.undefined
  var permissions: js.UndefOr[PushNotificationPermissions] = js.undefined
  var popInitialNotification: js.UndefOr[scala.Boolean] = js.undefined
  var requestPermissions: js.UndefOr[scala.Boolean] = js.undefined
  var senderID: js.UndefOr[java.lang.String] = js.undefined
}

