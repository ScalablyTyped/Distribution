package typings.reactBigCalendar

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  var end: stringOrDate
  var start: stringOrDate
}

object AnonStart {
  @scala.inline
  def apply(end: stringOrDate, start: stringOrDate): AnonStart = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

