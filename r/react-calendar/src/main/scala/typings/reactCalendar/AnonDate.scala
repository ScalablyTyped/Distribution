package typings.reactCalendar

import typings.reactCalendar.mod.Detail
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: Date
  var label: String
  var view: Detail
}

object AnonDate {
  @scala.inline
  def apply(date: Date, label: String, view: Detail): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

