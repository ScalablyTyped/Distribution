package typings.reactDayPicker.modifiersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaysOfWeekModifier extends _Modifier {
  var daysOfWeek: js.Array[Double]
}

object DaysOfWeekModifier {
  @scala.inline
  def apply(daysOfWeek: js.Array[Double]): DaysOfWeekModifier = {
    val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaysOfWeekModifier]
  }
}

