package typings.qlikDashEngineapi.EngineAPI

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
  var qBrokenWeeks: Double
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
  var qCollation: String
  /**
    * Current year.
    */
  var qCurrentYear: Double
  /**
    * Date format.
    * Example: YYYY-MM-DD
    */
  var qDateFmt: String
  /**
    * Decimal separator.
    */
  var qDecimalSep: String
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
  var qFirstMonthOfYear: Double
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
  var qFirstWeekDay: Boolean
  /**
    * List separator.
    */
  var qListSep: String
  /**
    * Money decimal separator.
    */
  var qMoneyDecimalSep: String
  /**
    * Money format.
    * Example: #.##0,00 kr;-#.##0,00 kr
    */
  var qMoneyFmt: String
  /**
    * Money thousand separator.
    */
  var qMoneyThousandSep: String
  /**
    * Day in the year that is always in week 1.
    * According to ISO 8601, January 4th should always be part of the first week of the year (qReferenceDay=4).
    * Recommended values are in the range 1 and 7.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    * This property is not relevant if there are broken weeks in the year.
    */
  var qReferenceDay: Double
  /**
    * Thousand separator.
    */
  var qThousandSep: String
  /**
    * Time format.
    * Example: hh:mm:ss
    */
  var qTimeFmt: String
  /**
    * Time stamp format.
    * Example: YYYY-MM-DD hh:mm:ss[.fff]
    */
  var qTimestampFmt: String
}

object ILocaleInfo {
  @scala.inline
  def apply(
    qBrokenWeeks: Double,
    qCalendarStrings: ICalenderStrings,
    qCollation: String,
    qCurrentYear: Double,
    qDateFmt: String,
    qDecimalSep: String,
    qFirstMonthOfYear: Double,
    qFirstWeekDay: Boolean,
    qListSep: String,
    qMoneyDecimalSep: String,
    qMoneyFmt: String,
    qMoneyThousandSep: String,
    qReferenceDay: Double,
    qThousandSep: String,
    qTimeFmt: String,
    qTimestampFmt: String
  ): ILocaleInfo = {
    val __obj = js.Dynamic.literal(qBrokenWeeks = qBrokenWeeks.asInstanceOf[js.Any], qCalendarStrings = qCalendarStrings.asInstanceOf[js.Any], qCollation = qCollation.asInstanceOf[js.Any], qCurrentYear = qCurrentYear.asInstanceOf[js.Any], qDateFmt = qDateFmt.asInstanceOf[js.Any], qDecimalSep = qDecimalSep.asInstanceOf[js.Any], qFirstMonthOfYear = qFirstMonthOfYear.asInstanceOf[js.Any], qFirstWeekDay = qFirstWeekDay.asInstanceOf[js.Any], qListSep = qListSep.asInstanceOf[js.Any], qMoneyDecimalSep = qMoneyDecimalSep.asInstanceOf[js.Any], qMoneyFmt = qMoneyFmt.asInstanceOf[js.Any], qMoneyThousandSep = qMoneyThousandSep.asInstanceOf[js.Any], qReferenceDay = qReferenceDay.asInstanceOf[js.Any], qThousandSep = qThousandSep.asInstanceOf[js.Any], qTimeFmt = qTimeFmt.asInstanceOf[js.Any], qTimestampFmt = qTimestampFmt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocaleInfo]
  }
}

