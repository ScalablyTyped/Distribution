package typings
package rruleLib.distEsmDateutilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/dateutil", "dateutil")
@js.native
object dateutilNs extends js.Object {
  @js.native
  class DateTime protected () extends Time {
    def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double, minute: scala.Double, second: scala.Double, millisecond: scala.Double) = this()
    var day: scala.Double = js.native
    var month: scala.Double = js.native
    var year: scala.Double = js.native
    def addDaily(days: scala.Double): scala.Unit = js.native
    def addHours(hours: scala.Double, filtered: scala.Boolean, byhour: js.Array[scala.Double]): scala.Boolean = js.native
    def addMinutes(
      minutes: scala.Double,
      filtered: scala.Boolean,
      byhour: js.Array[scala.Double],
      byminute: js.Array[scala.Double]
    ): scala.Boolean = js.native
    def addMonths(months: scala.Double): scala.Unit = js.native
    def addSeconds(
      seconds: scala.Double,
      filtered: scala.Boolean,
      byhour: js.Array[scala.Double],
      byminute: js.Array[scala.Double],
      bysecond: js.Array[scala.Double]
    ): scala.Boolean = js.native
    def addWeekly(days: scala.Double, wkst: scala.Double): scala.Unit = js.native
    def addYears(years: scala.Double): scala.Unit = js.native
    def fixDay(): scala.Unit = js.native
    def getDay(): scala.Double = js.native
    def getMonth(): scala.Double = js.native
    def getWeekday(): scala.Double = js.native
    def getYear(): scala.Double = js.native
  }
  
  @js.native
  class Time protected () extends js.Object {
    def this(hour: scala.Double, minute: scala.Double, second: scala.Double, millisecond: scala.Double) = this()
    var hour: scala.Double = js.native
    var millisecond: scala.Double = js.native
    var minute: scala.Double = js.native
    var second: scala.Double = js.native
    def getHours(): scala.Double = js.native
    def getMilliseconds(): scala.Double = js.native
    def getMinutes(): scala.Double = js.native
    def getSeconds(): scala.Double = js.native
    def getTime(): scala.Double = js.native
  }
  
  /**
       * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
       */
  val MAXYEAR: /* 9999 */ scala.Double = js.native
  val MONTH_DAYS: js.Array[scala.Double] = js.native
  /**
       * Number of milliseconds of one day
       */
  val ONE_DAY: scala.Double = js.native
  /**
       * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
       * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
       * therefore we use 1-Jan-1970 instead
       */
  val ORDINAL_BASE: stdLib.Date = js.native
  /**
       * Python: MO-SU: 0 - 6
       * JS: SU-SAT 0 - 6
       */
  val PY_WEEKDAYS: js.Array[scala.Double] = js.native
  def clone(date: Time): stdLib.Date = js.native
  def clone(date: stdLib.Date): stdLib.Date = js.native
  def cloneDates(dates: js.Array[Time | stdLib.Date]): js.Array[stdLib.Date] = js.native
  /**
       * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
       */
  def combine(date: stdLib.Date, time: Time): stdLib.Date = js.native
  /**
       * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
       */
  def combine(date: stdLib.Date, time: stdLib.Date): stdLib.Date = js.native
  /**
       * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
       */
  def daysBetween(date1: stdLib.Date, date2: stdLib.Date): scala.Double = js.native
  /**
       * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
       */
  def fromOrdinal(ordinal: scala.Double): stdLib.Date = js.native
  def getMonthDays(date: stdLib.Date): scala.Double = js.native
  /**
       * @return {Number} python-like weekday
       */
  def getWeekday(date: stdLib.Date): scala.Double = js.native
  /**
       * py_date.timetuple()[7]
       */
  def getYearDay(date: stdLib.Date): scala.Double = js.native
  def isDate(value: js.Any): /* is Date */scala.Boolean = js.native
  def isLeapYear(year: scala.Double): scala.Boolean = js.native
  def isValidDate(value: js.Any): /* is Date */scala.Boolean = js.native
  /**
       * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
       */
  def monthRange(year: scala.Double, month: scala.Double): js.Array[scala.Double] = js.native
  /**
       * Sorts an array of Date or dateutil.Time objects
       */
  def sort[T /* <: stdLib.Pick[stdLib.Date, rruleLib.rruleLibStrings.getTime] */](dates: js.Array[T]): scala.Unit = js.native
  def timeToUntilString(time: scala.Double): java.lang.String = js.native
  def timeToUntilString(time: scala.Double, utc: scala.Boolean): java.lang.String = js.native
  /**
       * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
       */
  def toOrdinal(date: stdLib.Date): scala.Double = js.native
  /**
       * @return {Number} the date's timezone offset in ms
       */
  def tzOffset(date: stdLib.Date): scala.Double = js.native
  def untilStringToDate(until: java.lang.String): stdLib.Date = js.native
}

