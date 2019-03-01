package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables basic storage and retrieval of dates and times. */
@js.native
trait Date extends _IDBValidKey {
  /**
    * Converts a Date object to a string.
    */
  /**
    * Converts a Date object to a number.
    */
  /**
    * Converts a Date object to a string or number.
    *
    * @param hint The strings "number", "string", or "default" to specify what primitive to return.
    *
    * @throws {TypeError} If 'hint' was given something other than "number", "string", or "default".
    * @returns A number if 'hint' was "number", a string if 'hint' was "string" or "default".
    */
  @JSName(org.scalablytyped.runtime.Symbol.toPrimitive)
  var toPrimitive: (js.Function1[stdLib.stdLibStrings.default, java.lang.String]) with (js.Function1[stdLib.stdLibStrings.string, java.lang.String]) with (js.Function1[stdLib.stdLibStrings.number, scala.Double]) with (js.Function1[/* hint */ java.lang.String, java.lang.String | scala.Double]) = js.native
  /** Gets the day-of-the-month, using local time. */
  def getDate(): scala.Double = js.native
  /** Gets the day of the week, using local time. */
  def getDay(): scala.Double = js.native
  /** Gets the year, using local time. */
  def getFullYear(): scala.Double = js.native
  /** Gets the hours in a date, using local time. */
  def getHours(): scala.Double = js.native
  /** Gets the milliseconds of a Date, using local time. */
  def getMilliseconds(): scala.Double = js.native
  /** Gets the minutes of a Date object, using local time. */
  def getMinutes(): scala.Double = js.native
  /** Gets the month, using local time. */
  def getMonth(): scala.Double = js.native
  /** Gets the seconds of a Date object, using local time. */
  def getSeconds(): scala.Double = js.native
  /** Gets the time value in milliseconds. */
  def getTime(): scala.Double = js.native
  /** Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC). */
  def getTimezoneOffset(): scala.Double = js.native
  /** Gets the day-of-the-month, using Universal Coordinated Time (UTC). */
  def getUTCDate(): scala.Double = js.native
  /** Gets the day of the week using Universal Coordinated Time (UTC). */
  def getUTCDay(): scala.Double = js.native
  /** Gets the year using Universal Coordinated Time (UTC). */
  def getUTCFullYear(): scala.Double = js.native
  /** Gets the hours value in a Date object using Universal Coordinated Time (UTC). */
  def getUTCHours(): scala.Double = js.native
  /** Gets the milliseconds of a Date object using Universal Coordinated Time (UTC). */
  def getUTCMilliseconds(): scala.Double = js.native
  /** Gets the minutes of a Date object using Universal Coordinated Time (UTC). */
  def getUTCMinutes(): scala.Double = js.native
  /** Gets the month of a Date object using Universal Coordinated Time (UTC). */
  def getUTCMonth(): scala.Double = js.native
  /** Gets the seconds of a Date object using Universal Coordinated Time (UTC). */
  def getUTCSeconds(): scala.Double = js.native
  def getVarDate(): VarDate = js.native
  /**
    * Sets the numeric day-of-the-month value of the Date object using local time.
    * @param date A numeric value equal to the day of the month.
    */
  def setDate(date: scala.Double): scala.Double = js.native
  /**
    * Sets the year of the Date object using local time.
    * @param year A numeric value for the year.
    * @param month A zero-based numeric value for the month (0 for January, 11 for December). Must be specified if numDate is specified.
    * @param date A numeric value equal for the day of the month.
    */
  def setFullYear(year: scala.Double): scala.Double = js.native
  def setFullYear(year: scala.Double, month: scala.Double): scala.Double = js.native
  def setFullYear(year: scala.Double, month: scala.Double, date: scala.Double): scala.Double = js.native
  /**
    * Sets the hour value in the Date object using local time.
    * @param hours A numeric value equal to the hours value.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setHours(hours: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double, min: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double, min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setHours(hours: scala.Double, min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  /**
    * Sets the milliseconds value in the Date object using local time.
    * @param ms A numeric value equal to the millisecond value.
    */
  def setMilliseconds(ms: scala.Double): scala.Double = js.native
  /**
    * Sets the minutes value in the Date object using local time.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setMinutes(min: scala.Double): scala.Double = js.native
  def setMinutes(min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setMinutes(min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  /**
    * Sets the month value in the Date object using local time.
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
    * @param date A numeric value representing the day of the month. If this value is not supplied, the value from a call to the getDate method is used.
    */
  def setMonth(month: scala.Double): scala.Double = js.native
  def setMonth(month: scala.Double, date: scala.Double): scala.Double = js.native
  /**
    * Sets the seconds value in the Date object using local time.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setSeconds(sec: scala.Double): scala.Double = js.native
  def setSeconds(sec: scala.Double, ms: scala.Double): scala.Double = js.native
  /**
    * Sets the date and time value in the Date object.
    * @param time A numeric value representing the number of elapsed milliseconds since midnight, January 1, 1970 GMT.
    */
  def setTime(time: scala.Double): scala.Double = js.native
  /**
    * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
    * @param date A numeric value equal to the day of the month.
    */
  def setUTCDate(date: scala.Double): scala.Double = js.native
  /**
    * Sets the year value in the Date object using Universal Coordinated Time (UTC).
    * @param year A numeric value equal to the year.
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively. Must be supplied if numDate is supplied.
    * @param date A numeric value equal to the day of the month.
    */
  def setUTCFullYear(year: scala.Double): scala.Double = js.native
  def setUTCFullYear(year: scala.Double, month: scala.Double): scala.Double = js.native
  def setUTCFullYear(year: scala.Double, month: scala.Double, date: scala.Double): scala.Double = js.native
  /**
    * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
    * @param hours A numeric value equal to the hours value.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setUTCHours(hours: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setUTCHours(hours: scala.Double, min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  /**
    * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
    * @param ms A numeric value equal to the millisecond value.
    */
  def setUTCMilliseconds(ms: scala.Double): scala.Double = js.native
  /**
    * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setUTCMinutes(min: scala.Double): scala.Double = js.native
  def setUTCMinutes(min: scala.Double, sec: scala.Double): scala.Double = js.native
  def setUTCMinutes(min: scala.Double, sec: scala.Double, ms: scala.Double): scala.Double = js.native
  /**
    * Sets the month value in the Date object using Universal Coordinated Time (UTC).
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
    * @param date A numeric value representing the day of the month. If it is not supplied, the value from a call to the getUTCDate method is used.
    */
  def setUTCMonth(month: scala.Double): scala.Double = js.native
  def setUTCMonth(month: scala.Double, date: scala.Double): scala.Double = js.native
  /**
    * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setUTCSeconds(sec: scala.Double): scala.Double = js.native
  def setUTCSeconds(sec: scala.Double, ms: scala.Double): scala.Double = js.native
  /** Returns a date as a string value. */
  def toDateString(): java.lang.String = js.native
  /** Returns a date as a string value in ISO format. */
  def toISOString(): java.lang.String = js.native
  /** Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization. */
  def toJSON(): java.lang.String = js.native
  def toJSON(key: js.Any): java.lang.String = js.native
  /** Returns a date as a string value appropriate to the host environment's current locale. */
  def toLocaleDateString(): java.lang.String = js.native
  def toLocaleDateString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleDateString(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleDateString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleDateString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  /** Returns a time as a string value appropriate to the host environment's current locale. */
  def toLocaleTimeString(): java.lang.String = js.native
  def toLocaleTimeString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleTimeString(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  def toLocaleTimeString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleTimeString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): java.lang.String = js.native
  /** Returns a time as a string value. */
  def toTimeString(): java.lang.String = js.native
  /** Returns a date converted to a string using Universal Coordinated Time (UTC). */
  def toUTCString(): java.lang.String = js.native
}

