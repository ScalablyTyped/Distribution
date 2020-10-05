package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.day
import typings.reactNative.reactNativeStrings.hour
import typings.reactNative.reactNativeStrings.minute
import typings.reactNative.reactNativeStrings.month
import typings.reactNative.reactNativeStrings.week
import typings.reactNative.reactNativeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleLocalNotificationDetails extends js.Object {
  var alertAction: js.UndefOr[String] = js.native
  var alertBody: js.UndefOr[String] = js.native
  var alertTitle: js.UndefOr[String] = js.native
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.native
  var category: js.UndefOr[String] = js.native
  var fireDate: js.UndefOr[Double | String] = js.native
  var isSilent: js.UndefOr[Boolean] = js.native
  var repeatInterval: js.UndefOr[year | month | week | day | hour | minute] = js.native
  var soundName: js.UndefOr[String] = js.native
  var userInfo: js.UndefOr[js.Object] = js.native
}

object ScheduleLocalNotificationDetails {
  @scala.inline
  def apply(): ScheduleLocalNotificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
  @scala.inline
  implicit class ScheduleLocalNotificationDetailsOps[Self <: ScheduleLocalNotificationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlertAction(value: String): Self = this.set("alertAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertAction: Self = this.set("alertAction", js.undefined)
    @scala.inline
    def setAlertBody(value: String): Self = this.set("alertBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertBody: Self = this.set("alertBody", js.undefined)
    @scala.inline
    def setAlertTitle(value: String): Self = this.set("alertTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertTitle: Self = this.set("alertTitle", js.undefined)
    @scala.inline
    def setApplicationIconBadgeNumber(value: Double): Self = this.set("applicationIconBadgeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationIconBadgeNumber: Self = this.set("applicationIconBadgeNumber", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setFireDate(value: Double | String): Self = this.set("fireDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireDate: Self = this.set("fireDate", js.undefined)
    @scala.inline
    def setIsSilent(value: Boolean): Self = this.set("isSilent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSilent: Self = this.set("isSilent", js.undefined)
    @scala.inline
    def setRepeatInterval(value: year | month | week | day | hour | minute): Self = this.set("repeatInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatInterval: Self = this.set("repeatInterval", js.undefined)
    @scala.inline
    def setSoundName(value: String): Self = this.set("soundName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoundName: Self = this.set("soundName", js.undefined)
    @scala.inline
    def setUserInfo(value: js.Object): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
  
}

