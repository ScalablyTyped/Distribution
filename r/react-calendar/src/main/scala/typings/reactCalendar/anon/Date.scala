package typings.reactCalendar.anon

import typings.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: typings.std.Date
  var label: String
  var view: Detail
}

object Date {
  @scala.inline
  def apply(date: typings.std.Date, label: String, view: Detail): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

