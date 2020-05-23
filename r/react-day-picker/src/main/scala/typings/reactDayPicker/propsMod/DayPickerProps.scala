package typings.reactDayPicker.propsMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.react.mod.TouchEvent
import typings.reactDayPicker.anon.NextMonth
import typings.reactDayPicker.anon.PartialModifiers
import typings.reactDayPicker.classNamesMod.ClassNames
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.reactDayPicker.modifiersMod.Modifier
import typings.std.Date
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerProps extends js.Object {
  var canChangeMonth: js.UndefOr[Boolean] = js.undefined
  var captionElement: js.UndefOr[
    ReactElement | (ComponentClass[CaptionElementProps, ComponentState]) | SFC[CaptionElementProps]
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classNames: js.UndefOr[ClassNames] = js.undefined
  var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabledDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
  var enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var fixedWeeks: js.UndefOr[Boolean] = js.undefined
  var fromMonth: js.UndefOr[Date] = js.undefined
  var initialMonth: js.UndefOr[Date] = js.undefined
  var labels: js.UndefOr[NextMonth] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeUtils: js.UndefOr[LocaleUtils] = js.undefined
  var modifiers: js.UndefOr[PartialModifiers] = js.undefined
  var modifiersStyles: js.UndefOr[js.Object] = js.undefined
  var month: js.UndefOr[Date] = js.undefined
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var navbarElement: js.UndefOr[
    ReactElement | (ComponentClass[NavbarElementProps, ComponentState]) | SFC[NavbarElementProps]
  ] = js.undefined
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onCaptionClick: js.UndefOr[
    js.Function2[/* month */ Date, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onDayClick: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var onDayKeyDown: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ KeyboardEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseDown: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseEnter: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseLeave: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var onDayMouseUp: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var onDayTouchEnd: js.UndefOr[
    js.Function3[/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement], Unit]
  ] = js.undefined
  var onDayTouchStart: js.UndefOr[
    js.Function3[/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement], Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLDivElement], Unit]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Date, Unit]] = js.undefined
  var onTodayButtonClick: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var onWeekClick: js.UndefOr[
    js.Function3[
      /* weekNumber */ Double, 
      /* days */ js.Array[Date], 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var pagedNavigation: js.UndefOr[Boolean] = js.undefined
  var renderDay: js.UndefOr[js.Function2[/* date */ Date, /* modifiers */ DayModifiers, ReactNode]] = js.undefined
  var renderWeek: js.UndefOr[
    js.Function3[/* weekNumber */ Double, /* week */ js.Array[Date], /* month */ Date, ReactNode]
  ] = js.undefined
  var reverseMonths: js.UndefOr[Boolean] = js.undefined
  var selectedDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  var showWeekDays: js.UndefOr[Boolean] = js.undefined
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var toMonth: js.UndefOr[Date] = js.undefined
  var todayButton: js.UndefOr[String] = js.undefined
  var weekdayElement: js.UndefOr[
    ReactElement | (ComponentClass[WeekdayElementProps, ComponentState]) | SFC[WeekdayElementProps]
  ] = js.undefined
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object DayPickerProps {
  @scala.inline
  def apply(
    canChangeMonth: js.UndefOr[Boolean] = js.undefined,
    captionElement: ReactElement | (ComponentClass[CaptionElementProps, ComponentState]) | SFC[CaptionElementProps] = null,
    className: String = null,
    classNames: ClassNames = null,
    containerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = null,
    dir: String = null,
    disabledDays: Modifier | js.Array[Modifier] = null,
    enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: js.UndefOr[Double] = js.undefined,
    fixedWeeks: js.UndefOr[Boolean] = js.undefined,
    fromMonth: Date = null,
    initialMonth: Date = null,
    labels: NextMonth = null,
    locale: String = null,
    localeUtils: LocaleUtils = null,
    modifiers: PartialModifiers = null,
    modifiersStyles: js.Object = null,
    month: Date = null,
    months: js.Array[String] = null,
    navbarElement: ReactElement | (ComponentClass[NavbarElementProps, ComponentState]) | SFC[NavbarElementProps] = null,
    numberOfMonths: js.UndefOr[Double] = js.undefined,
    onBlur: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    onCaptionClick: (/* month */ Date, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDayClick: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDayKeyDown: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ KeyboardEvent[HTMLDivElement]) => Unit = null,
    onDayMouseDown: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDayMouseEnter: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDayMouseLeave: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDayMouseUp: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    onDayTouchEnd: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement]) => Unit = null,
    onDayTouchStart: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement]) => Unit = null,
    onFocus: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    onKeyDown: /* e */ KeyboardEvent[HTMLDivElement] => Unit = null,
    onMonthChange: /* month */ Date => Unit = null,
    onTodayButtonClick: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit = null,
    onWeekClick: (/* weekNumber */ Double, /* days */ js.Array[Date], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit = null,
    pagedNavigation: js.UndefOr[Boolean] = js.undefined,
    renderDay: (/* date */ Date, /* modifiers */ DayModifiers) => ReactNode = null,
    renderWeek: (/* weekNumber */ Double, /* week */ js.Array[Date], /* month */ Date) => ReactNode = null,
    reverseMonths: js.UndefOr[Boolean] = js.undefined,
    selectedDays: Modifier | js.Array[Modifier] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined,
    showWeekDays: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    toMonth: Date = null,
    todayButton: String = null,
    weekdayElement: ReactElement | (ComponentClass[WeekdayElementProps, ComponentState]) | SFC[WeekdayElementProps] = null,
    weekdaysLong: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): DayPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canChangeMonth)) __obj.updateDynamic("canChangeMonth")(canChangeMonth.get.asInstanceOf[js.Any])
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDaysClick)) __obj.updateDynamic("enableOutsideDaysClick")(enableOutsideDaysClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDayOfWeek)) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeeks)) __obj.updateDynamic("fixedWeeks")(fixedWeeks.get.asInstanceOf[js.Any])
    if (fromMonth != null) __obj.updateDynamic("fromMonth")(fromMonth.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (modifiersStyles != null) __obj.updateDynamic("modifiersStyles")(modifiersStyles.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (navbarElement != null) __obj.updateDynamic("navbarElement")(navbarElement.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfMonths)) __obj.updateDynamic("numberOfMonths")(numberOfMonths.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCaptionClick != null) __obj.updateDynamic("onCaptionClick")(js.Any.fromFunction2(onCaptionClick))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction3(onDayClick))
    if (onDayKeyDown != null) __obj.updateDynamic("onDayKeyDown")(js.Any.fromFunction3(onDayKeyDown))
    if (onDayMouseDown != null) __obj.updateDynamic("onDayMouseDown")(js.Any.fromFunction3(onDayMouseDown))
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(js.Any.fromFunction3(onDayMouseEnter))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction3(onDayMouseLeave))
    if (onDayMouseUp != null) __obj.updateDynamic("onDayMouseUp")(js.Any.fromFunction3(onDayMouseUp))
    if (onDayTouchEnd != null) __obj.updateDynamic("onDayTouchEnd")(js.Any.fromFunction3(onDayTouchEnd))
    if (onDayTouchStart != null) __obj.updateDynamic("onDayTouchStart")(js.Any.fromFunction3(onDayTouchStart))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction3(onTodayButtonClick))
    if (onWeekClick != null) __obj.updateDynamic("onWeekClick")(js.Any.fromFunction3(onWeekClick))
    if (!js.isUndefined(pagedNavigation)) __obj.updateDynamic("pagedNavigation")(pagedNavigation.get.asInstanceOf[js.Any])
    if (renderDay != null) __obj.updateDynamic("renderDay")(js.Any.fromFunction2(renderDay))
    if (renderWeek != null) __obj.updateDynamic("renderWeek")(js.Any.fromFunction3(renderWeek))
    if (!js.isUndefined(reverseMonths)) __obj.updateDynamic("reverseMonths")(reverseMonths.get.asInstanceOf[js.Any])
    if (selectedDays != null) __obj.updateDynamic("selectedDays")(selectedDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekDays)) __obj.updateDynamic("showWeekDays")(showWeekDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (toMonth != null) __obj.updateDynamic("toMonth")(toMonth.asInstanceOf[js.Any])
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton.asInstanceOf[js.Any])
    if (weekdayElement != null) __obj.updateDynamic("weekdayElement")(weekdayElement.asInstanceOf[js.Any])
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerProps]
  }
}

