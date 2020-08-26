package typings.reapop.mod

import typings.reapop.anon.ClassName
import typings.reapop.anon.EnterTimeout
import typings.reapop.anon.Main
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSystemTheme extends js.Object {
  var notificationClassName: js.UndefOr[typings.reapop.anon.Button] = js.native
  var notificationsContainerClassName: js.UndefOr[Main] = js.native
  var notificationsContainerTransition: js.UndefOr[EnterTimeout] = js.native
  var notificationsSystem: js.UndefOr[ClassName] = js.native
  var smallScreenMin: js.UndefOr[Double] = js.native
}

object NotificationSystemTheme {
  @scala.inline
  def apply(): NotificationSystemTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSystemTheme]
  }
  @scala.inline
  implicit class NotificationSystemThemeOps[Self <: NotificationSystemTheme] (val x: Self) extends AnyVal {
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
    def setNotificationClassName(value: typings.reapop.anon.Button): Self = this.set("notificationClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationClassName: Self = this.set("notificationClassName", js.undefined)
    @scala.inline
    def setNotificationsContainerClassName(value: Main): Self = this.set("notificationsContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationsContainerClassName: Self = this.set("notificationsContainerClassName", js.undefined)
    @scala.inline
    def setNotificationsContainerTransition(value: EnterTimeout): Self = this.set("notificationsContainerTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationsContainerTransition: Self = this.set("notificationsContainerTransition", js.undefined)
    @scala.inline
    def setNotificationsSystem(value: ClassName): Self = this.set("notificationsSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationsSystem: Self = this.set("notificationsSystem", js.undefined)
    @scala.inline
    def setSmallScreenMin(value: Double): Self = this.set("smallScreenMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallScreenMin: Self = this.set("smallScreenMin", js.undefined)
  }
  
}

