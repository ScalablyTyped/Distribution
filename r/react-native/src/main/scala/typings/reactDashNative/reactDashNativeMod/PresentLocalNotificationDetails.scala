package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentLocalNotificationDetails extends js.Object {
  var alertAction: String
  var alertBody: String
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var soundName: js.UndefOr[String] = js.undefined
  var userInfo: js.UndefOr[js.Object] = js.undefined
}

object PresentLocalNotificationDetails {
  @scala.inline
  def apply(
    alertAction: String,
    alertBody: String,
    applicationIconBadgeNumber: Int | Double = null,
    category: String = null,
    soundName: String = null,
    userInfo: js.Object = null
  ): PresentLocalNotificationDetails = {
    val __obj = js.Dynamic.literal(alertAction = alertAction, alertBody = alertBody)
    if (applicationIconBadgeNumber != null) __obj.updateDynamic("applicationIconBadgeNumber")(applicationIconBadgeNumber.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (soundName != null) __obj.updateDynamic("soundName")(soundName)
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[PresentLocalNotificationDetails]
  }
}

