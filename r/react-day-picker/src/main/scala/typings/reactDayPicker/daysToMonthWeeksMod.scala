package typings.reactDayPicker

import typings.reactDayPicker.anon.FirstWeekContainsDate
import typings.reactDayPicker.getMonthWeeksMod.MonthWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daysToMonthWeeksMod {
  
  @JSImport("react-day-picker/dist/components/Table/utils/daysToMonthWeeks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def daysToMonthWeeks(fromDate: js.Date, toDate: js.Date): js.Array[MonthWeek] = (^.asInstanceOf[js.Dynamic].applyDynamic("daysToMonthWeeks")(fromDate.asInstanceOf[js.Any], toDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[MonthWeek]]
  inline def daysToMonthWeeks(fromDate: js.Date, toDate: js.Date, options: FirstWeekContainsDate): js.Array[MonthWeek] = (^.asInstanceOf[js.Dynamic].applyDynamic("daysToMonthWeeks")(fromDate.asInstanceOf[js.Any], toDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[MonthWeek]]
}
