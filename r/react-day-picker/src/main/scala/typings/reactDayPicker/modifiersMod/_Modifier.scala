package typings.reactDayPicker.modifiersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Modifier extends js.Object

object _Modifier {
  @scala.inline
  def DaysOfWeekModifier(daysOfWeek: js.Array[Double]): _Modifier = {
    val __obj = js.Dynamic.literal(daysOfWeek = daysOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Modifier]
  }
  @scala.inline
  def RangeModifier(from: Date, to: Date): _Modifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Modifier]
  }
  @scala.inline
  def BeforeModifier(before: Date): _Modifier = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Modifier]
  }
  @scala.inline
  def BeforeAfterModifier(after: Date, before: Date): _Modifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Modifier]
  }
  @scala.inline
  def AfterModifier(after: Date): _Modifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Modifier]
  }
}

