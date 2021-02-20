package typings.rrule

import typings.rrule.anon.PickDategetTime
import typings.rrule.datetimeMod.Time
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateutilMod {
  
  object default {
    
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
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.cloneDates")
    @js.native
    def cloneDates(dates: js.Array[Date | Time]): js.Array[Date] = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.clone")
    @js.native
    def clone_(date: Time): Date = js.native
    @JSImport("rrule/dist/esm/src/dateutil", "default.clone")
    @js.native
    def clone_(date: Date): Date = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.combine")
    @js.native
    def combine(date: Date, time: Time): Date = js.native
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.combine")
    @js.native
    def combine(date: Date, time: Date): Date = js.native
    
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.daysBetween")
    @js.native
    def daysBetween(date1: Date, date2: Date): Double = js.native
    
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.fromOrdinal")
    @js.native
    def fromOrdinal(ordinal: Double): Date = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.getMonthDays")
    @js.native
    def getMonthDays(date: Date): Double = js.native
    
    /**
      * @return {Number} python-like weekday
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.getWeekday")
    @js.native
    def getWeekday(date: Date): Double = js.native
    
    /**
      * py_date.timetuple()[7]
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.getYearDay")
    @js.native
    def getYearDay(date: Date): Double = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.isDate")
    @js.native
    def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.isLeapYear")
    @js.native
    def isLeapYear(year: Double): Boolean = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.isValidDate")
    @js.native
    def isValidDate(value: js.Any): /* is std.Date */ Boolean = js.native
    
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.monthRange")
    @js.native
    def monthRange(year: Double, month: Double): js.Array[Double] = js.native
    
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.sort")
    @js.native
    def sort[T /* <: PickDategetTime */](dates: js.Array[T]): Unit = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.timeToUntilString")
    @js.native
    def timeToUntilString(time: Double): String = js.native
    @JSImport("rrule/dist/esm/src/dateutil", "default.timeToUntilString")
    @js.native
    def timeToUntilString(time: Double, utc: Boolean): String = js.native
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.toOrdinal")
    @js.native
    def toOrdinal(date: Date): Double = js.native
    
    /**
      * @return {Number} the date's timezone offset in ms
      */
    @JSImport("rrule/dist/esm/src/dateutil", "default.tzOffset")
    @js.native
    def tzOffset(date: Date): Double = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "default.untilStringToDate")
    @js.native
    def untilStringToDate(until: String): Date = js.native
  }
  
  object dateutil {
    
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
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.cloneDates")
    @js.native
    def cloneDates(dates: js.Array[Date | Time]): js.Array[Date] = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.clone")
    @js.native
    def clone_(date: Time): Date = js.native
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.clone")
    @js.native
    def clone_(date: Date): Date = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.combine")
    @js.native
    def combine(date: Date, time: Time): Date = js.native
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.combine")
    @js.native
    def combine(date: Date, time: Date): Date = js.native
    
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.daysBetween")
    @js.native
    def daysBetween(date1: Date, date2: Date): Double = js.native
    
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.fromOrdinal")
    @js.native
    def fromOrdinal(ordinal: Double): Date = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.getMonthDays")
    @js.native
    def getMonthDays(date: Date): Double = js.native
    
    /**
      * @return {Number} python-like weekday
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.getWeekday")
    @js.native
    def getWeekday(date: Date): Double = js.native
    
    /**
      * py_date.timetuple()[7]
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.getYearDay")
    @js.native
    def getYearDay(date: Date): Double = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.isDate")
    @js.native
    def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.isLeapYear")
    @js.native
    def isLeapYear(year: Double): Boolean = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.isValidDate")
    @js.native
    def isValidDate(value: js.Any): /* is std.Date */ Boolean = js.native
    
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.monthRange")
    @js.native
    def monthRange(year: Double, month: Double): js.Array[Double] = js.native
    
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.sort")
    @js.native
    def sort[T /* <: PickDategetTime */](dates: js.Array[T]): Unit = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.timeToUntilString")
    @js.native
    def timeToUntilString(time: Double): String = js.native
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.timeToUntilString")
    @js.native
    def timeToUntilString(time: Double, utc: Boolean): String = js.native
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.toOrdinal")
    @js.native
    def toOrdinal(date: Date): Double = js.native
    
    /**
      * @return {Number} the date's timezone offset in ms
      */
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.tzOffset")
    @js.native
    def tzOffset(date: Date): Double = js.native
    
    @JSImport("rrule/dist/esm/src/dateutil", "dateutil.untilStringToDate")
    @js.native
    def untilStringToDate(until: String): Date = js.native
  }
}
