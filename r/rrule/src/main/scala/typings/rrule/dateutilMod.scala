package typings.rrule

import typings.rrule.anon.PickDategetTime
import typings.rrule.datetimeMod.Time
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateutilMod {
  
  object default {
    
    @JSImport("rrule/dist/esm/src/dateutil", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.MAXYEAR")
    @js.native
    val MAXYEAR: /* 9999 */ Double = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.MONTH_DAYS")
    @js.native
    val MONTH_DAYS: js.Array[Double] = js.native
    
    /**
      * Number of milliseconds of one day
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.ONE_DAY")
    @js.native
    val ONE_DAY: Double = js.native
    
    /**
      * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
      * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
      * therefore we use 1-Jan-1970 instead
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.ORDINAL_BASE")
    @js.native
    val ORDINAL_BASE: Date = js.native
    
    /**
      * Python: MO-SU: 0 - 6
      * JS: SU-SAT 0 - 6
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.PY_WEEKDAYS")
    @js.native
    val PY_WEEKDAYS: js.Array[Double] = js.native
    
    inline def cloneDates(dates: js.Array[Date | Time]): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDates")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
    
    inline def clone_(date: Time): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def clone_(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    inline def combine(date: Date, time: Time): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    inline def combine(date: Date, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    inline def daysBetween(date1: Date, date2: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysBetween")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    inline def fromOrdinal(ordinal: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOrdinal")(ordinal.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    inline def getMonthDays(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthDays")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} python-like weekday
      */
    inline def getWeekday(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekday")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * py_date.timetuple()[7]
      */
    inline def getYearDay(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearDay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isDate(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidDate(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    inline def monthRange(year: Double, month: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthRange")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    inline def sort[T /* <: PickDategetTime */](dates: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(dates.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def timeToUntilString(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def timeToUntilString(time: Double, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    inline def toOrdinal(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} the date's timezone offset in ms
      */
    inline def tzOffset(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tzOffset")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def untilStringToDate(until: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("untilStringToDate")(until.asInstanceOf[js.Any]).asInstanceOf[Date]
  }
  
  object dateutil {
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.MAXYEAR")
    @js.native
    val MAXYEAR: /* 9999 */ Double = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.MONTH_DAYS")
    @js.native
    val MONTH_DAYS: js.Array[Double] = js.native
    
    /**
      * Number of milliseconds of one day
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.ONE_DAY")
    @js.native
    val ONE_DAY: Double = js.native
    
    /**
      * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
      * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
      * therefore we use 1-Jan-1970 instead
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.ORDINAL_BASE")
    @js.native
    val ORDINAL_BASE: Date = js.native
    
    /**
      * Python: MO-SU: 0 - 6
      * JS: SU-SAT 0 - 6
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.PY_WEEKDAYS")
    @js.native
    val PY_WEEKDAYS: js.Array[Double] = js.native
    
    inline def cloneDates(dates: js.Array[Date | Time]): js.Array[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDates")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
    
    inline def clone_(date: Time): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def clone_(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    inline def combine(date: Date, time: Time): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    inline def combine(date: Date, time: Date): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    inline def daysBetween(date1: Date, date2: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysBetween")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    inline def fromOrdinal(ordinal: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOrdinal")(ordinal.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    inline def getMonthDays(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthDays")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} python-like weekday
      */
    inline def getWeekday(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekday")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * py_date.timetuple()[7]
      */
    inline def getYearDay(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearDay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isDate(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidDate(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    inline def monthRange(year: Double, month: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthRange")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    inline def sort[T /* <: PickDategetTime */](dates: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(dates.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def timeToUntilString(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def timeToUntilString(time: Double, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    inline def toOrdinal(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} the date's timezone offset in ms
      */
    inline def tzOffset(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tzOffset")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def untilStringToDate(until: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("untilStringToDate")(until.asInstanceOf[js.Any]).asInstanceOf[Date]
  }
}
