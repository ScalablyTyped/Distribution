package typings.reactDates

import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndDate extends js.Object {
  var endDate: momentObj | Null
  var startDate: momentObj | Null
}

object AnonEndDate {
  @scala.inline
  def apply(endDate: momentObj = null, startDate: momentObj = null): AnonEndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndDate]
  }
}

