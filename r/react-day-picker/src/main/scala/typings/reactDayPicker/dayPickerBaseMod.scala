package typings.reactDayPicker

import typings.dateFns.mod.Locale
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.anon.PartialFormatters
import typings.reactDayPicker.anon.PartialLabels
import typings.reactDayPicker.captionCaptionMod.CaptionLayout
import typings.reactDayPicker.captionCaptionMod.CaptionProps
import typings.reactDayPicker.captionLabelCaptionLabelMod.CaptionLabelProps
import typings.reactDayPicker.dayContentDayContentMod.DayContentProps
import typings.reactDayPicker.dayDayMod.DayProps
import typings.reactDayPicker.dropdownDropdownMod.DropdownProps
import typings.reactDayPicker.eventHandlersMod.DayClickEventHandler
import typings.reactDayPicker.eventHandlersMod.DayFocusEventHandler
import typings.reactDayPicker.eventHandlersMod.DayKeyboardEventHandler
import typings.reactDayPicker.eventHandlersMod.DayMouseEventHandler
import typings.reactDayPicker.eventHandlersMod.DayTouchEventHandler
import typings.reactDayPicker.eventHandlersMod.MonthChangeEventHandler
import typings.reactDayPicker.eventHandlersMod.WeekNumberClickEventHandler
import typings.reactDayPicker.matchersMod.Matcher
import typings.reactDayPicker.reactDayPickerNumbers.`0`
import typings.reactDayPicker.reactDayPickerNumbers.`1`
import typings.reactDayPicker.reactDayPickerNumbers.`2`
import typings.reactDayPicker.reactDayPickerNumbers.`3`
import typings.reactDayPicker.reactDayPickerNumbers.`4`
import typings.reactDayPicker.reactDayPickerNumbers.`5`
import typings.reactDayPicker.reactDayPickerNumbers.`6`
import typings.reactDayPicker.rowRowMod.RowProps
import typings.reactDayPicker.stylesMod.ClassNames
import typings.reactDayPicker.stylesMod.StyledComponent
import typings.reactDayPicker.stylesMod.Styles
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.reactDayPicker.typesModifiersMod.DayModifiers
import typings.reactDayPicker.typesModifiersMod.ModifiersClassNames
import typings.reactDayPicker.typesModifiersMod.ModifiersStyles
import typings.reactDayPicker.weekNumberWeekNumberMod.WeekNumberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerBaseMod {
  
  trait CustomComponents extends StObject {
    
    /** The component for the caption element. */
    var Caption: js.UndefOr[js.Function1[/* props */ CaptionProps, Element | Null]] = js.undefined
    
    /** The component for the caption element. */
    var CaptionLabel: js.UndefOr[js.Function1[/* props */ CaptionLabelProps, Element | Null]] = js.undefined
    
    /**
      * The component for the day element.
      *
      * Each `Day` in DayPicker should render one of the following, according to
      * the return value of {@link useDayRender}.
      *
      * - an empty `React.Fragment`, to render if `isHidden` is true
      * - a `button` element, when the day is interactive, e.g. is selectable
      * - a `div` or a `span` element, when the day is not interactive
      *
      */
    var Day: js.UndefOr[js.Function1[/* props */ DayProps, Element | Null]] = js.undefined
    
    /** The component for the content of the day element. */
    var DayContent: js.UndefOr[js.Function1[/* props */ DayContentProps, Element | Null]] = js.undefined
    
    /** The component for the drop-down elements. */
    var Dropdown: js.UndefOr[js.Function1[/* props */ DropdownProps, Element | Null]] = js.undefined
    
    /** The component for the table footer. */
    var Footer: js.UndefOr[js.Function0[Element | Null]] = js.undefined
    
    /** The component for the table’s head. */
    var Head: js.UndefOr[js.Function0[Element | Null]] = js.undefined
    
    /** The component for the table’s head row. */
    var HeadRow: js.UndefOr[js.Function0[Element | Null]] = js.undefined
    
    /** The component for the small icon in the drop-downs. */
    var IconDropdown: js.UndefOr[js.Function1[/* props */ StyledComponent, Element | Null]] = js.undefined
    
    /** The arrow left icon (used for the Navigation buttons). */
    var IconLeft: js.UndefOr[js.Function1[/* props */ StyledComponent, Element | Null]] = js.undefined
    
    /** The arrow right icon (used for the Navigation buttons). */
    var IconRight: js.UndefOr[js.Function1[/* props */ StyledComponent, Element | Null]] = js.undefined
    
    /** The component for the table rows. */
    var Row: js.UndefOr[js.Function1[/* props */ RowProps, Element | Null]] = js.undefined
    
    /** The component for the week number in the table rows. */
    var WeekNumber: js.UndefOr[js.Function1[/* props */ WeekNumberProps, Element | Null]] = js.undefined
  }
  object CustomComponents {
    
    inline def apply(): CustomComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomComponents]
    }
    
    extension [Self <: CustomComponents](x: Self) {
      
      inline def setCaption(value: /* props */ CaptionProps => Element | Null): Self = StObject.set(x, "Caption", js.Any.fromFunction1(value))
      
      inline def setCaptionLabel(value: /* props */ CaptionLabelProps => Element | Null): Self = StObject.set(x, "CaptionLabel", js.Any.fromFunction1(value))
      
      inline def setCaptionLabelUndefined: Self = StObject.set(x, "CaptionLabel", js.undefined)
      
      inline def setCaptionUndefined: Self = StObject.set(x, "Caption", js.undefined)
      
      inline def setDay(value: /* props */ DayProps => Element | Null): Self = StObject.set(x, "Day", js.Any.fromFunction1(value))
      
      inline def setDayContent(value: /* props */ DayContentProps => Element | Null): Self = StObject.set(x, "DayContent", js.Any.fromFunction1(value))
      
      inline def setDayContentUndefined: Self = StObject.set(x, "DayContent", js.undefined)
      
      inline def setDayUndefined: Self = StObject.set(x, "Day", js.undefined)
      
      inline def setDropdown(value: /* props */ DropdownProps => Element | Null): Self = StObject.set(x, "Dropdown", js.Any.fromFunction1(value))
      
      inline def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
      
      inline def setFooter(value: () => Element | Null): Self = StObject.set(x, "Footer", js.Any.fromFunction0(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
      
      inline def setHead(value: () => Element | Null): Self = StObject.set(x, "Head", js.Any.fromFunction0(value))
      
      inline def setHeadRow(value: () => Element | Null): Self = StObject.set(x, "HeadRow", js.Any.fromFunction0(value))
      
      inline def setHeadRowUndefined: Self = StObject.set(x, "HeadRow", js.undefined)
      
      inline def setHeadUndefined: Self = StObject.set(x, "Head", js.undefined)
      
      inline def setIconDropdown(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconDropdown", js.Any.fromFunction1(value))
      
      inline def setIconDropdownUndefined: Self = StObject.set(x, "IconDropdown", js.undefined)
      
      inline def setIconLeft(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconLeft", js.Any.fromFunction1(value))
      
      inline def setIconLeftUndefined: Self = StObject.set(x, "IconLeft", js.undefined)
      
      inline def setIconRight(value: /* props */ StyledComponent => Element | Null): Self = StObject.set(x, "IconRight", js.Any.fromFunction1(value))
      
      inline def setIconRightUndefined: Self = StObject.set(x, "IconRight", js.undefined)
      
      inline def setRow(value: /* props */ RowProps => Element | Null): Self = StObject.set(x, "Row", js.Any.fromFunction1(value))
      
      inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
      
      inline def setWeekNumber(value: /* props */ WeekNumberProps => Element | Null): Self = StObject.set(x, "WeekNumber", js.Any.fromFunction1(value))
      
      inline def setWeekNumberUndefined: Self = StObject.set(x, "WeekNumber", js.undefined)
    }
  }
  
  trait DayPickerBase extends StObject {
    
    /**
      * Change the layout of the caption:
      *
      * - `buttons` (default): display prev/right buttons
      * - `dropdown`: display drop-downs to change the month and the year
      *
      * **Note:** the `dropdown` layout is available only when `fromDate`,
      * `fromMonth` or`fromYear` and `toDate`, `toMonth` or `toYear` are set.
      */
    var captionLayout: js.UndefOr[CaptionLayout] = js.undefined
    
    /** The CSS class to add to the container element. To change the name of the class instead, use `classNames.root`. */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Change the class names of the HTML elements.
      *
      * Use this prop when you need to change the default class names — for example
      * when using CSS modules.
      */
    var classNames: js.UndefOr[ClassNames] = js.undefined
    
    /**
      * Map of components used to create the layout. Look at the [components source](https://github.com/gpbl/react-day-picker/tree/master/packages/react-day-picker/src/components) to understand how internal components are built.
      */
    var components: js.UndefOr[CustomComponents] = js.undefined
    
    /**
      * The initial month to show in the calendar. Default is the current month.
      *
      * Use this prop to let DayPicker control the current month. If you need to set the month programmatically, use {@link month]] and [[onMonthChange}.
      */
    var defaultMonth: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The text direction of the calendar. Use `ltr` for left-to-right (default)
      * or `rtl` for right-to-left.
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * Disable the navigation between months.
      */
    var disableNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Apply the `disabled` modifier to the matching days.
      */
    var disabled: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
    
    /**
      * Display six weeks per months, regardless the month’s number of weeks.
      * To use this prop, {@link showOutsideDays} must be set. Default to `false`.
      */
    var fixedWeeks: js.UndefOr[Boolean] = js.undefined
    
    /** Content to add to the `tfoot` element. */
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
      */
    var hideHead: js.UndefOr[Boolean] = js.undefined
    
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
    
    /** The date-fns locale object used to localize dates. Defaults to* `en-US`. */
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
      * As opposed to {@link DayPickerBase.defaultMonth}, use this prop with {@link DayPickerBase.onMonthChange} to
      * change the month programmatically.
      */
    var month: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The number of displayed months. Defaults to `1`.
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
      * Paginate the month navigation displaying the {@link numberOfMonths} at time.
      */
    var pagedNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Render the months in reversed order (when {@link numberOfMonths} is greater
      * than `1`) to display the most recent month first.
      */
    var reverseMonths: js.UndefOr[Boolean] = js.undefined
    
    /** Apply the `selected` modifier to the matching days. */
    var selected: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
    
    /**
      * Show the outside days.  An outside day is a day falling in the next or the
      * previous month. Default is `false`.
      */
    var showOutsideDays: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the week numbers column. Default to `false`.
      */
    var showWeekNumber: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style to apply to the container element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Change the inline styles for each UIElement.
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
    
    extension [Self <: DayPickerBase](x: Self) {
      
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
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ (FocusEvent[typings.std.Element, typings.std.Element]) | KeyboardEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayBlur", js.Any.fromFunction3(value))
      
      inline def setOnDayBlurUndefined: Self = StObject.set(x, "onDayBlur", js.undefined)
      
      inline def setOnDayClick(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setOnDayFocus(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ (FocusEvent[typings.std.Element, typings.std.Element]) | KeyboardEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction3(value))
      
      inline def setOnDayFocusUndefined: Self = StObject.set(x, "onDayFocus", js.undefined)
      
      inline def setOnDayKeyDown(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayKeyDown", js.Any.fromFunction3(value))
      
      inline def setOnDayKeyDownUndefined: Self = StObject.set(x, "onDayKeyDown", js.undefined)
      
      inline def setOnDayKeyPress(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayKeyPress", js.Any.fromFunction3(value))
      
      inline def setOnDayKeyPressUndefined: Self = StObject.set(x, "onDayKeyPress", js.undefined)
      
      inline def setOnDayKeyUp(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayKeyUp", js.Any.fromFunction3(value))
      
      inline def setOnDayKeyUpUndefined: Self = StObject.set(x, "onDayKeyUp", js.undefined)
      
      inline def setOnDayMouseEnter(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction3(value))
      
      inline def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
      
      inline def setOnDayMouseLeave(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction3(value))
      
      inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
      
      inline def setOnDayTouchCancel(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayTouchCancel", js.Any.fromFunction3(value))
      
      inline def setOnDayTouchCancelUndefined: Self = StObject.set(x, "onDayTouchCancel", js.undefined)
      
      inline def setOnDayTouchEnd(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayTouchEnd", js.Any.fromFunction3(value))
      
      inline def setOnDayTouchEndUndefined: Self = StObject.set(x, "onDayTouchEnd", js.undefined)
      
      inline def setOnDayTouchMove(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayTouchMove", js.Any.fromFunction3(value))
      
      inline def setOnDayTouchMoveUndefined: Self = StObject.set(x, "onDayTouchMove", js.undefined)
      
      inline def setOnDayTouchStart(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[typings.std.Element]) => Unit
      ): Self = StObject.set(x, "onDayTouchStart", js.Any.fromFunction3(value))
      
      inline def setOnDayTouchStartUndefined: Self = StObject.set(x, "onDayTouchStart", js.undefined)
      
      inline def setOnMonthChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnNextClick(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
      
      inline def setOnNextClickUndefined: Self = StObject.set(x, "onNextClick", js.undefined)
      
      inline def setOnPrevClick(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onPrevClick", js.Any.fromFunction1(value))
      
      inline def setOnPrevClickUndefined: Self = StObject.set(x, "onPrevClick", js.undefined)
      
      inline def setOnWeekNumberClick(
        value: (/* weekNumber */ Double, /* dates */ js.Array[js.Date], /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.reactDayPickerStrings.single
    - typings.reactDayPicker.reactDayPickerStrings.multiple
    - typings.reactDayPicker.reactDayPickerStrings.range
    - typings.reactDayPicker.reactDayPickerStrings.default
  */
  trait DaySelectionMode extends StObject
  object DaySelectionMode {
    
    inline def default: typings.reactDayPicker.reactDayPickerStrings.default = "default".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.default]
    
    inline def multiple: typings.reactDayPicker.reactDayPickerStrings.multiple = "multiple".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.multiple]
    
    inline def range: typings.reactDayPicker.reactDayPickerStrings.range = "range".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.range]
    
    inline def single: typings.reactDayPicker.reactDayPickerStrings.single = "single".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.single]
  }
}
