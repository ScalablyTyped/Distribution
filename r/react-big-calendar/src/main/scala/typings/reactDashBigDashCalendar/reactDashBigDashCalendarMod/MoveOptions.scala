package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOptions extends js.Object {
  var action: NavigateAction
  var date: Date
  var today: Date
}

object MoveOptions {
  @scala.inline
  def apply(action: NavigateAction, date: Date, today: Date): MoveOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoveOptions]
  }
}

