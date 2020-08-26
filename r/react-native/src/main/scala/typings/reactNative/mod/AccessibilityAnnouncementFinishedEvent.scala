package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityAnnouncementFinishedEvent extends js.Object {
  var announcement: String = js.native
  var success: Boolean = js.native
}

object AccessibilityAnnouncementFinishedEvent {
  @scala.inline
  def apply(announcement: String, success: Boolean): AccessibilityAnnouncementFinishedEvent = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAnnouncementFinishedEvent]
  }
  @scala.inline
  implicit class AccessibilityAnnouncementFinishedEventOps[Self <: AccessibilityAnnouncementFinishedEvent] (val x: Self) extends AnyVal {
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
    def setAnnouncement(value: String): Self = this.set("announcement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

