package typings.reactDates

import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndDateStartDate extends js.Object {
  var endDate: momentObj
  var startDate: momentObj
}

object AnonEndDateStartDate {
  @scala.inline
  def apply(endDate: momentObj, startDate: momentObj): AnonEndDateStartDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndDateStartDate]
  }
}

