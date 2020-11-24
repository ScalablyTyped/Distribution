package typings.reactNativeWindows.datePickerPropsMod

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket
import typings.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket
import typings.reactNativeWindows.reactNativeWindowsStrings.LeftcurlybracketdayofweekDotfullRightcurlybracket
import typings.reactNativeWindows.reactNativeWindowsStrings.`day month year`
import typings.reactNativeWindows.reactNativeWindowsStrings.`dayofweek day month`
import typings.reactNativeWindows.reactNativeWindowsStrings.longdate
import typings.reactNativeWindows.reactNativeWindowsStrings.shortdate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerProps extends ViewProps {
  
  var dateFormat: js.UndefOr[(`day month year`) | (`dayofweek day month`) | longdate | shortdate] = js.native
  
  var dayOfWeekFormat: js.UndefOr[
    LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotfullRightcurlybracket
  ] = js.native
  
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* event */ IDatePickerChangeEvent, Unit]] = js.native
  
  var onDateChange: js.UndefOr[js.Function1[/* newDate */ Date, Unit]] = js.native
  
  var placeholderText: js.UndefOr[String] = js.native
  
  var selectedDate: js.UndefOr[Date] = js.native
  
  var timeZoneOffsetInSeconds: js.UndefOr[Double] = js.native
}
object IDatePickerProps {
  
  @scala.inline
  def apply(): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerProps]
  }
  
  @scala.inline
  implicit class IDatePickerPropsOps[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateFormat(value: (`day month year`) | (`dayofweek day month`) | longdate | shortdate): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDayOfWeekFormat(
      value: LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis2RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotabbreviatedLeftparenthesis3RightparenthesisRightcurlybracket | LeftcurlybracketdayofweekDotfullRightcurlybracket
    ): Self = this.set("dayOfWeekFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeekFormat: Self = this.set("dayOfWeekFormat", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: DayOfWeek): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ IDatePickerChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnDateChange(value: /* newDate */ Date => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setSelectedDate(value: Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDate: Self = this.set("selectedDate", js.undefined)
    
    @scala.inline
    def setTimeZoneOffsetInSeconds(value: Double): Self = this.set("timeZoneOffsetInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneOffsetInSeconds: Self = this.set("timeZoneOffsetInSeconds", js.undefined)
  }
}
