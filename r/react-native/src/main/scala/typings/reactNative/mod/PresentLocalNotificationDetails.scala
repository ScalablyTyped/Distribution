package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentLocalNotificationDetails extends js.Object {
  var alertAction: String
  var alertBody: String
  var alertTitle: js.UndefOr[String] = js.undefined
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
    alertTitle: String = null,
    applicationIconBadgeNumber: js.UndefOr[Double] = js.undefined,
    category: String = null,
    soundName: String = null,
    userInfo: js.Object = null
  ): PresentLocalNotificationDetails = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any])
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationIconBadgeNumber)) __obj.updateDynamic("applicationIconBadgeNumber")(applicationIconBadgeNumber.get.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (soundName != null) __obj.updateDynamic("soundName")(soundName.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentLocalNotificationDetails]
  }
}

