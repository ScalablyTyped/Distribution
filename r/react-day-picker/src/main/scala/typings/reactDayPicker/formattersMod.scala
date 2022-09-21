package typings.reactDayPicker

import typings.reactDayPicker.anon.`0`
import typings.reactDayPicker.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCaption(month: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCaption")(month.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatCaption(month: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCaption")(month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDay(day: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDay(day: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(day.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonthCaption(month: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthCaption")(month.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatMonthCaption(month: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthCaption")(month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatWeekNumber(weekNumber: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekNumber")(weekNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatWeekdayName(weekday: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayName")(weekday.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatWeekdayName(weekday: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWeekdayName")(weekday.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatYearCaption(year: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYearCaption")(year.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatYearCaption(year: js.Date, options: `1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatYearCaption")(year.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
