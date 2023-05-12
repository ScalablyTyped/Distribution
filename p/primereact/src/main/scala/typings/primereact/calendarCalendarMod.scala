package typings.primereact

import typings.primereact.primereactStrings.`12`
import typings.primereact.primereactStrings.`24`
import typings.primereact.primereactStrings.date
import typings.primereact.primereactStrings.dateselect
import typings.primereact.primereactStrings.left
import typings.primereact.primereactStrings.month
import typings.primereact.primereactStrings.multiple
import typings.primereact.primereactStrings.outside
import typings.primereact.primereactStrings.range
import typings.primereact.primereactStrings.right
import typings.primereact.primereactStrings.self
import typings.primereact.primereactStrings.single
import typings.primereact.primereactStrings.year
import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.primereact.tsHelpersMod.FormEvent
import typings.primereact.tsHelpersMod.Nullable
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarCalendarMod {
  
  @JSImport("primereact/calendar/calendar", "Calendar")
  @js.native
  open class Calendar protected () extends Component[CalendarProps, Any, Any] {
    def this(props: CalendarProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CalendarProps, context: Any) = this()
    
    /**
      * Used to focus the component.
      */
    def focus(): Unit = js.native
    
    /**
      * Used to get the current date.
      * @return {Date | Date[]} Current Date
      */
    def getCurrentDateTime(): js.Date | js.Array[js.Date] = js.native
    
    /**
      * Used to get container element.
      * @return {HTMLSpanElement} Container element
      */
    def getElement(): HTMLSpanElement = js.native
    
    /**
      * Used to get input element.
      * @return {HTMLInputElement} Input element
      */
    def getInput(): HTMLInputElement = js.native
    
    /**
      * Used to get overlay element.
      * @return {HTMLElement} Overlay element
      */
    def getOverlay(): HTMLElement = js.native
    
    /**
      * Used to get the view date.
      * @return {Date | Date[]} View Date
      */
    def getViewDate(): js.Date | js.Array[js.Date] = js.native
    
    /**
      * Used to hide the overlay.
      */
    def hide(): Unit = js.native
    
    /**
      * Used to show the overlay.
      */
    def show(): Unit = js.native
    
    /**
      * Used to update the current view date.
      * @param {React.SyntheticEvent | null} event - Browser event.
      * @param {Date | Date[] | null} value - New date.
      */
    def updateViewDate(): Unit = js.native
    def updateViewDate(event: Null, value: js.Array[js.Date]): Unit = js.native
    def updateViewDate(event: Null, value: js.Date): Unit = js.native
    def updateViewDate(event: SyntheticEvent[Element, Event]): Unit = js.native
    def updateViewDate(event: SyntheticEvent[Element, Event], value: js.Array[js.Date]): Unit = js.native
    def updateViewDate(event: SyntheticEvent[Element, Event], value: js.Date): Unit = js.native
  }
  
  /**
    * Custom change event.
    * @see {@link CalendarProps.onChange}
    * @extends {FormEvent}
    * @event
    */
  type CalendarChangeEvent = FormEvent[js.Date | js.Array[js.Date] | String, SyntheticEvent[Element, Event]]
  
  /**
    * Custom date template event
    * @see {@link CalendarProps.dateTemplate}
    * @event
    */
  trait CalendarDateTemplateEvent extends StObject {
    
    /**
      * Current day
      */
    var day: Double
    
    /**
      * Current month
      */
    var month: Double
    
    /**
      * Whether the date belongs to the other month
      */
    var otherMonth: Boolean
    
    /**
      * Whether the date is selectable
      */
    var selectable: Boolean
    
    /**
      * Whether the day is today
      */
    var today: Boolean
    
    /**
      * Current year
      */
    var year: Double
  }
  object CalendarDateTemplateEvent {
    
    inline def apply(day: Double, month: Double, otherMonth: Boolean, selectable: Boolean, today: Boolean, year: Double): CalendarDateTemplateEvent = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], otherMonth = otherMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarDateTemplateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarDateTemplateEvent] (val x: Self) extends AnyVal {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setOtherMonth(value: Boolean): Self = StObject.set(x, "otherMonth", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom month change event.
    * @see {@link CalendarProps.onMonthChange}
    * @event
    */
  trait CalendarMonthChangeEvent extends StObject {
    
    /**
      * The number of month
      */
    var month: Double
    
    /**
      * The number of year
      */
    var year: Double
  }
  object CalendarMonthChangeEvent {
    
    inline def apply(month: Double, year: Double): CalendarMonthChangeEvent = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarMonthChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarMonthChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom month navigator template event
    * @see {@link CalendarProps.monthNavigatorTemplate}
    * @extends {CalendarNavigatorTemplateEvent}
    * @event
    */
  type CalendarMonthNavigatorTemplateEvent = CalendarNavigatorTemplateEvent
  
  /**
    * Custom common navigator template event
    * @hidden
    */
  @js.native
  trait CalendarNavigatorTemplateEvent extends StObject {
    
    /**
      * Style class of the navigator.
      */
    var className: String = js.native
    
    /**
      * The default navigator component
      */
    var element: ReactNode = js.native
    
    /**
      * The names of the current navigator
      */
    var names: js.Array[Any] = js.native
    
    /**
      * Navigator change callback
      * @param {React.SyntheticEvent} event - Browser event
      * @param {string | number | null} [value] - The value of current navigator
      */
    def onChange(event: SyntheticEvent[Element, Event]): Unit = js.native
    def onChange(event: SyntheticEvent[Element, Event], value: String): Unit = js.native
    def onChange(event: SyntheticEvent[Element, Event], value: Double): Unit = js.native
    
    /**
      * The options of the current navigator
      */
    var options: js.Array[Any] = js.native
    
    /**
      * The props of Calendar component
      */
    var props: CalendarProps = js.native
    
    /**
      * The value of the current navigator
      */
    var value: js.UndefOr[String | Double | Null] = js.native
  }
  
  trait CalendarProps extends StObject {
    
    /**
      * DOM element instance where the overlay panel should be mounted. Valid values are any DOM Element and "self". The "self" value is used to render a component where it is located.
      * @defaultValue document.body
      */
    var appendTo: js.UndefOr[self | HTMLElement | Null] = js.undefined
    
    /**
      * Establishes relationships between the component and label(s) where its value should be one or more element IDs.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to automatically manage layering.
      * @defaultValue true
      */
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Base zIndex value to use in layering.
      * @defaultValue 0
      */
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Style class of the clear button.
      * @defaultValue p-secondary-button
      */
    var clearButtonClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Format of the date.
      * @defaultValue mm/dd/yy
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Function that gets a date information and returns the cell content in datepicker.
      * @param {CalendarDateTemplateEvent} event - Custom date template event
      * @return {React.ReactNode}
      */
    var dateTemplate: js.UndefOr[js.Function1[/* event */ CalendarDateTemplateEvent, ReactNode]] = js.undefined
    
    /**
      * Function that gets a navigator information and returns the decade selections in the panel.
      * @param {number[]} yearValues - The values of years
      * @return {React.ReactNode}
      */
    var decadeTemplate: js.UndefOr[js.Function1[/* yearValues */ js.Array[Double], ReactNode]] = js.undefined
    
    /**
      * Icon to show in each of the decrement buttons.
      */
    var decrementIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ] = js.undefined
    
    /**
      * When specified, disables the component.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array with dates to disable.
      */
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    /**
      * Array with disabled weekday numbers.
      */
    var disabledDays: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Custom footer template of overlay.
      * @return {React.ReactNode}
      */
    var footerTemplate: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    /**
      * Function for overriding default behavior that formats a Date to the string representation.
      * @param {Date} date - Formating date
      * @return {string} Formatted date
      */
    var formatDateTime: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
    
    /**
      * Custom header template of overlay.
      * @return {React.ReactNode}
      */
    var headerTemplate: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    /**
      * Whether to hide the overlay on date selection when showTime is enabled.
      * @defaultValue false
      */
    var hideOnDateTimeSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies 12 or 24 hour format.
      * @defaultValue 24
      */
    var hourFormat: js.UndefOr[`12` | `24`] = js.undefined
    
    /**
      * Icon of the calendar button.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ] = js.undefined
    
    /**
      * Icon position of the calendar button.
      * @defaultValue right
      */
    var iconPos: js.UndefOr[left | right] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Icon to show in each of the increment buttons.
      */
    var incrementIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ] = js.undefined
    
    /**
      * When enabled, displays the calendar as inline instead of an overlay.
      * @defaultValue false
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style class of the input element.
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of the input element.
      */
    var inputId: js.UndefOr[String] = js.undefined
    
    /**
      * Reference of the input element.
      */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    /**
      * Inline style of the input field.
      */
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Keep invalid value when input blur.
      * @defaultValue false
      */
    var keepInvalid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to display the values ​​of the locale object defined in the Locale API.
      * @defaultValue en
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * Mask pattern for input element.
      */
    var mask: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum selectable date.
      */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Maximum number of selectable dates in multiple mode.
      */
    var maxDateCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum selectable date.
      */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Whether the month should be rendered as a dropdown instead of text.
      * @deprecated since v6. Navigator is always on.
      * @defaultValue false
      */
    var monthNavigator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that gets a navigator information and returns the navigator element in header.
      * @param {CalendarMonthNavigatorTemplateEvent} event - Custom month navigator template event.
      * @return {React.ReactNode}
      */
    var monthNavigatorTemplate: js.UndefOr[js.Function1[/* event */ CalendarMonthNavigatorTemplateEvent, ReactNode]] = js.undefined
    
    /**
      * Name of the input element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Icon to show in the next button.
      */
    var nextIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ] = js.undefined
    
    /**
      * Number of months to display.
      * @defaultValue 1
      */
    var numberOfMonths: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback to invoke on blur event of input field.
      * @param {React.FocusEvent<HTMLInputElement>} event - Browser event
      */
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.undefined
    
    /**
      * Callback to invoke when value changes.
      * @param {CalendarChangeEvent} event - Custom change event
      */
    var onChange: js.UndefOr[js.Function1[/* event */ CalendarChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when clear button is clicked.
      * @param {React.MouseEvent<HTMLButtonElement>} event - Browser event
      */
    var onClearButtonClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke on focus event of input field.
      * @param {React.FocusEvent<HTMLInputElement>} event - Browser event
      */
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.undefined
    
    /**
      * Callback to invoke when overlay panel or modal becomes hidden.
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback to invoke on input event of input field.
      * @param {React.FormEvent<HTMLInputElement>} event - Browser event
      */
    var onInput: js.UndefOr[js.Function1[/* event */ typings.react.mod.FormEvent[HTMLInputElement], Unit]] = js.undefined
    
    /**
      * Callback to invoke when month changes.
      * @param {CalendarMonthChangeEvent} event - Custom month change event
      */
    var onMonthChange: js.UndefOr[js.Function1[/* event */ CalendarMonthChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a date is selected.
      * @param {CalendarSelectEvent} event - Custom select event
      */
    var onSelect: js.UndefOr[js.Function1[/* event */ CalendarSelectEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when overlay panel or modal becomes visible.
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback to invoke when today button is clicked.
      * @param {React.MouseEvent<HTMLButtonElement>} event - Browser event
      */
    var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when the displayed month/year is changed.
      * @param {CalendarViewChangeEvent} event - Custom view change event
      */
    var onViewDateChange: js.UndefOr[js.Function1[/* event */ CalendarViewChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when visible is changed.
      * @param {CalendarVisibleChangeEvent} event - Custom visible change event
      */
    var onVisibleChange: js.UndefOr[js.Function1[/* event */ CalendarVisibleChangeEvent, Unit]] = js.undefined
    
    /**
      * Style class of the datetimepicker panel.
      */
    var panelClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the datetimepicker panel.
      */
    var panelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Function for overriding default behavior that parses text into the Date.
      * @param {string} text - Parsing date
      * @return {Date} Parsed date
      */
    var parseDateTime: js.UndefOr[js.Function1[/* text */ String, js.Date]] = js.undefined
    
    /**
      * Placeholder text for the input.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Icon to show in the previous button.
      */
    var prevIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ] = js.undefined
    
    /**
      * When specified, prevents entering the date manually with keyboard.
      * @defaultValue false
      */
    var readOnlyInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When present, it specifies that an input field must be filled out before submitting the form.
      * @defaultValue false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths option is set to true.
      * @defaultValue false
      */
    var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the selection mode.
      * @defaultValue single
      */
    var selectionMode: js.UndefOr[single | multiple | range] = js.undefined
    
    /**
      * The cutoff year for determining the century for a date.
      * @defaultValue +10
      */
    var shortYearCutoff: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to display today and clear buttons at the footer
      * @defaultValue false
      */
    var showButtonBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, displays a button with icon next to input.
      * @defaultValue false
      */
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the milliseconds in time picker.
      * @defaultValue false
      */
    var showMillisec: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to allow navigation past min/max dates.
      * @defaultValue false
      */
    var showMinMaxRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When disabled, datepicker will not be visible with input focus.
      * @defaultValue true
      */
    var showOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use the selectOtherMonths option.
      * @defaultValue true
      */
    var showOtherMonths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the seconds in time picker.
      * @defaultValue false
      */
    var showSeconds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display timepicker.
      * @defaultValue false
      */
    var showTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, calendar will show week numbers.
      * @defaultValue false
      */
    var showWeek: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hours to change per step.
      * @defaultValue 1
      */
    var stepHour: js.UndefOr[Double] = js.undefined
    
    /**
      * Milliseconds to change per step.
      * @defaultValue 1
      */
    var stepMillisec: js.UndefOr[Double] = js.undefined
    
    /**
      * Minutes to change per step.
      * @defaultValue 1
      */
    var stepMinute: js.UndefOr[Double] = js.undefined
    
    /**
      * Seconds to change per step.
      * @defaultValue 1
      */
    var stepSecond: js.UndefOr[Double] = js.undefined
    
    /**
      * Inline style of the element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Index of the element in tabbing order.
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to display timepicker only.
      * @defaultValue false
      */
    var timeOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style class of the today button.
      * @defaultValue p-secondary-button
      */
    var todayButtonClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Content of the tooltip.
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration of the tooltip, refer to the tooltip documentation for more information.
      * @type {TooltipOptions}
      */
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    /**
      * When enabled, calendar overlay is displayed as optimized for touch devices.
      * @defaultValue false
      */
    var touchUI: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The properties of CSSTransition can be customized, except for "nodeRef" and "in" properties.
      * @type {CSSTransitionProps}
      */
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    /**
      * Value of the component.
      * @defaultValue null
      */
    var value: js.UndefOr[js.Date | js.Array[js.Date] | String | Null] = js.undefined
    
    /**
      * Type of view to display.
      * @defaultValue date
      */
    var view: js.UndefOr[date | month | year] = js.undefined
    
    /**
      * Date instance whose month and year are used to display the calendar.
      */
    var viewDate: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * Specifies the visibility of the overlay.
      * @defaultValue false
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the year should be rendered as a dropdown instead of text.
      * @deprecated since v6. Navigator is always on.
      * @defaultValue false
      */
    var yearNavigator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that gets a navigator information and returns the navigator in header.
      * @param {CalendarYearNavigatorTemplateEvent} event - Custom year navigator template event
      */
    var yearNavigatorTemplate: js.UndefOr[js.Function1[/* event */ CalendarYearNavigatorTemplateEvent, ReactNode]] = js.undefined
    
    /**
      * The range of years displayed in the year drop-down in (nnnn:nnnn) format such as (2000:2020).
      */
    var yearRange: js.UndefOr[String] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      inline def setAppendTo(value: self | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButtonClassName(value: String): Self = StObject.set(x, "clearButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setClearButtonClassNameUndefined: Self = StObject.set(x, "clearButtonClassName", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDateTemplate(value: /* event */ CalendarDateTemplateEvent => ReactNode): Self = StObject.set(x, "dateTemplate", js.Any.fromFunction1(value))
      
      inline def setDateTemplateUndefined: Self = StObject.set(x, "dateTemplate", js.undefined)
      
      inline def setDecadeTemplate(value: /* yearValues */ js.Array[Double] => ReactNode): Self = StObject.set(x, "decadeTemplate", js.Any.fromFunction1(value))
      
      inline def setDecadeTemplateUndefined: Self = StObject.set(x, "decadeTemplate", js.undefined)
      
      inline def setDecrementIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ): Self = StObject.set(x, "decrementIcon", value.asInstanceOf[js.Any])
      
      inline def setDecrementIconUndefined: Self = StObject.set(x, "decrementIcon", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setDisabledDays(value: js.Array[Double]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      inline def setDisabledDaysVarargs(value: Double*): Self = StObject.set(x, "disabledDays", js.Array(value*))
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooterTemplate(value: () => ReactNode): Self = StObject.set(x, "footerTemplate", js.Any.fromFunction0(value))
      
      inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      inline def setFormatDateTime(value: /* date */ js.Date => String): Self = StObject.set(x, "formatDateTime", js.Any.fromFunction1(value))
      
      inline def setFormatDateTimeUndefined: Self = StObject.set(x, "formatDateTime", js.undefined)
      
      inline def setHeaderTemplate(value: () => ReactNode): Self = StObject.set(x, "headerTemplate", js.Any.fromFunction0(value))
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHideOnDateTimeSelect(value: Boolean): Self = StObject.set(x, "hideOnDateTimeSelect", value.asInstanceOf[js.Any])
      
      inline def setHideOnDateTimeSelectUndefined: Self = StObject.set(x, "hideOnDateTimeSelect", js.undefined)
      
      inline def setHourFormat(value: `12` | `24`): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconPos(value: left | right): Self = StObject.set(x, "iconPos", value.asInstanceOf[js.Any])
      
      inline def setIconPosUndefined: Self = StObject.set(x, "iconPos", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncrementIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ): Self = StObject.set(x, "incrementIcon", value.asInstanceOf[js.Any])
      
      inline def setIncrementIconUndefined: Self = StObject.set(x, "incrementIcon", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
      
      inline def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateCount(value: Double): Self = StObject.set(x, "maxDateCount", value.asInstanceOf[js.Any])
      
      inline def setMaxDateCountUndefined: Self = StObject.set(x, "maxDateCount", js.undefined)
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthNavigator(value: Boolean): Self = StObject.set(x, "monthNavigator", value.asInstanceOf[js.Any])
      
      inline def setMonthNavigatorTemplate(value: /* event */ CalendarMonthNavigatorTemplateEvent => ReactNode): Self = StObject.set(x, "monthNavigatorTemplate", js.Any.fromFunction1(value))
      
      inline def setMonthNavigatorTemplateUndefined: Self = StObject.set(x, "monthNavigatorTemplate", js.undefined)
      
      inline def setMonthNavigatorUndefined: Self = StObject.set(x, "monthNavigator", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNextIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* event */ CalendarChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClearButtonClick(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClearButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnClearButtonClickUndefined: Self = StObject.set(x, "onClearButtonClick", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnInput(value: /* event */ typings.react.mod.FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnMonthChange(value: /* event */ CalendarMonthChangeEvent => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnSelect(value: /* event */ CalendarSelectEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnTodayButtonClick(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onTodayButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnTodayButtonClickUndefined: Self = StObject.set(x, "onTodayButtonClick", js.undefined)
      
      inline def setOnViewDateChange(value: /* event */ CalendarViewChangeEvent => Unit): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1(value))
      
      inline def setOnViewDateChangeUndefined: Self = StObject.set(x, "onViewDateChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* event */ CalendarVisibleChangeEvent => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      inline def setPanelStyle(value: CSSProperties): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      inline def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      inline def setParseDateTime(value: /* text */ String => js.Date): Self = StObject.set(x, "parseDateTime", js.Any.fromFunction1(value))
      
      inline def setParseDateTimeUndefined: Self = StObject.set(x, "parseDateTime", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrevIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
      ): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      inline def setReadOnlyInput(value: Boolean): Self = StObject.set(x, "readOnlyInput", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyInputUndefined: Self = StObject.set(x, "readOnlyInput", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
      
      inline def setSelectionMode(value: single | multiple | range): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShortYearCutoff(value: String): Self = StObject.set(x, "shortYearCutoff", value.asInstanceOf[js.Any])
      
      inline def setShortYearCutoffUndefined: Self = StObject.set(x, "shortYearCutoff", js.undefined)
      
      inline def setShowButtonBar(value: Boolean): Self = StObject.set(x, "showButtonBar", value.asInstanceOf[js.Any])
      
      inline def setShowButtonBarUndefined: Self = StObject.set(x, "showButtonBar", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowMillisec(value: Boolean): Self = StObject.set(x, "showMillisec", value.asInstanceOf[js.Any])
      
      inline def setShowMillisecUndefined: Self = StObject.set(x, "showMillisec", js.undefined)
      
      inline def setShowMinMaxRange(value: Boolean): Self = StObject.set(x, "showMinMaxRange", value.asInstanceOf[js.Any])
      
      inline def setShowMinMaxRangeUndefined: Self = StObject.set(x, "showMinMaxRange", js.undefined)
      
      inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      inline def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
      
      inline def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
      
      inline def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
      
      inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setShowWeek(value: Boolean): Self = StObject.set(x, "showWeek", value.asInstanceOf[js.Any])
      
      inline def setShowWeekUndefined: Self = StObject.set(x, "showWeek", js.undefined)
      
      inline def setStepHour(value: Double): Self = StObject.set(x, "stepHour", value.asInstanceOf[js.Any])
      
      inline def setStepHourUndefined: Self = StObject.set(x, "stepHour", js.undefined)
      
      inline def setStepMillisec(value: Double): Self = StObject.set(x, "stepMillisec", value.asInstanceOf[js.Any])
      
      inline def setStepMillisecUndefined: Self = StObject.set(x, "stepMillisec", js.undefined)
      
      inline def setStepMinute(value: Double): Self = StObject.set(x, "stepMinute", value.asInstanceOf[js.Any])
      
      inline def setStepMinuteUndefined: Self = StObject.set(x, "stepMinute", js.undefined)
      
      inline def setStepSecond(value: Double): Self = StObject.set(x, "stepSecond", value.asInstanceOf[js.Any])
      
      inline def setStepSecondUndefined: Self = StObject.set(x, "stepSecond", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTimeOnly(value: Boolean): Self = StObject.set(x, "timeOnly", value.asInstanceOf[js.Any])
      
      inline def setTimeOnlyUndefined: Self = StObject.set(x, "timeOnly", js.undefined)
      
      inline def setTodayButtonClassName(value: String): Self = StObject.set(x, "todayButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonClassNameUndefined: Self = StObject.set(x, "todayButtonClassName", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTouchUI(value: Boolean): Self = StObject.set(x, "touchUI", value.asInstanceOf[js.Any])
      
      inline def setTouchUIUndefined: Self = StObject.set(x, "touchUI", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
      
      inline def setValue(value: js.Date | js.Array[js.Date] | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setView(value: date | month | year): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewDate(value: js.Date): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
      
      inline def setViewDateNull: Self = StObject.set(x, "viewDate", null)
      
      inline def setViewDateUndefined: Self = StObject.set(x, "viewDate", js.undefined)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setYearNavigator(value: Boolean): Self = StObject.set(x, "yearNavigator", value.asInstanceOf[js.Any])
      
      inline def setYearNavigatorTemplate(value: /* event */ CalendarYearNavigatorTemplateEvent => ReactNode): Self = StObject.set(x, "yearNavigatorTemplate", js.Any.fromFunction1(value))
      
      inline def setYearNavigatorTemplateUndefined: Self = StObject.set(x, "yearNavigatorTemplate", js.undefined)
      
      inline def setYearNavigatorUndefined: Self = StObject.set(x, "yearNavigator", js.undefined)
      
      inline def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
      
      inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    }
  }
  
  /**
    * Custom Select event
    * @see {@link CalendarProps.onSelect}
    */
  trait CalendarSelectEvent extends StObject {
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Selected date
      */
    var value: Nullable[js.Date | js.Array[js.Date] | String]
  }
  object CalendarSelectEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event]): CalendarSelectEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarSelectEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarSelectEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Nullable[js.Date | js.Array[js.Date] | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * Custom view change event
    * @see {@link CalendarProps.onViewDateChange}
    * @event
    */
  trait CalendarViewChangeEvent extends StObject {
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * New date
      */
    var value: js.Date
  }
  object CalendarViewChangeEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], value: js.Date): CalendarViewChangeEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarViewChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarViewChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom visible change event
    * @see {@link CalendarProps.onVisibleChange}
    * @event
    */
  trait CalendarVisibleChangeEvent extends StObject {
    
    /**
      *  Used to refocus the input field in some cases when the overlay is hidden.
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The type of visible action when the overlay is visible/hidden.
      */
    var `type`: js.UndefOr[outside | dateselect | Null] = js.undefined
    
    /**
      * Whether the overlay is opened.
      */
    var visible: Boolean
  }
  object CalendarVisibleChangeEvent {
    
    inline def apply(visible: Boolean): CalendarVisibleChangeEvent = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarVisibleChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarVisibleChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setType(value: outside | dateselect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom year navigator template event
    * @see {@link CalendarProps.yearNavigatorTemplate}
    * @extends {CalendarNavigatorTemplateEvent}
    * @event
    */
  type CalendarYearNavigatorTemplateEvent = CalendarNavigatorTemplateEvent
}
