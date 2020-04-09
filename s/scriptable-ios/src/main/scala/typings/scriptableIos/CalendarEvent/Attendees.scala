package typings.scriptableIos.CalendarEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attendees extends js.Object {
  var isCurrentUser: Boolean
  var name: String
  var role: String
  var status: String
  var `type`: String
}

object Attendees {
  @scala.inline
  def apply(isCurrentUser: Boolean, name: String, role: String, status: String, `type`: String): Attendees = {
    val __obj = js.Dynamic.literal(isCurrentUser = isCurrentUser.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attendees]
  }
}

