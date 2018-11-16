package typings
package reactDashDayDashPickerLib.typesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifiersUtils extends js.Object {
  def dayMatchesModifier(day: stdLib.Date): scala.Boolean = js.native
  def dayMatchesModifier(day: stdLib.Date, modifier: js.Array[reactDashDayDashPickerLib.typesCommonMod.Modifier]): scala.Boolean = js.native
  def dayMatchesModifier(day: stdLib.Date, modifier: reactDashDayDashPickerLib.typesCommonMod.Modifier): scala.Boolean = js.native
  def getModifiersForDay(
    day: stdLib.Date,
    modifiers: stdLib.Record[
      java.lang.String, 
      reactDashDayDashPickerLib.typesCommonMod.Modifier | js.Array[reactDashDayDashPickerLib.typesCommonMod.Modifier]
    ]
  ): js.Array[java.lang.String] = js.native
}

