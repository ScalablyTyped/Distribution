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

object FieldSchema_InForm_DateTime {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    CalendarType: DateTimeCalendarType,
    Description: java.lang.String,
    Direction: java.lang.String,
    DisplayFormat: DateTimeDisplayFormat,
    FieldType: java.lang.String,
    FirstDayOfWeek: scala.Double,
    FirstWeekOfYear: scala.Double,
    Hidden: scala.Boolean,
    HijriAdjustment: scala.Double,
    HoursMode24: scala.Boolean,
    HoursOptions: js.Array[java.lang.String],
    IMEMode: js.Any,
    Id: java.lang.String,
    LanguageId: java.lang.String,
    LocaleId: java.lang.String,
    MaxJDay: scala.Double,
    MinJDay: scala.Double,
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    ShowWeekNumber: scala.Boolean,
    TimeSeparator: java.lang.String,
    TimeZoneDifference: java.lang.String,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean,
    WorkWeek: java.lang.String
  ): FieldSchema_InForm_DateTime = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, CalendarType = CalendarType, Description = Description, Direction = Direction, DisplayFormat = DisplayFormat, FieldType = FieldType, FirstDayOfWeek = FirstDayOfWeek, FirstWeekOfYear = FirstWeekOfYear, Hidden = Hidden, HijriAdjustment = HijriAdjustment, HoursMode24 = HoursMode24, HoursOptions = HoursOptions, IMEMode = IMEMode, Id = Id, LanguageId = LanguageId, LocaleId = LocaleId, MaxJDay = MaxJDay, MinJDay = MinJDay, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, ShowWeekNumber = ShowWeekNumber, TimeSeparator = TimeSeparator, TimeZoneDifference = TimeZoneDifference, Title = Title, Type = Type, UseMinWidth = UseMinWidth, WorkWeek = WorkWeek)
  
    __obj.asInstanceOf[FieldSchema_InForm_DateTime]
  }
}

