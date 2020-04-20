package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a DateTime field in list form or in list view in grid mode */
trait FieldSchemaInFormDateTime extends FieldSchemaInForm {
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

object FieldSchemaInFormDateTime {
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
  ): FieldSchemaInFormDateTime = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], CalendarType = CalendarType.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], DisplayFormat = DisplayFormat.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], FirstWeekOfYear = FirstWeekOfYear.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], HijriAdjustment = HijriAdjustment.asInstanceOf[js.Any], HoursMode24 = HoursMode24.asInstanceOf[js.Any], HoursOptions = HoursOptions.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LanguageId = LanguageId.asInstanceOf[js.Any], LocaleId = LocaleId.asInstanceOf[js.Any], MaxJDay = MaxJDay.asInstanceOf[js.Any], MinJDay = MinJDay.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], ShowWeekNumber = ShowWeekNumber.asInstanceOf[js.Any], TimeSeparator = TimeSeparator.asInstanceOf[js.Any], TimeZoneDifference = TimeZoneDifference.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any], WorkWeek = WorkWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormDateTime]
  }
}

