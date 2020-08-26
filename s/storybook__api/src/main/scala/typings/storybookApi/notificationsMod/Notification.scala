package typings.storybookApi.notificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var id: String = js.native
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
}

object Notification {
  @scala.inline
  def apply(id: String): Notification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
  }
  
}

