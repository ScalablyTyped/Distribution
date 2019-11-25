package typings.rmcDashCalendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndDate extends js.Object {
  var endDate: js.UndefOr[Date] = js.undefined
  var startDate: js.UndefOr[Date] = js.undefined
}

object Anon_EndDate {
  @scala.inline
  def apply(endDate: Date = null, startDate: Date = null): Anon_EndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndDate]
  }
}

