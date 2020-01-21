package typings.rmcCalendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstDate extends js.Object {
  var firstDate: Date
  var lastDate: Date
}

object AnonFirstDate {
  @scala.inline
  def apply(firstDate: Date, lastDate: Date): AnonFirstDate = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstDate]
  }
}

