package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentLocalNotificationDetails extends js.Object {
  var alertAction: java.lang.String
  var alertBody: java.lang.String
  var applicationIconBadgeNumber: js.UndefOr[scala.Double] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var soundName: js.UndefOr[java.lang.String] = js.undefined
  var userInfo: js.UndefOr[js.Object] = js.undefined
}

object PresentLocalNotificationDetails {
  @scala.inline
  def apply(
    alertAction: java.lang.String,
    alertBody: java.lang.String,
    applicationIconBadgeNumber: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    soundName: java.lang.String = null,
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

