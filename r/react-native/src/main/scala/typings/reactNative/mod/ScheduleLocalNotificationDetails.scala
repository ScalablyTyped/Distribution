package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.day
import typings.reactNative.reactNativeStrings.hour
import typings.reactNative.reactNativeStrings.minute
import typings.reactNative.reactNativeStrings.month
import typings.reactNative.reactNativeStrings.week
import typings.reactNative.reactNativeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleLocalNotificationDetails extends js.Object {
  var alertAction: js.UndefOr[String] = js.undefined
  var alertBody: js.UndefOr[String] = js.undefined
  var alertTitle: js.UndefOr[String] = js.undefined
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var fireDate: js.UndefOr[Double | String] = js.undefined
  var isSilent: js.UndefOr[Boolean] = js.undefined
  var repeatInterval: js.UndefOr[year | month | week | day | hour | minute] = js.undefined
  var soundName: js.UndefOr[String] = js.undefined
  var userInfo: js.UndefOr[js.Object] = js.undefined
}

object ScheduleLocalNotificationDetails {
  @scala.inline
  def apply(
    alertAction: String = null,
    alertBody: String = null,
    alertTitle: String = null,
    applicationIconBadgeNumber: js.UndefOr[Double] = js.undefined,
    category: String = null,
    fireDate: Double | String = null,
    isSilent: js.UndefOr[Boolean] = js.undefined,
    repeatInterval: year | month | week | day | hour | minute = null,
    soundName: String = null,
    userInfo: js.Object = null
  ): ScheduleLocalNotificationDetails = {
    val __obj = js.Dynamic.literal()
    if (alertAction != null) __obj.updateDynamic("alertAction")(alertAction.asInstanceOf[js.Any])
    if (alertBody != null) __obj.updateDynamic("alertBody")(alertBody.asInstanceOf[js.Any])
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationIconBadgeNumber)) __obj.updateDynamic("applicationIconBadgeNumber")(applicationIconBadgeNumber.get.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (fireDate != null) __obj.updateDynamic("fireDate")(fireDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isSilent)) __obj.updateDynamic("isSilent")(isSilent.get.asInstanceOf[js.Any])
    if (repeatInterval != null) __obj.updateDynamic("repeatInterval")(repeatInterval.asInstanceOf[js.Any])
    if (soundName != null) __obj.updateDynamic("soundName")(soundName.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
}

