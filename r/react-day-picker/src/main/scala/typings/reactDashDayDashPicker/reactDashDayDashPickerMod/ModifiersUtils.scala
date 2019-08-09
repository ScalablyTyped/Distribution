package typings.reactDashDayDashPicker.reactDashDayDashPickerMod

import typings.reactDashDayDashPicker.typesCommonMod.Modifier
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker", "ModifiersUtils")
@js.native
object ModifiersUtils extends js.Object {
  def dayMatchesModifier(day: Date): Boolean = js.native
  def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
  def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
  def getModifiersForDay(day: Date, modifiers: Record[String, js.Array[Modifier] | Modifier]): js.Array[String] = js.native
}

