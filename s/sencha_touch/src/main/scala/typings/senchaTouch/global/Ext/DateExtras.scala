package typings.senchaTouch.global.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.DateExtras")
@js.native
class DateExtras ()
  extends typings.senchaTouch.Ext.DateExtras

/* static members */
@JSGlobal("Ext.DateExtras")
@js.native
object DateExtras extends js.Object {
  /** [Property] (String) */
  var DAY: java.lang.String = js.native
  /** [Property] (String) */
  var HOUR: java.lang.String = js.native
  /** [Property] (String) */
  var MILLI: java.lang.String = js.native
  /** [Property] (String) */
  var MINUTE: java.lang.String = js.native
  /** [Property] (String) */
  var MONTH: java.lang.String = js.native
  /** [Property] (String) */
  var SECOND: java.lang.String = js.native
  /** [Property] (String) */
  var YEAR: java.lang.String = js.native
  /** [Property] (Array) */
  var dayNames: typings.senchaTouch.Ext.Array = js.native
  /** [Property] (String) */
  var defaultFormat: java.lang.String = js.native
  /** [Property] (Object) */
  var defaults: js.Any = js.native
  /** [Property] (Object) */
  var formatCodes: js.Any = js.native
  /** [Property] (Object) */
  var formatFunctions: js.Any = js.native
  /** [Property] (Array) */
  var monthNames: typings.senchaTouch.Ext.Array = js.native
  /** [Property] (Object) */
  var monthNumbers: js.Any = js.native
  /** [Property] (Object) */
  var parseFunctions: js.Any = js.native
  /** [Property] (Boolean) */
  var useStrict: Boolean = js.native
  /** [Method] Provides a convenient method for performing basic date arithmetic
    * @param date Date The date to modify.
    * @param interval String A valid date interval enum value.
    * @param value Number The amount to add to the current date.
    * @returns Date The new Date instance.
    */
  def add(): js.Any = js.native
  def add(date: js.Any): js.Any = js.native
  def add(date: js.Any, interval: java.lang.String): js.Any = js.native
  def add(date: js.Any, interval: java.lang.String, value: Double): js.Any = js.native
  /** [Method] Align the date to unit
    * @param date Date The date to be aligned.
    * @param unit String The unit. This unit is compatible with the date interval constants.
    * @returns Date The aligned date.
    */
  def align(): js.Any = js.native
  def align(date: js.Any): js.Any = js.native
  def align(date: js.Any, unit: java.lang.String): js.Any = js.native
  /** [Method] Checks if a date falls on or between the given start and end dates
    * @param date Date The date to check.
    * @param start Date Start date.
    * @param end Date End date.
    * @returns Boolean true if this date falls on or between the given start and end dates.
    */
  def between(): Boolean = js.native
  def between(date: js.Any): Boolean = js.native
  def between(date: js.Any, start: js.Any): Boolean = js.native
  def between(date: js.Any, start: js.Any, end: js.Any): Boolean = js.native
  /** [Method] Attempts to clear all time information from this Date by setting the time to midnight of the same day automatically
    * @param date Date The date.
    * @param clone Boolean true to create a clone of this date, clear the time and return it.
    * @returns Date this or the clone.
    */
  def clearTime(): js.Any = js.native
  def clearTime(date: js.Any): js.Any = js.native
  def clearTime(date: js.Any, clone: Boolean): js.Any = js.native
  def clone(date: js.Any): js.Any = js.native
  /** [Method] Calculate how many units are there between two time
    * @param min Date The first time.
    * @param max Date The second time.
    * @param unit String The unit. This unit is compatible with the date interval constants.
    * @returns Number The maximum number n of units that min + n * unit &lt;= max.
    */
  def diff(): Double = js.native
  def diff(min: js.Any): Double = js.native
  def diff(min: js.Any, max: js.Any): Double = js.native
  def diff(min: js.Any, max: js.Any, unit: java.lang.String): Double = js.native
  /** [Method] Formats a date given the supplied format string
    * @param date Date The date to format.
    * @param format String The format string.
    * @returns String The formatted date.
    */
  def format(): java.lang.String = js.native
  def format(date: js.Any): java.lang.String = js.native
  def format(date: js.Any, format: java.lang.String): java.lang.String = js.native
  /** [Method] Get the numeric day number of the year adjusted for leap year
    * @param date Date The date.
    * @returns Number 0 to 364 (365 in leap years).
    */
  def getDayOfYear(): Double = js.native
  def getDayOfYear(date: js.Any): Double = js.native
  /** [Method] Get the number of days in the current month adjusted for leap year
    * @param date Date The date.
    * @returns Number The number of days in the month.
    */
  def getDaysInMonth(): Double = js.native
  def getDaysInMonth(date: js.Any): Double = js.native
  /** [Method] Returns the number of milliseconds between two dates
    * @param dateA Date The first date.
    * @param dateB Date The second date, defaults to now.
    * @returns Number The difference in milliseconds.
    */
  def getElapsed(): Double = js.native
  def getElapsed(dateA: js.Any): Double = js.native
  def getElapsed(dateA: js.Any, dateB: js.Any): Double = js.native
  /** [Method] Get the date of the first day of the month in which this date resides
    * @param date Date The date.
    * @returns Date
    */
  def getFirstDateOfMonth(): js.Any = js.native
  def getFirstDateOfMonth(date: js.Any): js.Any = js.native
  /** [Method] Get the first day of the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The day number (0-6).
    */
  def getFirstDayOfMonth(): Double = js.native
  def getFirstDayOfMonth(date: js.Any): Double = js.native
  /** [Method] Get the offset from GMT of the current date equivalent to the format specifier O
    * @param date Date The date.
    * @param colon Boolean true to separate the hours and minutes with a colon.
    * @returns String The 4-character offset string prefixed with + or - (e.g. '-0600').
    */
  def getGMTOffset(): java.lang.String = js.native
  def getGMTOffset(date: js.Any): java.lang.String = js.native
  def getGMTOffset(date: js.Any, colon: Boolean): java.lang.String = js.native
  /** [Method] Get the date of the last day of the month in which this date resides
    * @param date Date The date.
    * @returns Date
    */
  def getLastDateOfMonth(): js.Any = js.native
  def getLastDateOfMonth(date: js.Any): js.Any = js.native
  /** [Method] Get the last day of the current month adjusted for leap year
    * @param date Date The date.
    * @returns Number The day number (0-6).
    */
  def getLastDayOfMonth(): Double = js.native
  def getLastDayOfMonth(date: js.Any): Double = js.native
  /** [Method] Get the zero based JavaScript month number for the given short full month name
    * @param name String The short/full month name.
    * @returns Number The zero-based JavaScript month number.
    */
  def getMonthNumber(): Double = js.native
  def getMonthNumber(name: java.lang.String): Double = js.native
  /** [Method] Get the short day name for the given day number
    * @param day Number A zero-based JavaScript day number.
    * @returns String The short day name.
    */
  def getShortDayName(): java.lang.String = js.native
  def getShortDayName(day: Double): java.lang.String = js.native
  /** [Method] Get the short month name for the given month number
    * @param month Number A zero-based JavaScript month number.
    * @returns String The short month name.
    */
  def getShortMonthName(): java.lang.String = js.native
  def getShortMonthName(month: Double): java.lang.String = js.native
  /** [Method] Get the English ordinal suffix of the current day equivalent to the format specifier S
    * @param date Date The date.
    * @returns String 'st', 'nd', 'rd' or 'th'.
    */
  def getSuffix(): java.lang.String = js.native
  def getSuffix(date: js.Any): java.lang.String = js.native
  /** [Method] Get the timezone abbreviation of the current date equivalent to the format specifier T
    * @param date Date The date.
    * @returns String The abbreviated timezone name (e.g. 'CST', 'PDT', 'EDT', 'MPST' ...).
    */
  def getTimezone(): java.lang.String = js.native
  def getTimezone(date: js.Any): java.lang.String = js.native
  /** [Method] Get the numeric ISO 8601 week number of the year equivalent to the format specifier W  but without a leading zero
    * @param date Date The date.
    * @returns Number 1 to 53.
    */
  def getWeekOfYear(): Double = js.native
  def getWeekOfYear(date: js.Any): Double = js.native
  /** [Method] Checks if the current date is affected by Daylight Saving Time DST
    * @param date Date The date.
    * @returns Boolean true if the current date is affected by DST.
    */
  def isDST(): Boolean = js.native
  def isDST(date: js.Any): Boolean = js.native
  /** [Method] Checks if the current date falls within a leap year
    * @param date Date The date.
    * @returns Boolean true if the current date falls within a leap year, false otherwise.
    */
  def isLeapYear(): Boolean = js.native
  def isLeapYear(date: js.Any): Boolean = js.native
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
  def isValid(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): Boolean = js.native
  /** [Method] Returns the current timestamp
    * @returns Number The current timestamp.
    */
  def now(): Double = js.native
  /** [Method] Parses the passed string using the specified date format
    * @param input String/Number The raw date string.
    * @param format String The expected date string format.
    * @param strict Boolean true to validate date strings while parsing (i.e. prevents JavaScript Date "rollover"). Invalid date strings will return null when parsed.
    * @returns Date/null The parsed Date, or null if an invalid date string.
    */
  def parse(): js.Any = js.native
  def parse(input: js.Any): js.Any = js.native
  def parse(input: js.Any, format: java.lang.String): js.Any = js.native
  def parse(input: js.Any, format: java.lang.String, strict: Boolean): js.Any = js.native
}

