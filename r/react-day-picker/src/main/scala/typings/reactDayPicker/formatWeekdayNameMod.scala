package typings.reactDayPicker

import typings.reactDayPicker.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWeekdayNameMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/formatters/formatWeekdayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatWeekdayName(weekday: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayName")(weekday.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatWeekdayName(weekday: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayName")(weekday.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
