package typings
package reactDashDateDashRangeLib.reactDashDateDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeObject extends js.Object {
  def endDate(now: momentLib.momentMod.Moment): momentLib.momentMod.Moment
  def startDate(now: momentLib.momentMod.Moment): momentLib.momentMod.Moment
}

object DateRangeObject {
  @scala.inline
  def apply(
    endDate: momentLib.momentMod.Moment => momentLib.momentMod.Moment,
    startDate: momentLib.momentMod.Moment => momentLib.momentMod.Moment
  ): DateRangeObject = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), startDate = js.Any.fromFunction1(startDate))
  
    __obj.asInstanceOf[DateRangeObject]
  }
}

