package typings.reactDashDates

import typings.reactDashDates.reactDashDatesMod.momentPropTypesNs.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndDate extends js.Object {
  var endDate: momentObj | Null
  var startDate: momentObj | Null
}

object Anon_EndDate {
  @scala.inline
  def apply(endDate: momentObj = null, startDate: momentObj = null): Anon_EndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Anon_EndDate]
  }
}

