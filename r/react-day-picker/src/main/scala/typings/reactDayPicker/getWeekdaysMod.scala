package typings.reactDayPicker

import typings.dateFns.mod.Locale
import typings.reactDayPicker.reactDayPickerNumbers.`0`
import typings.reactDayPicker.reactDayPickerNumbers.`1`
import typings.reactDayPicker.reactDayPickerNumbers.`2`
import typings.reactDayPicker.reactDayPickerNumbers.`3`
import typings.reactDayPicker.reactDayPickerNumbers.`4`
import typings.reactDayPicker.reactDayPickerNumbers.`5`
import typings.reactDayPicker.reactDayPickerNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWeekdaysMod {
  
  @JSImport("react-day-picker/dist/components/HeadRow/utils/getWeekdays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWeekdays(): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekdays")().asInstanceOf[js.Array[js.Date]]
  inline def getWeekdays(
    locale: Unit,
    /** The index of the first day of the week (0 - Sunday) */
  weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6`
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekdays")(locale.asInstanceOf[js.Any], weekStartsOn.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getWeekdays(locale: Locale): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekdays")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def getWeekdays(
    locale: Locale,
    /** The index of the first day of the week (0 - Sunday) */
  weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6`
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekdays")(locale.asInstanceOf[js.Any], weekStartsOn.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
}
