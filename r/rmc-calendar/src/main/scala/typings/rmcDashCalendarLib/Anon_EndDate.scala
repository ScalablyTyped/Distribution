package typings
package rmcDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndDate extends js.Object {
  var endDate: js.UndefOr[stdLib.Date] = js.undefined
  var startDate: js.UndefOr[stdLib.Date] = js.undefined
}

object Anon_EndDate {
  @scala.inline
  def apply(endDate: stdLib.Date = null, startDate: stdLib.Date = null): Anon_EndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Anon_EndDate]
  }
}

