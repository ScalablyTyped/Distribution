package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleLocalNotificationDetails extends js.Object {
  var alertAction: js.UndefOr[java.lang.String] = js.undefined
  var alertBody: js.UndefOr[java.lang.String] = js.undefined
  var alertTitle: js.UndefOr[java.lang.String] = js.undefined
  var applicationIconBadgeNumber: js.UndefOr[scala.Double] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var fireDate: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var isSilent: js.UndefOr[scala.Boolean] = js.undefined
  var repeatInterval: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.year | reactDashNativeLib.reactDashNativeLibStrings.month | reactDashNativeLib.reactDashNativeLibStrings.week | reactDashNativeLib.reactDashNativeLibStrings.day | reactDashNativeLib.reactDashNativeLibStrings.hour | reactDashNativeLib.reactDashNativeLibStrings.minute
  ] = js.undefined
  var soundName: js.UndefOr[java.lang.String] = js.undefined
  var userInfo: js.UndefOr[js.Object] = js.undefined
}

object ScheduleLocalNotificationDetails {
  @scala.inline
  def apply(
    alertAction: java.lang.String = null,
    alertBody: java.lang.String = null,
    alertTitle: java.lang.String = null,
    applicationIconBadgeNumber: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    fireDate: scala.Double | java.lang.String = null,
    isSilent: js.UndefOr[scala.Boolean] = js.undefined,
    repeatInterval: reactDashNativeLib.reactDashNativeLibStrings.year | reactDashNativeLib.reactDashNativeLibStrings.month | reactDashNativeLib.reactDashNativeLibStrings.week | reactDashNativeLib.reactDashNativeLibStrings.day | reactDashNativeLib.reactDashNativeLibStrings.hour | reactDashNativeLib.reactDashNativeLibStrings.minute = null,
    soundName: java.lang.String = null,
    userInfo: js.Object = null
  ): ScheduleLocalNotificationDetails = {
    val __obj = js.Dynamic.literal()
    if (alertAction != null) __obj.updateDynamic("alertAction")(alertAction)
    if (alertBody != null) __obj.updateDynamic("alertBody")(alertBody)
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle)
    if (applicationIconBadgeNumber != null) __obj.updateDynamic("applicationIconBadgeNumber")(applicationIconBadgeNumber.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (fireDate != null) __obj.updateDynamic("fireDate")(fireDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isSilent)) __obj.updateDynamic("isSilent")(isSilent)
    if (repeatInterval != null) __obj.updateDynamic("repeatInterval")(repeatInterval.asInstanceOf[js.Any])
    if (soundName != null) __obj.updateDynamic("soundName")(soundName)
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
}

