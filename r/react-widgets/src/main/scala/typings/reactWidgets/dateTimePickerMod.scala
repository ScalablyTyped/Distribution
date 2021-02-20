package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactType
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import typings.reactWidgets.reactWidgetsStrings.century
import typings.reactWidgets.reactWidgetsStrings.decade
import typings.reactWidgets.reactWidgetsStrings.month
import typings.reactWidgets.reactWidgetsStrings.year
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePickerMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/DateTimePicker", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[DateTimePickerProps, ComponentState, js.Any] {
    def this(props: DateTimePickerProps) = this()
    def this(props: DateTimePickerProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/DateTimePicker", JSImport.Namespace)
  @js.native
  val ^ : DateTimePickerClass = js.native
  
  type DateTimePickerClass = ComponentClass[DateTimePickerProps, ComponentState]
  
  @js.native
  trait DateTimePickerMessages extends StObject {
    
    /**
      * Title and screen reader text for the left arrow button.
      * @default "Select Date"
      */
    var dateButton: js.UndefOr[String] = js.native
    
    /**
      * Title and screen reader text for the right arrow button.
      * @default "Select Time"
      */
    var timeButton: js.UndefOr[String] = js.native
  }
  object DateTimePickerMessages {
    
    @scala.inline
    def apply(): DateTimePickerMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimePickerMessages]
    }
    
    @scala.inline
    implicit class DateTimePickerMessagesMutableBuilder[Self <: DateTimePickerMessages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateButton(value: String): Self = StObject.set(x, "dateButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateButtonUndefined: Self = StObject.set(x, "dateButton", js.undefined)
      
      @scala.inline
      def setTimeButton(value: String): Self = StObject.set(x, "timeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeButtonUndefined: Self = StObject.set(x, "timeButton", js.undefined)
    }
  }
  
  @js.native
  trait DateTimePickerProps
    extends ReactWidgetsCommonDropdownProps
       with AutoFocus {
    
    /**
      * Whether to show the date picker button.
      * @default true
      * @deprecated Use `date` instead
      */
    var calendar: js.UndefOr[Boolean] = js.native
    
    /**
      * Adds a css class to the input container element.
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * Set the culture of the DateTimePicker, passed to the configured localizer.
      */
    var culture: js.UndefOr[String] = js.native
    
    /**
      * Default current date at which the calendar opens. If none is provided, opens at today's
      * date or the value date (if any).
      * @default Date()
      */
    var currentDate: js.UndefOr[Date] = js.native
    
    /**
      * Default value for current date. Useful for suggesting a date when the caldenar opens without keep forcing it once 'value' is set.
      */
    var date: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the element used to render the calendar dropdown icon.
      */
    var dateIcon: js.UndefOr[Element] = js.native
    
    /**
      * Default current date
      */
    var defaultCurrentDate: js.UndefOr[Date] = js.native
    
    /**
      * The defaultOpen prop can be used to set an
      * initialization value for uncontrolled widgets.
      */
    var defaultOpen: js.UndefOr[Open] = js.native
    
    /**
      * Default value.
      */
    var defaultValue: js.UndefOr[Date] = js.native
    
    /**
      * The speed, in milliseconds, of the either dropdown animation.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * A string format to be used while the date input has focus. Useful for showing a simpler
      * format for inputing.
      */
    var editFormat: js.UndefOr[String] = js.native
    
    /**
      * The highest level view the calendar can navigate up to. This value should be higher than
      * initialView.
      */
    var finalView: js.UndefOr[month | year | decade | century] = js.native
    
    /**
      * A string format used to display the date value.
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * The starting and lowest level view the calendar can navigate down to.
      */
    var initialView: js.UndefOr[month | year | decade | century] = js.native
    
    /**
      * An object of props that is passed directly to the underlying input component.
      */
    var inputProps: js.UndefOr[js.Object] = js.native
    
    /**
      * The maximum Date that can be selected. Max only limits selection, it doesn't constrain
      * the date values that can be typed or pasted into the widget. If you need this behavior
      * you can constrain values via the onChange handler.
      * @default Date(2099, 11, 31)
      */
    var max: js.UndefOr[Date] = js.native
    
    /**
      * Object hash containing display text and/or text for screen readers. Use the messages
      * object to localize widget text and increase accessibility.
      */
    var messages: js.UndefOr[DateTimePickerMessages] = js.native
    
    /**
      * The minimum Date that can be selected. Min only limits selection, it doesn't constrain
      * the date values that can be typed or pasted into the widget. If you need this behavior
      * you can constrain values via the onChange handler.
      * @default Date(1900, 0, 1)
      */
    var min: js.UndefOr[Date] = js.native
    
    /**
      * The HTML name attribute, passed directly to the input element.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The native onBlur event, called when focus leaves the DateTimePicker entirely.
      */
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Change event Handler that is called when the value is changed. The handler is called with
      * both the current Date object (or null if it was not parseable), and the second argument
      * is a string representation of the date value, formated by the format prop.
      */
    var onChange: js.UndefOr[
        js.Function2[/* date */ js.UndefOr[Date], /* dateStr */ js.UndefOr[String], Unit]
      ] = js.native
    
    /**
      * Change event Handler that is called when the currentDate is changed. The handler is
      * called with the currentDate object.
      */
    var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.native
    
    /**
      * The native onFocus event, called when focus enters the DateTimePicker.
      */
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
      */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[_], Unit]] = js.native
    
    /**
      * The native onKeyPress event, called preventDefault will stop any custom behavior.
      */
    var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent[_], Unit]] = js.native
    
    /**
      * This handler fires when an item has been selected from the list or calendar. It fires
      * before the onChange handler, and fires regardless of whether the value has actually
      * changed.
      */
    var onSelect: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.native
    
    /**
      * Called when the DateTimePicker is about to open or close. onToggle should be used when
      * the open prop is set otherwise the widget will never open or close.
      */
    var onToggle: js.UndefOr[js.Function1[/* isOpen */ Open, Unit]] = js.native
    
    /**
      * Whether or not the DateTimePicker is open. When unset (undefined) the DateTimePicker will
      * handle the opening and closing internally.
      * @default false
      */
    var open: js.UndefOr[Open] = js.native
    
    /**
      * Determines how the widget parses the typed date string into a Date object. You can
      * provide an array of formats to try, or provide a function that returns a date to handle
      * parsing yourself. When parse is unspecified and the format prop is a String parse will
      * automatically use that format as its default
      */
    var parse: js.UndefOr[(js.Function1[/* str */ String, Date]) | js.Array[String] | String] = js.native
    
    /**
      * Text to display in the input when the value is empty.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * A Transition component from react-transition-group v2.
      * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
      * The transition component is also injected with a dropUp prop indicating the direction it should open.
      */
    var popupTransition: js.UndefOr[ReactType[_] | String] = js.native
    
    /**
      * The amount of minutes between each entry in the time list.
      */
    var step: js.UndefOr[Double | Boolean] = js.native
    
    /**
      * Whether to show the time picker button.
      * @default true
      */
    var time: js.UndefOr[Boolean] = js.native
    
    /**
      * A customize the rendering of times but providing a custom component.
      */
    var timeComponent: js.UndefOr[ReactType[_] | String] = js.native
    
    /**
      * A string format used by the time dropdown to render times.
      */
    var timeFormat: js.UndefOr[String] = js.native
    
    /**
      * Specify the element used to render the time list dropdown icon.
      */
    var timeIcon: js.UndefOr[Element] = js.native
    
    /**
      * The current selected date, should be a Date instance or null.
      */
    var value: js.UndefOr[Date] = js.native
  }
  object DateTimePickerProps {
    
    @scala.inline
    def apply(): DateTimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimePickerProps]
    }
    
    @scala.inline
    implicit class DateTimePickerPropsMutableBuilder[Self <: DateTimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: Boolean): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      @scala.inline
      def setCurrentDate(value: Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      @scala.inline
      def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateIcon(value: Element): Self = StObject.set(x, "dateIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateIconUndefined: Self = StObject.set(x, "dateIcon", js.undefined)
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDefaultCurrentDate(value: Date): Self = StObject.set(x, "defaultCurrentDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCurrentDateUndefined: Self = StObject.set(x, "defaultCurrentDate", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Open): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEditFormat(value: String): Self = StObject.set(x, "editFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditFormatUndefined: Self = StObject.set(x, "editFormat", js.undefined)
      
      @scala.inline
      def setFinalView(value: month | year | decade | century): Self = StObject.set(x, "finalView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalViewUndefined: Self = StObject.set(x, "finalView", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInitialView(value: month | year | decade | century): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialViewUndefined: Self = StObject.set(x, "initialView", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessages(value: DateTimePickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* date */ js.UndefOr[Date], /* dateStr */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCurrentDateChange(value: /* date */ js.UndefOr[Date] => Unit): Self = StObject.set(x, "onCurrentDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCurrentDateChangeUndefined: Self = StObject.set(x, "onCurrentDateChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ KeyboardEvent[_] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ KeyboardEvent[_] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* date */ js.UndefOr[Date] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* isOpen */ Open => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Open): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setParse(value: (js.Function1[/* str */ String, Date]) | js.Array[String] | String): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFunction1(value: /* str */ String => Date): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setParseVarargs(value: String*): Self = StObject.set(x, "parse", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupTransition(value: ReactType[_] | String): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionUndefined: Self = StObject.set(x, "popupTransition", js.undefined)
      
      @scala.inline
      def setStep(value: Double | Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeComponent(value: ReactType[_] | String): Self = StObject.set(x, "timeComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeComponentUndefined: Self = StObject.set(x, "timeComponent", js.undefined)
      
      @scala.inline
      def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      @scala.inline
      def setTimeIcon(value: Element): Self = StObject.set(x, "timeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeIconUndefined: Self = StObject.set(x, "timeIcon", js.undefined)
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsBooleans.`false`
    - typings.reactWidgets.reactWidgetsStrings.date
    - typings.reactWidgets.reactWidgetsStrings.time
  */
  trait Open extends StObject
  object Open {
    
    @scala.inline
    def date: typings.reactWidgets.reactWidgetsStrings.date = "date".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.date]
    
    @scala.inline
    def `false`: typings.reactWidgets.reactWidgetsBooleans.`false` = false.asInstanceOf[typings.reactWidgets.reactWidgetsBooleans.`false`]
    
    @scala.inline
    def time: typings.reactWidgets.reactWidgetsStrings.time = "time".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.time]
  }
  
  type _To = DateTimePickerClass
  
  /* This means you don't have to write `^`, but can instead just say `dateTimePickerMod.foo` */
  override def _to: DateTimePickerClass = ^
}
