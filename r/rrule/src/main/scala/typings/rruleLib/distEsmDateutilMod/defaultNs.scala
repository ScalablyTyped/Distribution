package typings
package rruleLib.distEsmDateutilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/dateutil", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class DateTime protected ()
    extends rruleLib.distEsmDateutilMod.dateutilNs.DateTime {
    def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double, minute: scala.Double, second: scala.Double, millisecond: scala.Double) = this()
  }
  
  @js.native
  class Time protected ()
    extends rruleLib.distEsmDateutilMod.dateutilNs.Time {
    def this(hour: scala.Double, minute: scala.Double, second: scala.Double, millisecond: scala.Double) = this()
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
  val cloneDates: js.Function1[
    /* dates */ js.Array[stdLib.Date] | js.Array[rruleLib.distEsmDateutilMod.dateutilNs.Time], 
    js.Array[stdLib.Date]
  ] = js.native
  @JSName("clone")
  val clone_FdefaultNs: js.Function1[/* date */ stdLib.Date | rruleLib.distEsmDateutilMod.dateutilNs.Time, stdLib.Date] = js.native
  /**
       * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
       */
  val combine: js.Function2[
    /* date */ stdLib.Date, 
    /* time */ stdLib.Date | rruleLib.distEsmDateutilMod.dateutilNs.Time, 
    stdLib.Date
  ] = js.native
  /**
       * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
       */
  val daysBetween: js.Function2[/* date1 */ stdLib.Date, /* date2 */ stdLib.Date, scala.Double] = js.native
  /**
       * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
       */
  val fromOrdinal: js.Function1[/* ordinal */ scala.Double, stdLib.Date] = js.native
  val getMonthDays: js.Function1[/* date */ stdLib.Date, scala.Double] = js.native
  /**
       * @return {Number} python-like weekday
       */
  val getWeekday: js.Function1[/* date */ stdLib.Date, scala.Double] = js.native
  /**
       * py_date.timetuple()[7]
       */
  val getYearDay: js.Function1[/* date */ stdLib.Date, scala.Double] = js.native
  val isDate: js.Function1[/* value */ js.Any, /* is Date */scala.Boolean] = js.native
  val isLeapYear: js.Function1[/* year */ scala.Double, scala.Boolean] = js.native
  val isValidDate: js.Function1[/* value */ js.Any, /* is Date */scala.Boolean] = js.native
  /**
       * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
       */
  val monthRange: js.Function2[/* year */ scala.Double, /* month */ scala.Double, js.Array[scala.Double]] = js.native
  /**
       * Sorts an array of Date or dateutil.Time objects
       */
  val sort: js.Function1[
    /* dates */ js.Array[stdLib.Pick[stdLib.Date, rruleLib.rruleLibStrings.getTime]], 
    scala.Unit
  ] = js.native
  val timeToUntilString: js.Function2[/* time */ scala.Double, /* utc */ js.UndefOr[scala.Boolean], java.lang.String] = js.native
  /**
       * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
       */
  val toOrdinal: js.Function1[/* date */ stdLib.Date, scala.Double] = js.native
  /**
       * @return {Number} the date's timezone offset in ms
       */
  val tzOffset: js.Function1[/* date */ stdLib.Date, scala.Double] = js.native
  val untilStringToDate: js.Function1[/* until */ java.lang.String, stdLib.Date] = js.native
}

