package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a DateTime field in list form or in list view in grid mode */
trait FieldSchema_InForm_DateTime extends FieldSchema_InForm {
  /** Type of calendar to use */
  var CalendarType: DateTimeCalendarType
  /** Display format for DateTime field. */
  var DisplayFormat: DateTimeDisplayFormat
  var FirstDayOfWeek: scala.Double
  var FirstWeekOfYear: scala.Double
  var HijriAdjustment: scala.Double
  var HoursMode24: scala.Boolean
  var HoursOptions: js.Array[java.lang.String]
  var LanguageId: java.lang.String
  var LocaleId: java.lang.String
  var MaxJDay: scala.Double
  var MinJDay: scala.Double
  /** Indicates wherever current user regional settings specify to display week numbers in day or week views of a calendar.
    Only appears for DateTime fields. */
  var ShowWeekNumber: scala.Boolean
  var TimeSeparator: java.lang.String
  var TimeZoneDifference: java.lang.String
  var WorkWeek: java.lang.String
}

