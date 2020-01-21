package typings.reactDateRange.mod

import typings.moment.mod.Moment
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
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

