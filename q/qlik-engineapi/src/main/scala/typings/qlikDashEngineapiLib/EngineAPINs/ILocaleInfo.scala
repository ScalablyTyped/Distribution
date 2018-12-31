package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocaleInfo...
  */
trait ILocaleInfo extends js.Object {
  /**
    * Is set to true if broken weeks are allowed in a year.
    * According to ISO 8601, no broken weeks should be allowed.
    * This property is not shown if set to false.
    * If qBrokenWeeks is set to true, qReferenceDay is irrelevant.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qBrokenWeeks: scala.Double
  /**
    * Information about the calendar.
    */
  var qCalendarStrings: ICalenderStrings
  /**
    * Locale name (following language tagging convention RFC 4646):
    *
    * <language>-<REGION>
    * Where
    * language is a lowercase ISO 639 language code
    * REGION specifies an uppercase ISO 3166 country code.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qCollation: java.lang.String
  /**
    * Current year.
    */
  var qCurrentYear: scala.Double
  /**
    * Date format.
    * Example: YYYY-MM-DD
    */
  var qDateFmt: java.lang.String
  /**
    * Decimal separator.
    */
  var qDecimalSep: java.lang.String
  /**
    * First month of the year, starting from 1.
    * According to ISO 8601, Januaryis the first month of the year.
    *
    *       1  = January
    *       2  = February
    *       12 = January
    *
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qFirstMonthOfYear: scala.Double
  /**
    * First day of the week, starting from 0.
    * According to ISO 8601, Monday is the first day of the week.
    *
    *           0 = Monday
    *           1 = Tuesday
    *           ..
    *           6 = Sunday
    *
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qFirstWeekDay: scala.Boolean
  /**
    * List separator.
    */
  var qListSep: java.lang.String
  /**
    * Money decimal separator.
    */
  var qMoneyDecimalSep: java.lang.String
  /**
    * Money format.
    * Example: #.##0,00 kr;-#.##0,00 kr
    */
  var qMoneyFmt: java.lang.String
  /**
    * Money thousand separator.
    */
  var qMoneyThousandSep: java.lang.String
  /**
    * Day in the year that is always in week 1.
    * According to ISO 8601, January 4th should always be part of the first week of the year (qReferenceDay=4).
    * Recommended values are in the range 1 and 7.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    * This property is not relevant if there are broken weeks in the year.
    */
  var qReferenceDay: scala.Double
  /**
    * Thousand separator.
    */
  var qThousandSep: java.lang.String
  /**
    * Time format.
    * Example: hh:mm:ss
    */
  var qTimeFmt: java.lang.String
  /**
    * Time stamp format.
    * Example: YYYY-MM-DD hh:mm:ss[.fff]
    */
  var qTimestampFmt: java.lang.String
}

