package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.DateExtras")
@js.native
class DateExtras ()
  extends StObject
     with typings.senchaTouch.Ext.DateExtras
/* static members */
object DateExtras {
  
  @JSGlobal("Ext.DateExtras")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.DAY")
  @js.native
  def DAY: java.lang.String = js.native
  @scala.inline
  def DAY_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.HOUR")
  @js.native
  def HOUR: java.lang.String = js.native
  @scala.inline
  def HOUR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.MILLI")
  @js.native
  def MILLI: java.lang.String = js.native
  @scala.inline
  def MILLI_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.MINUTE")
  @js.native
  def MINUTE: java.lang.String = js.native
  @scala.inline
  def MINUTE_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.MONTH")
  @js.native
  def MONTH: java.lang.String = js.native
  @scala.inline
  def MONTH_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.SECOND")
  @js.native
  def SECOND: java.lang.String = js.native
  @scala.inline
  def SECOND_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.YEAR")
  @js.native
  def YEAR: java.lang.String = js.native
  @scala.inline
  def YEAR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  
  /** [Method] Provides a convenient method for performing basic date arithmetic
    * @param date Date The date to modify.
    * @param interval String A valid date interval enum value.
    * @param value Number The amount to add to the current date.
    * @returns Date The new Date instance.
    */
  @scala.inline
  def add(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[js.Any]
  @scala.inline
  def add(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def add(date: js.Any, interval: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def add(date: js.Any, interval: java.lang.String, value: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def add(date: js.Any, interval: Unit, value: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def add(date: Unit, interval: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def add(date: Unit, interval: java.lang.String, value: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def add(date: Unit, interval: Unit, value: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Align the date to unit
    * @param date Date The date to be aligned.
    * @param unit String The unit. This unit is compatible with the date interval constants.
    * @returns Date The aligned date.
    */
  @scala.inline
  def align(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("align")().asInstanceOf[js.Any]
  @scala.inline
  def align(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("align")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def align(date: js.Any, unit: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def align(date: Unit, unit: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Checks if a date falls on or between the given start and end dates
    * @param date Date The date to check.
    * @param start Date Start date.
    * @param end Date End date.
    * @returns Boolean true if this date falls on or between the given start and end dates.
    */
  @scala.inline
  def between(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("between")().asInstanceOf[Boolean]
  @scala.inline
  def between(date: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def between(date: js.Any, start: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def between(date: js.Any, start: js.Any, end: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def between(date: js.Any, start: Unit, end: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def between(date: Unit, start: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def between(date: Unit, start: js.Any, end: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def between(date: Unit, start: Unit, end: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Attempts to clear all time information from this Date by setting the time to midnight of the same day automatically
    * @param date Date The date.
    * @param clone Boolean true to create a clone of this date, clear the time and return it.
    * @returns Date this or the clone.
    */
  @scala.inline
  def clearTime(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")().asInstanceOf[js.Any]
  @scala.inline
  def clearTime(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def clearTime(date: js.Any, clone: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")(date.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def clearTime(date: Unit, clone: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")(date.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def clone(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.DateExtras.dayNames")
  @js.native
  def dayNames: typings.senchaTouch.Ext.Array = js.native
  @scala.inline
  def dayNames_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.DateExtras.defaultFormat")
  @js.native
  def defaultFormat: java.lang.String = js.native
  @scala.inline
  def defaultFormat_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DateExtras.defaults")
  @js.native
  def defaults: js.Any = js.native
  @scala.inline
  def defaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  /** [Method] Calculate how many units are there between two time
    * @param min Date The first time.
    * @param max Date The second time.
    * @param unit String The unit. This unit is compatible with the date interval constants.
    * @returns Number The maximum number n of units that min + n * unit &lt;= max.
    */
  @scala.inline
  def diff(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")().asInstanceOf[Double]
  @scala.inline
  def diff(min: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def diff(min: js.Any, max: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def diff(min: js.Any, max: js.Any, unit: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def diff(min: js.Any, max: Unit, unit: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def diff(min: Unit, max: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def diff(min: Unit, max: js.Any, unit: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def diff(min: Unit, max: Unit, unit: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Formats a date given the supplied format string
    * @param date Date The date to format.
    * @param format String The format string.
    * @returns String The formatted date.
    */
  @scala.inline
  def format(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[java.lang.String]
  @scala.inline
  def format(date: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def format(date: js.Any, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(date: Unit, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DateExtras.formatCodes")
  @js.native
  def formatCodes: js.Any = js.native
  @scala.inline
  def formatCodes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatCodes")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DateExtras.formatFunctions")
  @js.native
  def formatFunctions: js.Any = js.native
  @scala.inline
  def formatFunctions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatFunctions")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the numeric day number of the year adjusted for leap year
    * @param date Date The date.
    * @returns Number 0 to 364 (365 in leap years).
    */
  @scala.inline
  def getDayOfYear(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")().asInstanceOf[Double]
  @scala.inline
  def getDayOfYear(date: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the number of days in the current month adjusted for leap year
    * @param date Date The date.
    * @returns Number The number of days in the month.
    */
  @scala.inline
  def getDaysInMonth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")().asInstanceOf[Double]
  @scala.inline
  def getDaysInMonth(date: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Returns the number of milliseconds between two dates
    * @param dateA Date The first date.
    * @param dateB Date The second date, defaults to now.
    * @returns Number The difference in milliseconds.
    */
  @scala.inline
  def getElapsed(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")().asInstanceOf[Double]
  @scala.inline
  def getElapsed(dateA: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")(dateA.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getElapsed(dateA: js.Any, dateB: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")(dateA.asInstanceOf[js.Any], dateB.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getElapsed(dateA: Unit, dateB: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")(dateA.asInstanceOf[js.Any], dateB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Get the date of the first day of the month in which this date resides
    * @param date Date The date.
    * @returns Date
    */
  @scala.inline
  def getFirstDateOfMonth(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDateOfMonth")().asInstanceOf[js.Any]
  @scala.inline
  def getFirstDateOfMonth(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDateOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Get the first day of the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The day number (0-6).
    */
  @scala.inline
  def getFirstDayOfMonth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfMonth")().asInstanceOf[Double]
  @scala.inline
  def getFirstDayOfMonth(date: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the offset from GMT of the current date equivalent to the format specifier O
    * @param date Date The date.
    * @param colon Boolean true to separate the hours and minutes with a colon.
    * @returns String The 4-character offset string prefixed with + or - (e.g. '-0600').
    */
  @scala.inline
  def getGMTOffset(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")().asInstanceOf[java.lang.String]
  @scala.inline
  def getGMTOffset(date: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def getGMTOffset(date: js.Any, colon: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")(date.asInstanceOf[js.Any], colon.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getGMTOffset(date: Unit, colon: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")(date.asInstanceOf[js.Any], colon.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Get the date of the last day of the month in which this date resides
    * @param date Date The date.
    * @returns Date
    */
  @scala.inline
  def getLastDateOfMonth(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDateOfMonth")().asInstanceOf[js.Any]
  @scala.inline
  def getLastDateOfMonth(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDateOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Get the last day of the current month adjusted for leap year
    * @param date Date The date.
    * @returns Number The day number (0-6).
    */
  @scala.inline
  def getLastDayOfMonth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDayOfMonth")().asInstanceOf[Double]
  @scala.inline
  def getLastDayOfMonth(date: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the zero based JavaScript month number for the given short full month name
    * @param name String The short/full month name.
    * @returns Number The zero-based JavaScript month number.
    */
  @scala.inline
  def getMonthNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthNumber")().asInstanceOf[Double]
  @scala.inline
  def getMonthNumber(name: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthNumber")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the short day name for the given day number
    * @param day Number A zero-based JavaScript day number.
    * @returns String The short day name.
    */
  @scala.inline
  def getShortDayName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortDayName")().asInstanceOf[java.lang.String]
  @scala.inline
  def getShortDayName(day: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortDayName")(day.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the short month name for the given month number
    * @param month Number A zero-based JavaScript month number.
    * @returns String The short month name.
    */
  @scala.inline
  def getShortMonthName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortMonthName")().asInstanceOf[java.lang.String]
  @scala.inline
  def getShortMonthName(month: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortMonthName")(month.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the English ordinal suffix of the current day equivalent to the format specifier S
    * @param date Date The date.
    * @returns String 'st', 'nd', 'rd' or 'th'.
    */
  @scala.inline
  def getSuffix(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")().asInstanceOf[java.lang.String]
  @scala.inline
  def getSuffix(date: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the timezone abbreviation of the current date equivalent to the format specifier T
    * @param date Date The date.
    * @returns String The abbreviated timezone name (e.g. 'CST', 'PDT', 'EDT', 'MPST' ...).
    */
  @scala.inline
  def getTimezone(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")().asInstanceOf[java.lang.String]
  @scala.inline
  def getTimezone(date: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the numeric ISO 8601 week number of the year equivalent to the format specifier W  but without a leading zero
    * @param date Date The date.
    * @returns Number 1 to 53.
    */
  @scala.inline
  def getWeekOfYear(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfYear")().asInstanceOf[Double]
  @scala.inline
  def getWeekOfYear(date: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Checks if the current date is affected by Daylight Saving Time DST
    * @param date Date The date.
    * @returns Boolean true if the current date is affected by DST.
    */
  @scala.inline
  def isDST(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDST")().asInstanceOf[Boolean]
  @scala.inline
  def isDST(date: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDST")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Checks if the current date falls within a leap year
    * @param date Date The date.
    * @returns Boolean true if the current date falls within a leap year, false otherwise.
    */
  @scala.inline
  def isLeapYear(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")().asInstanceOf[Boolean]
  @scala.inline
  def isLeapYear(date: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Checks if the passed Date parameters will cause a JavaScript Date rollover
    * @param year Number 4-digit year.
    * @param month Number 1-based month-of-year.
    * @param day Number Day of month.
    * @param hour Number Hour.
    * @param minute Number Minute.
    * @param second Number Second.
    * @param millisecond Number Millisecond.
    * @returns Boolean true if the passed parameters do not cause a Date "rollover", false otherwise.
    */
  @scala.inline
  def isValid(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.DateExtras.monthNames")
  @js.native
  def monthNames: typings.senchaTouch.Ext.Array = js.native
  @scala.inline
  def monthNames_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DateExtras.monthNumbers")
  @js.native
  def monthNumbers: js.Any = js.native
  @scala.inline
  def monthNumbers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNumbers")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the current timestamp
    * @returns Number The current timestamp.
    */
  @scala.inline
  def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  /** [Method] Parses the passed string using the specified date format
    * @param input String/Number The raw date string.
    * @param format String The expected date string format.
    * @param strict Boolean true to validate date strings while parsing (i.e. prevents JavaScript Date "rollover"). Invalid date strings will return null when parsed.
    * @returns Date/null The parsed Date, or null if an invalid date string.
    */
  @scala.inline
  def parse(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.Any]
  @scala.inline
  def parse(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(input: js.Any, format: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(input: js.Any, format: java.lang.String, strict: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(input: js.Any, format: Unit, strict: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(input: Unit, format: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(input: Unit, format: java.lang.String, strict: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parse(input: Unit, format: Unit, strict: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DateExtras.parseFunctions")
  @js.native
  def parseFunctions: js.Any = js.native
  @scala.inline
  def parseFunctions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseFunctions")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.DateExtras.useStrict")
  @js.native
  def useStrict: Boolean = js.native
  @scala.inline
  def useStrict_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(x.asInstanceOf[js.Any])
}
