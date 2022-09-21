package typings.rrule

import typings.rrule.datetimeMod.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateutilMod {
  
  object default {
    
    @JSImport("rrule/dist/esm/dateutil", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
      */
    @JSImport("rrule/dist/esm/dateutil", "default.MAXYEAR")
    @js.native
    val MAXYEAR: /* 9999 */ Double = js.native
    
    @JSImport("rrule/dist/esm/dateutil", "default.MONTH_DAYS")
    @js.native
    val MONTH_DAYS: js.Array[Double] = js.native
    
    /**
      * Number of milliseconds of one day
      */
    @JSImport("rrule/dist/esm/dateutil", "default.ONE_DAY")
    @js.native
    val ONE_DAY: Double = js.native
    
    /**
      * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
      * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
      * therefore we use 1-Jan-1970 instead
      */
    @JSImport("rrule/dist/esm/dateutil", "default.ORDINAL_BASE")
    @js.native
    val ORDINAL_BASE: js.Date = js.native
    
    /**
      * Python: MO-SU: 0 - 6
      * JS: SU-SAT 0 - 6
      */
    @JSImport("rrule/dist/esm/dateutil", "default.PY_WEEKDAYS")
    @js.native
    val PY_WEEKDAYS: js.Array[Double] = js.native
    
    inline def cloneDates(dates: js.Array[js.Date | Time]): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDates")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    
    inline def clone_(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def clone_(date: Time): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    inline def combine(date: js.Date, time: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def combine(date: js.Date, time: Time): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    inline def daysBetween(date1: js.Date, date2: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysBetween")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    inline def fromOrdinal(ordinal: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOrdinal")(ordinal.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def getMonthDays(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthDays")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} python-like weekday
      */
    inline def getWeekday(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekday")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * py_date.timetuple()[7]
      */
    inline def getYearDay(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearDay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    inline def monthRange(year: Double, month: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthRange")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    inline def sort[T /* <: Datelike */](dates: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(dates.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def timeToUntilString(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def timeToUntilString(time: Double, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    inline def toOrdinal(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} the date's timezone offset in ms
      */
    inline def tzOffset(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tzOffset")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def untilStringToDate(until: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("untilStringToDate")(until.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  }
  
  object dateutil {
    
    @JSImport("rrule/dist/esm/dateutil", "dateutil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
      */
    @JSImport("rrule/dist/esm/dateutil", "dateutil.MAXYEAR")
    @js.native
    val MAXYEAR: /* 9999 */ Double = js.native
    
    @JSImport("rrule/dist/esm/dateutil", "dateutil.MONTH_DAYS")
    @js.native
    val MONTH_DAYS: js.Array[Double] = js.native
    
    /**
      * Number of milliseconds of one day
      */
    @JSImport("rrule/dist/esm/dateutil", "dateutil.ONE_DAY")
    @js.native
    val ONE_DAY: Double = js.native
    
    /**
      * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
      * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
      * therefore we use 1-Jan-1970 instead
      */
    @JSImport("rrule/dist/esm/dateutil", "dateutil.ORDINAL_BASE")
    @js.native
    val ORDINAL_BASE: js.Date = js.native
    
    /**
      * Python: MO-SU: 0 - 6
      * JS: SU-SAT 0 - 6
      */
    @JSImport("rrule/dist/esm/dateutil", "dateutil.PY_WEEKDAYS")
    @js.native
    val PY_WEEKDAYS: js.Array[Double] = js.native
    
    inline def cloneDates(dates: js.Array[js.Date | Time]): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDates")(dates.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
    
    inline def clone_(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def clone_(date: Time): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    inline def combine(date: js.Date, time: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def combine(date: js.Date, time: Time): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    inline def daysBetween(date1: js.Date, date2: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysBetween")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    inline def fromOrdinal(ordinal: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOrdinal")(ordinal.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def getMonthDays(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthDays")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} python-like weekday
      */
    inline def getWeekday(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekday")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * py_date.timetuple()[7]
      */
    inline def getYearDay(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearDay")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    inline def monthRange(year: Double, month: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthRange")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    inline def sort[T /* <: Datelike */](dates: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(dates.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def timeToUntilString(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def timeToUntilString(time: Double, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUntilString")(time.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    inline def toOrdinal(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * @return {Number} the date's timezone offset in ms
      */
    inline def tzOffset(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tzOffset")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def untilStringToDate(until: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("untilStringToDate")(until.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  }
  
  /* Inlined std.Pick<std.Date, 'getTime'> */
  trait Datelike extends StObject {
    
    def getTime(): Double
    @JSName("getTime")
    var getTime_Original: js.Function0[Double]
  }
  object Datelike {
    
    inline def apply(getTime: () => Double): Datelike = {
      val __obj = js.Dynamic.literal(getTime = js.Any.fromFunction0(getTime))
      __obj.asInstanceOf[Datelike]
    }
    
    extension [Self <: Datelike](x: Self) {
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    }
  }
}
