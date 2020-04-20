package typings.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextMonth extends js.Object {
  var nextMonth: String
  var previousMonth: String
}

object AnonNextMonth {
  @scala.inline
  def apply(nextMonth: String, previousMonth: String): AnonNextMonth = {
    val __obj = js.Dynamic.literal(nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextMonth]
  }
}

