package typings.reactNativePushNotification.mod

import typings.reactNativePushNotification.anon.Os
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationOptions extends js.Object {
  var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, Unit]] = js.native
  var onRegister: js.UndefOr[js.Function1[/* token */ Os, Unit]] = js.native
  var permissions: js.UndefOr[PushNotificationPermissions] = js.native
  var popInitialNotification: js.UndefOr[Boolean] = js.native
  var requestPermissions: js.UndefOr[Boolean] = js.native
  var senderID: js.UndefOr[String] = js.native
}

object PushNotificationOptions {
  @scala.inline
  def apply(): PushNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationOptions]
  }
  @scala.inline
  implicit class PushNotificationOptionsOps[Self <: PushNotificationOptions] (val x: Self) extends AnyVal {
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
    def setOnNotification(value: /* notification */ PushNotification => Unit): Self = this.set("onNotification", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNotification: Self = this.set("onNotification", js.undefined)
    @scala.inline
    def setOnRegister(value: /* token */ Os => Unit): Self = this.set("onRegister", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegister: Self = this.set("onRegister", js.undefined)
    @scala.inline
    def setPermissions(value: PushNotificationPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setPopInitialNotification(value: Boolean): Self = this.set("popInitialNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopInitialNotification: Self = this.set("popInitialNotification", js.undefined)
    @scala.inline
    def setRequestPermissions(value: Boolean): Self = this.set("requestPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPermissions: Self = this.set("requestPermissions", js.undefined)
    @scala.inline
    def setSenderID(value: String): Self = this.set("senderID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderID: Self = this.set("senderID", js.undefined)
  }
  
}

