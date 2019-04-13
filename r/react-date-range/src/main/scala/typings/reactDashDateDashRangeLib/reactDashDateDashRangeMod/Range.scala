package typings
package reactDashDateDashRangeLib.reactDashDateDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** default: today */
  var endDate: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  /** default: today */
  var startDate: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
}

object Range {
  @scala.inline
  def apply(endDate: momentLib.momentMod.Moment = null, startDate: momentLib.momentMod.Moment = null): Range = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Range]
  }
}

