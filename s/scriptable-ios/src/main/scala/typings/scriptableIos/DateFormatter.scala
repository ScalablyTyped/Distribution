package typings.scriptableIos

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Converts between texts and strings._
  *
  * To convert between dates and their textual representation, use the `string()` and `date()` functions.
  * @see https://docs.scriptable.app/dateformatter/#-new-dateformatter
  */
@JSGlobal("DateFormatter")
@js.native
/**
  * _Converts between texts and strings._
  *
  * To convert between dates and their textual representation, use the `string()` and `date()` functions.
  * @see https://docs.scriptable.app/dateformatter/#-new-dateformatter
  */
class DateFormatter () extends js.Object {
  /**
    * _Date format to be used by the formatter._
    *
    * Sets a fixed format to be used by the formatter. For example the date "2019-08-26 16:47" can be represented using the format "yyyy-MM-dd HH:mm".
    *
    * When converting dates to strings, it's advised to use some of the predefined formats for dates and times that can be applied using functions on the formatter, e.g.
    * `useMediumDateStyle()` and `useMediumTimeStyle()`.
    *
    * Year:
    *
    * *   `y`: Year with no padding. Example: "2019"
    * *   `yy`: Year with two zeros. Adds padding if necessary. Example: "19"
    * *   `yyyy`: Year with a minimum of four digits. Adds padding if necessary. Example: "2019"
    *
    * Quarter:
    *
    * *   `Q`: Quarter of the year. Example: "4"
    * *   `QQQQ`: Quarter spelled out. Example: "4th quarter"
    *
    * Month:
    *
    * *   `M`: Numeric month of the year. Example: "1"
    * *   `MM`: Numeric month of the year. Adds padding if necessary. Example: "01"
    * *   `MMM`: Shorthand name of the month. Example: "Jan"
    * *   `MMMM`: Full name of the month. Example: "January"
    * *   `MMMMM`: Narrow name of the month. Example: "J"
    *
    * Day:
    *
    * *   `d`: Day of the month. Example: "9"
    * *   `dd`: Day of the month. Adds padding if necessary. Example: "09"
    * *   `F`: Day of the week. Example: "3rd Friday in August"
    * *   `E`: Day of the week. Example: "Fri"
    * *   `EEEE`: Full name of the day. Example: "Friday"
    * *   `EEEEE`: Narrow day of the week. Example: "F"
    *
    * Hour:
    *
    * *   `h`: Hour on a 12-hour clock. Example: "9"
    * *   `hh`: Hour on a 12-hour clock. Adds padding if necessary. Example: "09"
    * *   `H`: Hour on a 24-hour clock. Example: "21"
    * *   `HH`: Hour on a 24-hour clock. Adds padding if necessary. Example: "21"
    * *   `a`: AM/PM for times on a 12-hour clock. Example: "PM"
    *
    * Minute:
    *
    * *   `m`: Minute. Example: "7"
    * *   `mm`: Minute. Adds padding if necessary. Example: "07"
    *
    * Second:
    *
    * *   `s`: Seconds. Example: "4"
    * *   `ss`: Seconds. Adds padding if necessary. Example: "04"
    * *   `SSS`: Milliseconds. Example: "384"
    *
    * Time zone:
    *
    * *   `zzz`: Three letter name of the time zone. Falls back to GMT-08:00 if the name is unknown. Example: "CST"
    * *   `zzzz`: Full name of the time zone. Falls back to GMT-08:00 if the name is unknown. Example: "Central Standard Time"
    * *   `Z`: Time zone in RFC 822 GMT format. Also matches a literal Z for Zulu (UTC) time. Example: "-0600"
    * *   `ZZZZ`: Time zone with abbreviation and offset. Example: "CST-06:00"
    * *   `ZZZZZ`: Time zone in ISO 8601 format. Example: "-06:00"
    *
    * A great resource for experimenting with date formats is nsdateformatter.com developed by Ben Scheirman.
    * @see https://docs.scriptable.app/dateformatter/#dateformat
    */
  var dateFormat: String = js.native
  /**
    * _Locale to use when formatting._
    *
    * The locale should be specified using a string identifier, e.g. "en", "it" or "da". When no locale is set, the formatter will use the current locale of the device.
    * @see https://docs.scriptable.app/dateformatter/#locale
    */
  var locale: String = js.native
  /**
    * _Creates a date from a string._
    *
    * Uses the date formatters configuration to parse the string into a date. If the string cannot be parsed with the date foramtters configuration, the function will return null.
    * @param str - The string to parse into a date.
    * @see https://docs.scriptable.app/dateformatter/#-date
    */
  def date(str: String): String = js.native
  /**
    * _Creates a string from a date._
    * @param date - The date to convert to a string.
    * @see https://docs.scriptable.app/dateformatter/#-string
    */
  def string(date: Date): String = js.native
  /**
    * _Use a full style for the date._
    *
    * Dates with a full style includes all details, e.g. "Friday, August 23, 2019 AD".
    * @see https://docs.scriptable.app/dateformatter/#-usefulldatestyle
    */
  def useFullDateStyle(): Unit = js.native
  /**
    * _Use a full style for the time._
    *
    * Times with a full style includes all details, e.g. "7:16:42 PM Pacific Standard Time".
    * @see https://docs.scriptable.app/dateformatter/#-usefulltimestyle
    */
  def useFullTimeStyle(): Unit = js.native
  /**
    * _Use a long style for the date._
    *
    * Dates with a long style usually includes a full text, e.g. "August 23, 2019".
    * @see https://docs.scriptable.app/dateformatter/#-uselongdatestyle
    */
  def useLongDateStyle(): Unit = js.native
  /**
    * _Use a long style for the time._
    *
    * Times with a long style usually includes a full text, e.g. "7:16:42 PM PST".
    * @see https://docs.scriptable.app/dateformatter/#-uselongtimestyle
    */
  def useLongTimeStyle(): Unit = js.native
  /**
    * _Use a medium style for the date._
    *
    * Dates with a medium style usually includes abbreviations, e.g. "Aug 23, 2019" or "7:16:42 PM".
    * @see https://docs.scriptable.app/dateformatter/#-usemediumdatestyle
    */
  def useMediumDateStyle(): Unit = js.native
  /**
    * _Use a short style for the time._
    *
    * Times with a medium style usually includes abbreviations, e.g. "7:16:42 PM".
    * @see https://docs.scriptable.app/dateformatter/#-usemediumtimestyle
    */
  def useMediumTimeStyle(): Unit = js.native
  /**
    * _Use no style for the date._
    *
    * This will remove the date from the formatted string.
    * @see https://docs.scriptable.app/dateformatter/#-usenodatestyle
    */
  def useNoDateStyle(): Unit = js.native
  /**
    * _Use no style for the time._
    *
    * This will remove the time from the formatted string.
    * @see https://docs.scriptable.app/dateformatter/#-usenotimestyle
    */
  def useNoTimeStyle(): Unit = js.native
  /**
    * _Use a short style for the date._
    *
    * Dates with a short style are typically numeric only e.g. "08/23/19".
    * @see https://docs.scriptable.app/dateformatter/#-useshortdatestyle
    */
  def useShortDateStyle(): Unit = js.native
  /**
    * _Use a short style for the time._
    *
    * Times with a short style are typically numeric only but also includes the period for 12-hour clocks, e.g. "7:17 PM".
    * @see https://docs.scriptable.app/dateformatter/#-useshorttimestyle
    */
  def useShortTimeStyle(): Unit = js.native
}

