package typings.rmcCalendar.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstDate extends js.Object {
  var firstDate: Date
  var lastDate: Date
}

object FirstDate {
  @scala.inline
  def apply(firstDate: Date, lastDate: Date): FirstDate = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDate]
  }
}

