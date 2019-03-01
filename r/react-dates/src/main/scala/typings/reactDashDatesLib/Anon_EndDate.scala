package typings
package reactDashDatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndDate extends js.Object {
  var endDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null
  var startDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null
}

object Anon_EndDate {
  @scala.inline
  def apply(
    endDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj = null,
    startDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj = null
  ): Anon_EndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Anon_EndDate]
  }
}

