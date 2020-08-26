package typings.reactDayPicker.modifiersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaysOfWeekModifier extends _Modifier {
  var daysOfWeek: js.Array[Double] = js.native
}

object DaysOfWeekModifier {
  @scala.inline
  def apply(daysOfWeek: js.Array[Double]): DaysOfWeekModifier = {
    val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaysOfWeekModifier]
  }
  @scala.inline
  implicit class DaysOfWeekModifierOps[Self <: DaysOfWeekModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDaysOfWeekVarargs(value: Double*): Self = this.set("daysOfWeek", js.Array(value :_*))
    @scala.inline
    def setDaysOfWeek(value: js.Array[Double]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
  }
  
}

