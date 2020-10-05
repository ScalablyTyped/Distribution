package typings.rxjs.testMessageMod

import typings.rxjs.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMessage extends js.Object {
  var frame: Double = js.native
  var isGhost: js.UndefOr[Boolean] = js.native
  var notification: Notification[_] = js.native
}

object TestMessage {
  @scala.inline
  def apply(frame: Double, notification: Notification[_]): TestMessage = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessage]
  }
  @scala.inline
  implicit class TestMessageOps[Self <: TestMessage] (val x: Self) extends AnyVal {
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
    def setFrame(value: Double): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotification(value: Notification[_]): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGhost(value: Boolean): Self = this.set("isGhost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGhost: Self = this.set("isGhost", js.undefined)
  }
  
}

