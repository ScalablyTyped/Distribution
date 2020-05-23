package typings.reactDayPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextMonth extends js.Object {
  var nextMonth: String
  var previousMonth: String
}

object NextMonth {
  @scala.inline
  def apply(nextMonth: String, previousMonth: String): NextMonth = {
    val __obj = js.Dynamic.literal(nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextMonth]
  }
}

