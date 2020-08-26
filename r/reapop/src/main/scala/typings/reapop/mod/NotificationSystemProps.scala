package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSystemProps extends js.Object {
  var filter: js.UndefOr[js.Function1[/* notification */ Notification, Boolean]] = js.native
  var theme: NotificationSystemTheme = js.native
}

object NotificationSystemProps {
  @scala.inline
  def apply(theme: NotificationSystemTheme): NotificationSystemProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSystemProps]
  }
  @scala.inline
  implicit class NotificationSystemPropsOps[Self <: NotificationSystemProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: NotificationSystemTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: /* notification */ Notification => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
  
}

