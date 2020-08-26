package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresentLocalNotificationDetails extends js.Object {
  var alertAction: String = js.native
  var alertBody: String = js.native
  var alertTitle: js.UndefOr[String] = js.native
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.native
  var category: js.UndefOr[String] = js.native
  var soundName: js.UndefOr[String] = js.native
  var userInfo: js.UndefOr[js.Object] = js.native
}

object PresentLocalNotificationDetails {
  @scala.inline
  def apply(alertAction: String, alertBody: String): PresentLocalNotificationDetails = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentLocalNotificationDetails]
  }
  @scala.inline
  implicit class PresentLocalNotificationDetailsOps[Self <: PresentLocalNotificationDetails] (val x: Self) extends AnyVal {
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
    def setAlertBody(value: String): Self = this.set("alertBody", value.asInstanceOf[js.Any])
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
    def setSoundName(value: String): Self = this.set("soundName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoundName: Self = this.set("soundName", js.undefined)
    @scala.inline
    def setUserInfo(value: js.Object): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
  
}

