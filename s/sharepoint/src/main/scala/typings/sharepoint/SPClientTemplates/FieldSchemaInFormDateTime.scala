package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a DateTime field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormDateTime extends FieldSchemaInForm {
  
  /** Type of calendar to use */
  var CalendarType: DateTimeCalendarType = js.native
  
  /** Display format for DateTime field. */
  var DisplayFormat: DateTimeDisplayFormat = js.native
  
  var FirstDayOfWeek: Double = js.native
  
  var FirstWeekOfYear: Double = js.native
  
  var HijriAdjustment: Double = js.native
  
  var HoursMode24: Boolean = js.native
  
  var HoursOptions: js.Array[String] = js.native
  
  var LanguageId: String = js.native
  
  var LocaleId: String = js.native
  
  var MaxJDay: Double = js.native
  
  var MinJDay: Double = js.native
  
  /** Indicates wherever current user regional settings specify to display week numbers in day or week views of a calendar.
    Only appears for DateTime fields. */
  var ShowWeekNumber: Boolean = js.native
  
  var TimeSeparator: String = js.native
  
  var TimeZoneDifference: String = js.native
  
  var WorkWeek: String = js.native
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
  
  @scala.inline
  implicit class FieldSchemaInFormDateTimeMutableBuilder[Self <: FieldSchemaInFormDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarType(value: DateTimeCalendarType): Self = StObject.set(x, "CalendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFormat(value: DateTimeDisplayFormat): Self = StObject.set(x, "DisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "FirstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstWeekOfYear(value: Double): Self = StObject.set(x, "FirstWeekOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHijriAdjustment(value: Double): Self = StObject.set(x, "HijriAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursMode24(value: Boolean): Self = StObject.set(x, "HoursMode24", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursOptions(value: js.Array[String]): Self = StObject.set(x, "HoursOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursOptionsVarargs(value: String*): Self = StObject.set(x, "HoursOptions", js.Array(value :_*))
    
    @scala.inline
    def setLanguageId(value: String): Self = StObject.set(x, "LanguageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleId(value: String): Self = StObject.set(x, "LocaleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxJDay(value: Double): Self = StObject.set(x, "MaxJDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinJDay(value: Double): Self = StObject.set(x, "MinJDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "ShowWeekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparator(value: String): Self = StObject.set(x, "TimeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneDifference(value: String): Self = StObject.set(x, "TimeZoneDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeek(value: String): Self = StObject.set(x, "WorkWeek", value.asInstanceOf[js.Any])
  }
}
