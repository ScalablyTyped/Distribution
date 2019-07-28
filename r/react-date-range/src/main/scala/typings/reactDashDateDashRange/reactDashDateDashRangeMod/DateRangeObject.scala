package typings.reactDashDateDashRange.reactDashDateDashRangeMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeObject extends js.Object {
  def endDate(now: Moment): Moment
  def startDate(now: Moment): Moment
}

object DateRangeObject {
  @scala.inline
  def apply(endDate: Moment => Moment, startDate: Moment => Moment): DateRangeObject = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), startDate = js.Any.fromFunction1(startDate))
  
    __obj.asInstanceOf[DateRangeObject]
  }
}

