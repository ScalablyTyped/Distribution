package typings.reactBigCalendar

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndStart extends js.Object {
  var end: stringOrDate
  var start: stringOrDate
}

object AnonEndStart {
  @scala.inline
  def apply(end: stringOrDate, start: stringOrDate): AnonEndStart = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndStart]
  }
}

