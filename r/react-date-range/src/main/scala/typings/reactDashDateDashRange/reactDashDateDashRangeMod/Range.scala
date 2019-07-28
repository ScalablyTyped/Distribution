package typings.reactDashDateDashRange.reactDashDateDashRangeMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** default: today */
  var endDate: js.UndefOr[Moment] = js.undefined
  /** default: today */
  var startDate: js.UndefOr[Moment] = js.undefined
}

object Range {
  @scala.inline
  def apply(endDate: Moment = null, startDate: Moment = null): Range = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Range]
  }
}

