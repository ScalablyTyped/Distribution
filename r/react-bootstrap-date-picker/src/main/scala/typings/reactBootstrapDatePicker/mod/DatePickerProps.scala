package typings.reactBootstrapDatePicker.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerProps extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var calendarContainer: js.UndefOr[js.Any] = js.native
  
  var calendarPlacement: js.UndefOr[String] = js.native
  
  var cellPadding: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearButtonElement: js.UndefOr[ReactNode] = js.native
  
  var customControl: js.UndefOr[StatelessComponent[_] | (ComponentClass[_, ComponentState])] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var dayLabels: js.UndefOr[js.Array[String]] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var maxDate: js.UndefOr[String] = js.native
  
  var minDate: js.UndefOr[String] = js.native
  
  var monthLabels: js.UndefOr[js.Array[String]] = js.native
  
  var nextButtonElement: js.UndefOr[ReactNode] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.native
  
  var onChange: js.UndefOr[ChangeCallback] = js.native
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.native
  
  var previousButtonElement: js.UndefOr[ReactNode] = js.native
  
  var showClearButton: js.UndefOr[Boolean] = js.native
  
  var showTodayButton: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var todayButtonLabel: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var weekStartsOnMonday: js.UndefOr[Boolean] = js.native
}
object DatePickerProps {
  
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setCalendarContainer(value: js.Any): Self = this.set("calendarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarContainer: Self = this.set("calendarContainer", js.undefined)
    
    @scala.inline
    def setCalendarPlacement(value: String): Self = this.set("calendarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarPlacement: Self = this.set("calendarPlacement", js.undefined)
    
    @scala.inline
    def setCellPadding(value: String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearButtonElement(value: ReactNode): Self = this.set("clearButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonElement: Self = this.set("clearButtonElement", js.undefined)
    
    @scala.inline
    def setCustomControl(value: StatelessComponent[_] | (ComponentClass[_, ComponentState])): Self = this.set("customControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomControl: Self = this.set("customControl", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDayLabelsVarargs(value: String*): Self = this.set("dayLabels", js.Array(value :_*))
    
    @scala.inline
    def setDayLabels(value: js.Array[String]): Self = this.set("dayLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayLabels: Self = this.set("dayLabels", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setMaxDate(value: String): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: String): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMonthLabelsVarargs(value: String*): Self = this.set("monthLabels", js.Array(value :_*))
    
    @scala.inline
    def setMonthLabels(value: js.Array[String]): Self = this.set("monthLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthLabels: Self = this.set("monthLabels", js.undefined)
    
    @scala.inline
    def setNextButtonElement(value: ReactNode): Self = this.set("nextButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButtonElement: Self = this.set("nextButtonElement", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[_] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* value */ String, /* formattedValue */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[_] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setPreviousButtonElement(value: ReactNode): Self = this.set("previousButtonElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousButtonElement: Self = this.set("previousButtonElement", js.undefined)
    
    @scala.inline
    def setShowClearButton(value: Boolean): Self = this.set("showClearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearButton: Self = this.set("showClearButton", js.undefined)
    
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = this.set("showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTodayButton: Self = this.set("showTodayButton", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTodayButtonLabel(value: String): Self = this.set("todayButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayButtonLabel: Self = this.set("todayButtonLabel", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWeekStartsOnMonday(value: Boolean): Self = this.set("weekStartsOnMonday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStartsOnMonday: Self = this.set("weekStartsOnMonday", js.undefined)
  }
}
