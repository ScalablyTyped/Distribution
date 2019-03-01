package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaysOfWeekModifier extends js.Object {
  var daysOfWeek: js.Array[scala.Double]
}

object DaysOfWeekModifier {
  @scala.inline
  def apply(daysOfWeek: js.Array[scala.Double]): DaysOfWeekModifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    __obj.asInstanceOf[DaysOfWeekModifier]
  }
}

