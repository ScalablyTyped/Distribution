package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a DateTime field in list form or in list view in grid mode */
trait FieldSchema_InForm_DateTime extends FieldSchema_InForm {
  /** Type of calendar to use */
  var CalendarType: DateTimeCalendarType
  /** Display format for DateTime field. */
  var DisplayFormat: DateTimeDisplayFormat
  var FirstDayOfWeek: Double
  var FirstWeekOfYear: Double
  var HijriAdjustment: Double
  var HoursMode24: Boolean
  var HoursOptions: js.Array[String]
  var LanguageId: String
  var LocaleId: String
  var MaxJDay: Double
  var MinJDay: Double
  /** Indicates wherever current user regional settings specify to display week numbers in day or week views of a calendar.
    Only appears for DateTime fields. */
  var ShowWeekNumber: Boolean
  var TimeSeparator: String
  var TimeZoneDifference: String
  var WorkWeek: String
}

object FieldSchema_InForm_DateTime {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    CalendarType: DateTimeCalendarType,
    Description: String,
    Direction: String,
    DisplayFormat: DateTimeDisplayFormat,
    FieldType: String,
    FirstDayOfWeek: Double,
    FirstWeekOfYear: Double,
    Hidden: Boolean,
    HijriAdjustment: Double,
    HoursMode24: Boolean,
    HoursOptions: js.Array[String],
    IMEMode: js.Any,
    Id: String,
    LanguageId: String,
    LocaleId: String,
    MaxJDay: Double,
    MinJDay: Double,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    ShowWeekNumber: Boolean,
    TimeSeparator: String,
    TimeZoneDifference: String,
    Title: String,
    Type: String,
    UseMinWidth: Boolean,
    WorkWeek: String
  ): FieldSchema_InForm_DateTime = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, CalendarType = CalendarType, Description = Description, Direction = Direction, DisplayFormat = DisplayFormat, FieldType = FieldType, FirstDayOfWeek = FirstDayOfWeek, FirstWeekOfYear = FirstWeekOfYear, Hidden = Hidden, HijriAdjustment = HijriAdjustment, HoursMode24 = HoursMode24, HoursOptions = HoursOptions, IMEMode = IMEMode, Id = Id, LanguageId = LanguageId, LocaleId = LocaleId, MaxJDay = MaxJDay, MinJDay = MinJDay, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, ShowWeekNumber = ShowWeekNumber, TimeSeparator = TimeSeparator, TimeZoneDifference = TimeZoneDifference, Title = Title, Type = Type, UseMinWidth = UseMinWidth, WorkWeek = WorkWeek)
  
    __obj.asInstanceOf[FieldSchema_InForm_DateTime]
  }
}

