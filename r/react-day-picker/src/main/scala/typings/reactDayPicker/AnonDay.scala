package typings.reactDayPicker

import typings.reactDayPicker.commonMod.Modifier
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDay extends js.Object {
  def dayMatchesModifier(day: Date): Boolean = js.native
  def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
  def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
  def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
}

