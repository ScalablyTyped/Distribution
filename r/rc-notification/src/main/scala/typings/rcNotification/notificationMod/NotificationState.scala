package typings.rcNotification.notificationMod

import typings.rcNotification.anon.HolderCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationState extends js.Object {
  var notices: js.Array[HolderCallback] = js.native
}

object NotificationState {
  @scala.inline
  def apply(notices: js.Array[HolderCallback]): NotificationState = {
    val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationState]
  }
  @scala.inline
  implicit class NotificationStateOps[Self <: NotificationState] (val x: Self) extends AnyVal {
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
    def setNoticesVarargs(value: HolderCallback*): Self = this.set("notices", js.Array(value :_*))
    @scala.inline
    def setNotices(value: js.Array[HolderCallback]): Self = this.set("notices", value.asInstanceOf[js.Any])
  }
  
}

