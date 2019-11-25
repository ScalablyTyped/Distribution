package typings.rmcDashCalendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstDate extends js.Object {
  var firstDate: Date
  var lastDate: Date
}

object Anon_FirstDate {
  @scala.inline
  def apply(firstDate: Date, lastDate: Date): Anon_FirstDate = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FirstDate]
  }
}

