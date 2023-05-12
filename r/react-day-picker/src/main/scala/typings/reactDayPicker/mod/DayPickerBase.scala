package typings.reactDayPicker.mod

import typings.dateFns.mod.Locale
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.reactDayPicker.anon.PartialFormatters
import typings.reactDayPicker.anon.PartialLabels
import typings.reactDayPicker.reactDayPickerInts.`0`
import typings.reactDayPicker.reactDayPickerInts.`1`
import typings.reactDayPicker.reactDayPickerInts.`2`
import typings.reactDayPicker.reactDayPickerInts.`3`
import typings.reactDayPicker.reactDayPickerInts.`4`
import typings.reactDayPicker.reactDayPickerInts.`5`
import typings.reactDayPicker.reactDayPickerInts.`6`
import typings.reactDayPicker.reactDayPickerInts.`7`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base props for the {@link DayPicker} component and the {@link DayPickerContext}.
  */
trait DayPickerBase extends StObject {
  
  /**
    * Use ISO week dates instead of the locale setting. See also
    * https://en.wikipedia.org/wiki/ISO_week_date.
    *
    * Setting this prop will ignore {@link weekStartsOn} and {@link firstWeekContainsDate}.
    */
  var ISOWeek: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change the layout of the caption:
    *
    * - `buttons`: display prev/right buttons
    * - `dropdown`: display drop-downs to change the month and the year
    *
    * **Note:** the `dropdown` layout is available only when `fromDate`,
    * `fromMonth` or`fromYear` and `toDate`, `toMonth` or `toYear` are set.
    *
    * @defaultValue buttons
    */
  var captionLayout: js.UndefOr[CaptionLayout] = js.undefined
  
  /**
    * The CSS class to add to the container element. To change the name of the
    * class instead, use `classNames.root`.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Change the class names of the HTML elements.
    *
    * Use this prop when you need to change the default class names — for example
    * when using CSS modules.
    */
  var classNames: js.UndefOr[ClassNames] = js.undefined
  
  /**
    * Map of components used to create the layout. Look at the [components
    * source](https://github.com/gpbl/react-day-picker/tree/master/packages/react-day-picker/src/components)
    * to understand how internal components are built and provide your custom components.
    */
  var components: js.UndefOr[CustomComponents] = js.undefined
  
  /**
    * The initial month to show in the calendar. Use this prop to let DayPicker
    * control the current month. If you need to set the month programmatically,
    * use {@link month]] and [[onMonthChange}.
    *
    * @defaultValue The current month
    */
  var defaultMonth: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The text direction of the calendar. Use `ltr` for left-to-right (default)
    * or `rtl` for right-to-left.
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /**
    * Disable the navigation between months.
    *
    * @defaultValue false
    */
  var disableNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Apply the `disabled` modifier to the matching days.
    */
  var disabled: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
  
  /**
    * The day of January, which is always in the first week of the year. See also
    * https://date-fns.org/docs/getWeek and
    * https://en.wikipedia.org/wiki/Week#Numbering
    */
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  
  /**
    * Display six weeks per months, regardless the month’s number of weeks.
    * To use this prop, {@link showOutsideDays} must be set.
    *
    * @defaultValue false
    */
  var fixedWeeks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Content to add to the table footer element.
    */
  var footer: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * A map of formatters. Use the formatters to override the default formatting
    * functions.
    */
  var formatters: js.UndefOr[PartialFormatters] = js.undefined
  
  /**
    * The earliest day to start the month navigation.
    */
  var fromDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The earliest month to start the month navigation.
    */
  var fromMonth: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The earliest year to start the month navigation.
    */
  var fromYear: js.UndefOr[Double] = js.undefined
  
  /**
    * Apply the `hidden` modifier to the matching days. Will hide them from the
    * calendar.
    */
  var hidden: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
  
  /**
    * Hide the month’s head displaying the weekday names.
    *
    * @defaultValue false
    */
  var hideHead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A unique id to replace the random generated id – used by DayPicker for
    * accessibility.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * When a selection mode is set, DayPicker will focus the first selected day
    * (if set) or the today's date (if not disabled).
    *
    * Use this prop when you need to focus DayPicker after a user actions, for
    * improved accessibility.
    */
  var initialFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Labels creators to override the defaults. Use this prop to customize the
    * ARIA labels attributes.
    */
  var labels: js.UndefOr[PartialLabels] = js.undefined
  
  /**
    * The date-fns locale object used to localize dates.
    *
    * @defaultValue en-US
    */
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * Add modifiers to the matching days.
    */
  var modifiers: js.UndefOr[DayModifiers] = js.undefined
  
  /**
    * Change the class name for the day matching the {@link modifiers}.
    */
  var modifiersClassNames: js.UndefOr[ModifiersClassNames] = js.undefined
  
  /**
    * Change the inline style for the day matching the {@link modifiers}.
    */
  var modifiersStyles: js.UndefOr[ModifiersStyles] = js.undefined
  
  /**
    * The month displayed in the calendar.
    *
    * As opposed to {@link DayPickerBase.defaultMonth}, use this prop with
    * {@link DayPickerBase.onMonthChange} to change the month programmatically.
    */
  var month: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of displayed months.
    *
    * @defaultValue 1
    */
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  
  var onDayBlur: js.UndefOr[DayFocusEventHandler] = js.undefined
  
  var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
  
  var onDayFocus: js.UndefOr[DayFocusEventHandler] = js.undefined
  
  var onDayKeyDown: js.UndefOr[DayKeyboardEventHandler] = js.undefined
  
  var onDayKeyPress: js.UndefOr[DayKeyboardEventHandler] = js.undefined
  
  var onDayKeyUp: js.UndefOr[DayKeyboardEventHandler] = js.undefined
  
  var onDayMouseEnter: js.UndefOr[DayMouseEventHandler] = js.undefined
  
  var onDayMouseLeave: js.UndefOr[DayMouseEventHandler] = js.undefined
  
  var onDayPointerEnter: js.UndefOr[DayPointerEventHandler] = js.undefined
  
  var onDayPointerLeave: js.UndefOr[DayPointerEventHandler] = js.undefined
  
  var onDayTouchCancel: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onDayTouchEnd: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onDayTouchMove: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onDayTouchStart: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  /**
    * Event fired when the user navigates between months.
    */
  var onMonthChange: js.UndefOr[MonthChangeEventHandler] = js.undefined
  
  var onNextClick: js.UndefOr[MonthChangeEventHandler] = js.undefined
  
  var onPrevClick: js.UndefOr[MonthChangeEventHandler] = js.undefined
  
  var onWeekNumberClick: js.UndefOr[WeekNumberClickEventHandler] = js.undefined
  
  /**
    * Paginate the month navigation displaying the {@link numberOfMonths} at
    * time.
    *
    * @defaultValue false
    */
  var pagedNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render the months in reversed order (when {@link numberOfMonths} is greater
    * than `1`) to display the most recent month first.
    *
    * @defaultValue false
    */
  var reverseMonths: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Apply the `selected` modifier to the matching days.
    */
  var selected: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
  
  /**
    * Show the outside days.  An outside day is a day falling in the next or the
    * previous month.
    *
    * @defaultValue false
    */
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show the week numbers column. Weeks are numbered according to the local
    * week index. To use ISO week numbering, use the {@link ISOWeek} prop.
    *
    * @defaultValue false
    */
  var showWeekNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Style to apply to the container element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Change the inline styles of the HTML elements.
    */
  var styles: js.UndefOr[Styles] = js.undefined
  
  /**
    * The latest day to end the month navigation.
    */
  var toDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest month to end the month navigation.
    */
  var toMonth: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest year to end the month navigation.
    */
  var toYear: js.UndefOr[Double] = js.undefined
  
  /**
    * The today’s date. Default is the current date. This Date will get the
    * `today` modifier to style the day.
    */
  var today: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The index of the first day of the week (0 - Sunday). Overrides the locale's one.
    */
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}
object DayPickerBase {
  
  inline def apply(): DayPickerBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayPickerBase] (val x: Self) extends AnyVal {
    
    inline def setCaptionLayout(value: CaptionLayout): Self = StObject.set(x, "captionLayout", value.asInstanceOf[js.Any])
    
    inline def setCaptionLayoutUndefined: Self = StObject.set(x, "captionLayout", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setComponents(value: CustomComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDefaultMonth(value: js.Date): Self = StObject.set(x, "defaultMonth", value.asInstanceOf[js.Any])
    
    inline def setDefaultMonthUndefined: Self = StObject.set(x, "defaultMonth", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisableNavigation(value: Boolean): Self = StObject.set(x, "disableNavigation", value.asInstanceOf[js.Any])
    
    inline def setDisableNavigationUndefined: Self = StObject.set(x, "disableNavigation", js.undefined)
    
    inline def setDisabled(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisabledVarargs(value: (js.Date | Matcher)*): Self = StObject.set(x, "disabled", js.Array(value*))
    
    inline def setFirstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
    
    inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
    
    inline def setFixedWeeks(value: Boolean): Self = StObject.set(x, "fixedWeeks", value.asInstanceOf[js.Any])
    
    inline def setFixedWeeksUndefined: Self = StObject.set(x, "fixedWeeks", js.undefined)
    
    inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormatters(value: PartialFormatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setFromMonth(value: js.Date): Self = StObject.set(x, "fromMonth", value.asInstanceOf[js.Any])
    
    inline def setFromMonthUndefined: Self = StObject.set(x, "fromMonth", js.undefined)
    
    inline def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
    
    inline def setFromYearUndefined: Self = StObject.set(x, "fromYear", js.undefined)
    
    inline def setHidden(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "hidden", js.Any.fromFunction1(value))
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHiddenVarargs(value: (js.Date | Matcher)*): Self = StObject.set(x, "hidden", js.Array(value*))
    
    inline def setHideHead(value: Boolean): Self = StObject.set(x, "hideHead", value.asInstanceOf[js.Any])
    
    inline def setHideHeadUndefined: Self = StObject.set(x, "hideHead", js.undefined)
    
    inline def setISOWeek(value: Boolean): Self = StObject.set(x, "ISOWeek", value.asInstanceOf[js.Any])
    
    inline def setISOWeekUndefined: Self = StObject.set(x, "ISOWeek", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialFocus(value: Boolean): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
    
    inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
    
    inline def setLabels(value: PartialLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModifiers(value: DayModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNamesUndefined: Self = StObject.set(x, "modifiersClassNames", js.undefined)
    
    inline def setModifiersStyles(value: ModifiersStyles): Self = StObject.set(x, "modifiersStyles", value.asInstanceOf[js.Any])
    
    inline def setModifiersStylesUndefined: Self = StObject.set(x, "modifiersStyles", js.undefined)
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setMonth(value: js.Date): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    inline def setOnDayBlur(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ (FocusEvent[Element, Element]) | KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayBlur", js.Any.fromFunction3(value))
    
    inline def setOnDayBlurUndefined: Self = StObject.set(x, "onDayBlur", js.undefined)
    
    inline def setOnDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setOnDayFocus(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ (FocusEvent[Element, Element]) | KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction3(value))
    
    inline def setOnDayFocusUndefined: Self = StObject.set(x, "onDayFocus", js.undefined)
    
    inline def setOnDayKeyDown(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayKeyDown", js.Any.fromFunction3(value))
    
    inline def setOnDayKeyDownUndefined: Self = StObject.set(x, "onDayKeyDown", js.undefined)
    
    inline def setOnDayKeyPress(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayKeyPress", js.Any.fromFunction3(value))
    
    inline def setOnDayKeyPressUndefined: Self = StObject.set(x, "onDayKeyPress", js.undefined)
    
    inline def setOnDayKeyUp(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayKeyUp", js.Any.fromFunction3(value))
    
    inline def setOnDayKeyUpUndefined: Self = StObject.set(x, "onDayKeyUp", js.undefined)
    
    inline def setOnDayMouseEnter(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction3(value))
    
    inline def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
    
    inline def setOnDayMouseLeave(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction3(value))
    
    inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    inline def setOnDayPointerEnter(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ PointerEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayPointerEnter", js.Any.fromFunction3(value))
    
    inline def setOnDayPointerEnterUndefined: Self = StObject.set(x, "onDayPointerEnter", js.undefined)
    
    inline def setOnDayPointerLeave(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ PointerEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayPointerLeave", js.Any.fromFunction3(value))
    
    inline def setOnDayPointerLeaveUndefined: Self = StObject.set(x, "onDayPointerLeave", js.undefined)
    
    inline def setOnDayTouchCancel(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchCancel", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchCancelUndefined: Self = StObject.set(x, "onDayTouchCancel", js.undefined)
    
    inline def setOnDayTouchEnd(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchEnd", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchEndUndefined: Self = StObject.set(x, "onDayTouchEnd", js.undefined)
    
    inline def setOnDayTouchMove(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchMove", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchMoveUndefined: Self = StObject.set(x, "onDayTouchMove", js.undefined)
    
    inline def setOnDayTouchStart(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchStart", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchStartUndefined: Self = StObject.set(x, "onDayTouchStart", js.undefined)
    
    inline def setOnMonthChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnNextClick(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
    
    inline def setOnNextClickUndefined: Self = StObject.set(x, "onNextClick", js.undefined)
    
    inline def setOnPrevClick(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onPrevClick", js.Any.fromFunction1(value))
    
    inline def setOnPrevClickUndefined: Self = StObject.set(x, "onPrevClick", js.undefined)
    
    inline def setOnWeekNumberClick(
      value: (/* weekNumber */ Double, /* dates */ js.Array[js.Date], /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onWeekNumberClick", js.Any.fromFunction3(value))
    
    inline def setOnWeekNumberClickUndefined: Self = StObject.set(x, "onWeekNumberClick", js.undefined)
    
    inline def setPagedNavigation(value: Boolean): Self = StObject.set(x, "pagedNavigation", value.asInstanceOf[js.Any])
    
    inline def setPagedNavigationUndefined: Self = StObject.set(x, "pagedNavigation", js.undefined)
    
    inline def setReverseMonths(value: Boolean): Self = StObject.set(x, "reverseMonths", value.asInstanceOf[js.Any])
    
    inline def setReverseMonthsUndefined: Self = StObject.set(x, "reverseMonths", js.undefined)
    
    inline def setSelected(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "selected", js.Any.fromFunction1(value))
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: (js.Date | Matcher)*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
    
    inline def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    
    inline def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "showWeekNumber", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumberUndefined: Self = StObject.set(x, "showWeekNumber", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    
    inline def setToMonth(value: js.Date): Self = StObject.set(x, "toMonth", value.asInstanceOf[js.Any])
    
    inline def setToMonthUndefined: Self = StObject.set(x, "toMonth", js.undefined)
    
    inline def setToYear(value: Double): Self = StObject.set(x, "toYear", value.asInstanceOf[js.Any])
    
    inline def setToYearUndefined: Self = StObject.set(x, "toYear", js.undefined)
    
    inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
