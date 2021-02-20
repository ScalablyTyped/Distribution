package typings.reactBootstrapDatePicker

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  val ^ : DatePicker = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends Component[DatePickerProps, ComponentState, js.Any] {
    def this(props: DatePickerProps) = this()
    def this(props: DatePickerProps, context: js.Any) = this()
  }
  
  type ChangeCallback = js.Function2[/* value */ String, /* formattedValue */ String, Unit]
  
  type DatePicker = ComponentClass[DatePickerProps, ComponentState]
  
  @js.native
  trait DatePickerProps extends StObject {
    
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
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCalendarContainer(value: js.Any): Self = StObject.set(x, "calendarContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarContainerUndefined: Self = StObject.set(x, "calendarContainer", js.undefined)
      
      @scala.inline
      def setCalendarPlacement(value: String): Self = StObject.set(x, "calendarPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarPlacementUndefined: Self = StObject.set(x, "calendarPlacement", js.undefined)
      
      @scala.inline
      def setCellPadding(value: String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearButtonElement(value: ReactNode): Self = StObject.set(x, "clearButtonElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonElementUndefined: Self = StObject.set(x, "clearButtonElement", js.undefined)
      
      @scala.inline
      def setCustomControl(value: StatelessComponent[_] | (ComponentClass[_, ComponentState])): Self = StObject.set(x, "customControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomControlUndefined: Self = StObject.set(x, "customControl", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDayLabels(value: js.Array[String]): Self = StObject.set(x, "dayLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayLabelsUndefined: Self = StObject.set(x, "dayLabels", js.undefined)
      
      @scala.inline
      def setDayLabelsVarargs(value: String*): Self = StObject.set(x, "dayLabels", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMaxDate(value: String): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: String): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMonthLabels(value: js.Array[String]): Self = StObject.set(x, "monthLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthLabelsUndefined: Self = StObject.set(x, "monthLabels", js.undefined)
      
      @scala.inline
      def setMonthLabelsVarargs(value: String*): Self = StObject.set(x, "monthLabels", js.Array(value :_*))
      
      @scala.inline
      def setNextButtonElement(value: ReactNode): Self = StObject.set(x, "nextButtonElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonElementUndefined: Self = StObject.set(x, "nextButtonElement", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[_] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* formattedValue */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[_] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setPreviousButtonElement(value: ReactNode): Self = StObject.set(x, "previousButtonElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousButtonElementUndefined: Self = StObject.set(x, "previousButtonElement", js.undefined)
      
      @scala.inline
      def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      @scala.inline
      def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTodayButtonLabel(value: String): Self = StObject.set(x, "todayButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayButtonLabelUndefined: Self = StObject.set(x, "todayButtonLabel", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWeekStartsOnMonday(value: Boolean): Self = StObject.set(x, "weekStartsOnMonday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartsOnMondayUndefined: Self = StObject.set(x, "weekStartsOnMonday", js.undefined)
    }
  }
  
  type _To = DatePicker
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DatePicker = ^
}
