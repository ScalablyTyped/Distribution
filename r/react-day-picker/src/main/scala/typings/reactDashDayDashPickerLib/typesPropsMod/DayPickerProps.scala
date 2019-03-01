package typings
package reactDashDayDashPickerLib.typesPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerProps extends js.Object {
  var canChangeMonth: js.UndefOr[scala.Boolean] = js.undefined
  var captionElement: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[stdLib.Partial[CaptionElementProps]] | (reactLib.reactMod.ReactNs.ComponentClass[CaptionElementProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[CaptionElementProps]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classNames: js.UndefOr[reactDashDayDashPickerLib.typesCommonMod.ClassNames] = js.undefined
  var containerProps: js.UndefOr[
    reactLib.reactMod.ReactNs.DetailedHTMLProps[
      reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement], 
      reactLib.HTMLDivElement
    ]
  ] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var disabledDays: js.UndefOr[
    reactDashDayDashPickerLib.typesCommonMod.Modifier | js.Array[reactDashDayDashPickerLib.typesCommonMod.Modifier]
  ] = js.undefined
  var enableOutsideDaysClick: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var fixedWeeks: js.UndefOr[scala.Boolean] = js.undefined
  var fromMonth: js.UndefOr[stdLib.Date] = js.undefined
  var initialMonth: js.UndefOr[stdLib.Date] = js.undefined
  var labels: js.UndefOr[reactDashDayDashPickerLib.Anon_NextMonth] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var localeUtils: js.UndefOr[reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils] = js.undefined
  var modifiers: js.UndefOr[stdLib.Partial[reactDashDayDashPickerLib.typesCommonMod.Modifiers]] = js.undefined
  var modifiersStyles: js.UndefOr[js.Object] = js.undefined
  var month: js.UndefOr[stdLib.Date] = js.undefined
  var months: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var navbarElement: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[stdLib.Partial[NavbarElementProps]] | (reactLib.reactMod.ReactNs.ComponentClass[NavbarElementProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[NavbarElementProps]
  ] = js.undefined
  var numberOfMonths: js.UndefOr[scala.Double] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onCaptionClick: js.UndefOr[
    js.Function2[
      /* month */ stdLib.Date, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayClick: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayKeyDown: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseDown: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseEnter: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseLeave: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseUp: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayTouchEnd: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayTouchStart: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* month */ stdLib.Date, scala.Unit]] = js.undefined
  var onTodayButtonClick: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onWeekClick: js.UndefOr[
    js.Function3[
      /* weekNumber */ scala.Double, 
      /* days */ js.Array[stdLib.Date], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var pagedNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var renderDay: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderWeek: js.UndefOr[
    js.Function3[
      /* weekNumber */ scala.Double, 
      /* week */ js.Array[stdLib.Date], 
      /* month */ stdLib.Date, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var reverseMonths: js.UndefOr[scala.Boolean] = js.undefined
  var selectedDays: js.UndefOr[
    reactDashDayDashPickerLib.typesCommonMod.Modifier | js.Array[reactDashDayDashPickerLib.typesCommonMod.Modifier]
  ] = js.undefined
  var showOutsideDays: js.UndefOr[scala.Boolean] = js.undefined
  var showWeekDays: js.UndefOr[scala.Boolean] = js.undefined
  var showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var toMonth: js.UndefOr[stdLib.Date] = js.undefined
  var todayButton: js.UndefOr[java.lang.String] = js.undefined
  var weekdayElement: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[stdLib.Partial[WeekdayElementProps]] | (reactLib.reactMod.ReactNs.ComponentClass[WeekdayElementProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[WeekdayElementProps]
  ] = js.undefined
  var weekdaysLong: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DayPickerProps {
  @scala.inline
  def apply(
    canChangeMonth: js.UndefOr[scala.Boolean] = js.undefined,
    captionElement: reactLib.reactMod.ReactNs.ReactElement[stdLib.Partial[CaptionElementProps]] | (reactLib.reactMod.ReactNs.ComponentClass[CaptionElementProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[CaptionElementProps] = null,
    className: java.lang.String = null,
    classNames: reactDashDayDashPickerLib.typesCommonMod.ClassNames = null,
    containerProps: reactLib.reactMod.ReactNs.DetailedHTMLProps[
      reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement], 
      reactLib.HTMLDivElement
    ] = null,
    dir: java.lang.String = null,
    disabledDays: reactDashDayDashPickerLib.typesCommonMod.Modifier | js.Array[reactDashDayDashPickerLib.typesCommonMod.Modifier] = null,
    enableOutsideDaysClick: js.UndefOr[scala.Boolean] = js.undefined,
    firstDayOfWeek: scala.Int | scala.Double = null,
    fixedWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    fromMonth: stdLib.Date = null,
    initialMonth: stdLib.Date = null,
    labels: reactDashDayDashPickerLib.Anon_NextMonth = null,
    locale: java.lang.String = null,
    localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils = null,
    modifiers: stdLib.Partial[reactDashDayDashPickerLib.typesCommonMod.Modifiers] = null,
    modifiersStyles: js.Object = null,
    month: stdLib.Date = null,
    months: js.Array[java.lang.String] = null,
    navbarElement: reactLib.reactMod.ReactNs.ReactElement[stdLib.Partial[NavbarElementProps]] | (reactLib.reactMod.ReactNs.ComponentClass[NavbarElementProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[NavbarElementProps] = null,
    numberOfMonths: scala.Int | scala.Double = null,
    onBlur: js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit] = null,
    onCaptionClick: js.Function2[
      /* month */ stdLib.Date, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDayClick: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDayKeyDown: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onDayMouseDown: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDayMouseEnter: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDayMouseLeave: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDayMouseUp: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDayTouchEnd: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onDayTouchStart: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onFocus: js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement], scala.Unit] = null,
    onKeyDown: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onMonthChange: js.Function1[/* month */ stdLib.Date, scala.Unit] = null,
    onTodayButtonClick: js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onWeekClick: js.Function3[
      /* weekNumber */ scala.Double, 
      /* days */ js.Array[stdLib.Date], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    pagedNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    renderDay: js.Function2[
      /* date */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderWeek: js.Function3[
      /* weekNumber */ scala.Double, 
      /* week */ js.Array[stdLib.Date], 
      /* month */ stdLib.Date, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    reverseMonths: js.UndefOr[scala.Boolean] = js.undefined,
    selectedDays: reactDashDayDashPickerLib.typesCommonMod.Modifier | js.Array[reactDashDayDashPickerLib.typesCommonMod.Modifier] = null,
    showOutsideDays: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekDays: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    toMonth: stdLib.Date = null,
    todayButton: java.lang.String = null,
    weekdayElement: reactLib.reactMod.ReactNs.ReactElement[stdLib.Partial[WeekdayElementProps]] | (reactLib.reactMod.ReactNs.ComponentClass[WeekdayElementProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[WeekdayElementProps] = null,
    weekdaysLong: js.Array[java.lang.String] = null,
    weekdaysShort: js.Array[java.lang.String] = null
  ): DayPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canChangeMonth)) __obj.updateDynamic("canChangeMonth")(canChangeMonth)
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDaysClick)) __obj.updateDynamic("enableOutsideDaysClick")(enableOutsideDaysClick)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeeks)) __obj.updateDynamic("fixedWeeks")(fixedWeeks)
    if (fromMonth != null) __obj.updateDynamic("fromMonth")(fromMonth)
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (modifiersStyles != null) __obj.updateDynamic("modifiersStyles")(modifiersStyles)
    if (month != null) __obj.updateDynamic("month")(month)
    if (months != null) __obj.updateDynamic("months")(months)
    if (navbarElement != null) __obj.updateDynamic("navbarElement")(navbarElement.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCaptionClick != null) __obj.updateDynamic("onCaptionClick")(onCaptionClick)
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(onDayClick)
    if (onDayKeyDown != null) __obj.updateDynamic("onDayKeyDown")(onDayKeyDown)
    if (onDayMouseDown != null) __obj.updateDynamic("onDayMouseDown")(onDayMouseDown)
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(onDayMouseEnter)
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(onDayMouseLeave)
    if (onDayMouseUp != null) __obj.updateDynamic("onDayMouseUp")(onDayMouseUp)
    if (onDayTouchEnd != null) __obj.updateDynamic("onDayTouchEnd")(onDayTouchEnd)
    if (onDayTouchStart != null) __obj.updateDynamic("onDayTouchStart")(onDayTouchStart)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(onMonthChange)
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(onTodayButtonClick)
    if (onWeekClick != null) __obj.updateDynamic("onWeekClick")(onWeekClick)
    if (!js.isUndefined(pagedNavigation)) __obj.updateDynamic("pagedNavigation")(pagedNavigation)
    if (renderDay != null) __obj.updateDynamic("renderDay")(renderDay)
    if (renderWeek != null) __obj.updateDynamic("renderWeek")(renderWeek)
    if (!js.isUndefined(reverseMonths)) __obj.updateDynamic("reverseMonths")(reverseMonths)
    if (selectedDays != null) __obj.updateDynamic("selectedDays")(selectedDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays)
    if (!js.isUndefined(showWeekDays)) __obj.updateDynamic("showWeekDays")(showWeekDays)
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers)
    if (toMonth != null) __obj.updateDynamic("toMonth")(toMonth)
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton)
    if (weekdayElement != null) __obj.updateDynamic("weekdayElement")(weekdayElement.asInstanceOf[js.Any])
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong)
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort)
    __obj.asInstanceOf[DayPickerProps]
  }
}

