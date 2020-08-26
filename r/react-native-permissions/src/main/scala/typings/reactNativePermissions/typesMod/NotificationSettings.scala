package typings.reactNativePermissions.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings extends js.Object {
  var alert: js.UndefOr[Boolean] = js.native
  var badge: js.UndefOr[Boolean] = js.native
  var carPlay: js.UndefOr[Boolean] = js.native
  var criticalAlert: js.UndefOr[Boolean] = js.native
  var lockScreen: js.UndefOr[Boolean] = js.native
  var notificationCenter: js.UndefOr[Boolean] = js.native
  var sound: js.UndefOr[Boolean] = js.native
}

object NotificationSettings {
  @scala.inline
  def apply(): NotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSettings]
  }
  @scala.inline
  implicit class NotificationSettingsOps[Self <: NotificationSettings] (val x: Self) extends AnyVal {
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
    def setAlert(value: Boolean): Self = this.set("alert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    @scala.inline
    def setBadge(value: Boolean): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setCarPlay(value: Boolean): Self = this.set("carPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarPlay: Self = this.set("carPlay", js.undefined)
    @scala.inline
    def setCriticalAlert(value: Boolean): Self = this.set("criticalAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriticalAlert: Self = this.set("criticalAlert", js.undefined)
    @scala.inline
    def setLockScreen(value: Boolean): Self = this.set("lockScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreen: Self = this.set("lockScreen", js.undefined)
    @scala.inline
    def setNotificationCenter(value: Boolean): Self = this.set("notificationCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationCenter: Self = this.set("notificationCenter", js.undefined)
    @scala.inline
    def setSound(value: Boolean): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
  }
  
}

