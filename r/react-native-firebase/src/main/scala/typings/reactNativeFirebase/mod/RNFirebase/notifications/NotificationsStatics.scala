package typings.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeFirebase.anon.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsStatics extends js.Object {
  var Android: Action = js.native
  var Notification: Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.notifications.Notification] = js.native
}

object NotificationsStatics {
  @scala.inline
  def apply(Android: Action, Notification: Instantiable0[Notification]): NotificationsStatics = {
    val __obj = js.Dynamic.literal(Android = Android.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsStatics]
  }
  @scala.inline
  implicit class NotificationsStaticsOps[Self <: NotificationsStatics] (val x: Self) extends AnyVal {
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
    def setAndroid(value: Action): Self = this.set("Android", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotification(value: Instantiable0[Notification]): Self = this.set("Notification", value.asInstanceOf[js.Any])
  }
  
}

