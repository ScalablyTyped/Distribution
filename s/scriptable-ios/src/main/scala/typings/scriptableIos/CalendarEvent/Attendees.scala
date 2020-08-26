package typings.scriptableIos.CalendarEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attendees extends js.Object {
  var isCurrentUser: Boolean = js.native
  var name: String = js.native
  var role: String = js.native
  var status: String = js.native
  var `type`: String = js.native
}

object Attendees {
  @scala.inline
  def apply(isCurrentUser: Boolean, name: String, role: String, status: String, `type`: String): Attendees = {
    val __obj = js.Dynamic.literal(isCurrentUser = isCurrentUser.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attendees]
  }
  @scala.inline
  implicit class AttendeesOps[Self <: Attendees] (val x: Self) extends AnyVal {
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
    def setIsCurrentUser(value: Boolean): Self = this.set("isCurrentUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

