package typings
package reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateState extends js.Object {
  var range: momentDashRangeLib.momentDashRangeMod.DateRange
  var state: java.lang.String
}

object DateState {
  @scala.inline
  def apply(range: momentDashRangeLib.momentDashRangeMod.DateRange, state: java.lang.String): DateState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[DateState]
  }
}

