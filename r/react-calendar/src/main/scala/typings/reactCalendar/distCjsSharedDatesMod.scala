package typings.reactCalendar

import typings.reactCalendar.distCjsSharedTypesMod.CalendarType
import typings.reactCalendar.distCjsSharedTypesMod.RangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedDatesMod {
  
  @JSImport("react-calendar/dist/cjs/shared/dates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBegin(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBegin")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getBeginNext(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBeginNext")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getBeginNext2(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBeginNext2")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getBeginOfCenturyYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeginOfCenturyYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBeginOfDecadeYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeginOfDecadeYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBeginOfWeek(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeginOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getBeginOfWeek(date: js.Date, calendarType: CalendarType): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBeginOfWeek")(date.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getBeginPrevious(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBeginPrevious")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getBeginPrevious2(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBeginPrevious2")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getCenturyLabel(
    locale: String,
    formatYear: js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String],
    date: js.Date
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenturyLabel")(locale.asInstanceOf[js.Any], formatYear.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getCenturyLabel(
    locale: Unit,
    formatYear: js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String],
    date: js.Date
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCenturyLabel")(locale.asInstanceOf[js.Any], formatYear.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDayOfWeek(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDayOfWeek(date: js.Date, calendarType: CalendarType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfWeek")(date.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDecadeLabel(
    locale: String,
    formatYear: js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String],
    date: js.Date
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDecadeLabel")(locale.asInstanceOf[js.Any], formatYear.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getDecadeLabel(
    locale: Unit,
    formatYear: js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String],
    date: js.Date
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDecadeLabel")(locale.asInstanceOf[js.Any], formatYear.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getEnd(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnd")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getEndPrevious(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndPrevious")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getEndPrevious2(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndPrevious2")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getRange(rangeType: RangeType, date: js.Date): js.Tuple2[js.Date, js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getValueRange(rangeType: RangeType, date1: js.Date, date2: js.Date): js.Tuple2[js.Date, js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueRange")(rangeType.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getWeekNumber(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWeekNumber(date: js.Date, calendarType: CalendarType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isCurrentDayOfWeek(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentDayOfWeek")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWeekend(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekend")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isWeekend(date: js.Date, calendarType: CalendarType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWeekend")(date.asInstanceOf[js.Any], calendarType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
