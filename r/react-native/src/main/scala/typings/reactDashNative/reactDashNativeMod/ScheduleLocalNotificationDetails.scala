package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.day
import typings.reactDashNative.reactDashNativeStrings.hour
import typings.reactDashNative.reactDashNativeStrings.minute
import typings.reactDashNative.reactDashNativeStrings.month
import typings.reactDashNative.reactDashNativeStrings.week
import typings.reactDashNative.reactDashNativeStrings.year
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
    applicationIconBadgeNumber: Int | Double = null,
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
    if (applicationIconBadgeNumber != null) __obj.updateDynamic("applicationIconBadgeNumber")(applicationIconBadgeNumber.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (fireDate != null) __obj.updateDynamic("fireDate")(fireDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isSilent)) __obj.updateDynamic("isSilent")(isSilent.asInstanceOf[js.Any])
    if (repeatInterval != null) __obj.updateDynamic("repeatInterval")(repeatInterval.asInstanceOf[js.Any])
    if (soundName != null) __obj.updateDynamic("soundName")(soundName.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
}

