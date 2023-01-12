package typings.reactBootstrapDatePicker

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DatePicker = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  open class Class protected () extends Component[DatePickerProps, ComponentState, Any] {
    def this(props: DatePickerProps) = this()
    def this(props: DatePickerProps, context: Any) = this()
  }
  
  type ChangeCallback = js.Function2[/* value */ String, /* formattedValue */ String, Unit]
  
  type DatePicker = ComponentClass[DatePickerProps, ComponentState]
  
  trait DatePickerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarContainer: js.UndefOr[Any] = js.undefined
    
    var calendarPlacement: js.UndefOr[String] = js.undefined
    
    var cellPadding: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButtonElement: js.UndefOr[ReactNode] = js.undefined
    
    var customControl: js.UndefOr[FunctionComponent[Any] | (ComponentClass[Any, ComponentState])] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var dayLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var maxDate: js.UndefOr[String] = js.undefined
    
    var minDate: js.UndefOr[String] = js.undefined
    
    var monthLabels: js.UndefOr[js.Array[String]] = js.undefined
    
    var nextButtonElement: js.UndefOr[ReactNode] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[Any]] = js.undefined
    
    var onChange: js.UndefOr[ChangeCallback] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[Any]] = js.undefined
    
    var previousButtonElement: js.UndefOr[ReactNode] = js.undefined
    
    var showClearButton: js.UndefOr[Boolean] = js.undefined
    
    var showTodayButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var todayButtonLabel: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var weekStartsOnMonday: js.UndefOr[Boolean] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarContainer(value: Any): Self = StObject.set(x, "calendarContainer", value.asInstanceOf[js.Any])
      
      inline def setCalendarContainerUndefined: Self = StObject.set(x, "calendarContainer", js.undefined)
      
      inline def setCalendarPlacement(value: String): Self = StObject.set(x, "calendarPlacement", value.asInstanceOf[js.Any])
      
      inline def setCalendarPlacementUndefined: Self = StObject.set(x, "calendarPlacement", js.undefined)
      
      inline def setCellPadding(value: String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButtonElement(value: ReactNode): Self = StObject.set(x, "clearButtonElement", value.asInstanceOf[js.Any])
      
      inline def setClearButtonElementUndefined: Self = StObject.set(x, "clearButtonElement", js.undefined)
      
      inline def setCustomControl(value: FunctionComponent[Any] | (ComponentClass[Any, ComponentState])): Self = StObject.set(x, "customControl", value.asInstanceOf[js.Any])
      
      inline def setCustomControlUndefined: Self = StObject.set(x, "customControl", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDayLabels(value: js.Array[String]): Self = StObject.set(x, "dayLabels", value.asInstanceOf[js.Any])
      
      inline def setDayLabelsUndefined: Self = StObject.set(x, "dayLabels", js.undefined)
      
      inline def setDayLabelsVarargs(value: String*): Self = StObject.set(x, "dayLabels", js.Array(value*))
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMaxDate(value: String): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthLabels(value: js.Array[String]): Self = StObject.set(x, "monthLabels", value.asInstanceOf[js.Any])
      
      inline def setMonthLabelsUndefined: Self = StObject.set(x, "monthLabels", js.undefined)
      
      inline def setMonthLabelsVarargs(value: String*): Self = StObject.set(x, "monthLabels", js.Array(value*))
      
      inline def setNextButtonElement(value: ReactNode): Self = StObject.set(x, "nextButtonElement", value.asInstanceOf[js.Any])
      
      inline def setNextButtonElementUndefined: Self = StObject.set(x, "nextButtonElement", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[Any, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* value */ String, /* formattedValue */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[Any, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setPreviousButtonElement(value: ReactNode): Self = StObject.set(x, "previousButtonElement", value.asInstanceOf[js.Any])
      
      inline def setPreviousButtonElementUndefined: Self = StObject.set(x, "previousButtonElement", js.undefined)
      
      inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      inline def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
      
      inline def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTodayButtonLabel(value: String): Self = StObject.set(x, "todayButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonLabelUndefined: Self = StObject.set(x, "todayButtonLabel", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWeekStartsOnMonday(value: Boolean): Self = StObject.set(x, "weekStartsOnMonday", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnMondayUndefined: Self = StObject.set(x, "weekStartsOnMonday", js.undefined)
    }
  }
  
  type _To = js.Object & DatePicker
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DatePicker = ^
}
