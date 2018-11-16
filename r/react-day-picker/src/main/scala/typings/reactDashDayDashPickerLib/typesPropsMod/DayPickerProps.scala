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
  var months: js.UndefOr[
    js.Tuple12[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
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
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayClick: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
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
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseEnter: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseLeave: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onDayMouseUp: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
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
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onWeekClick: js.UndefOr[
    js.Function3[
      /* weekNumber */ scala.Double, 
      /* days */ js.Array[stdLib.Date], 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var pagedNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var renderDay: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date, 
      /* modifiers */ reactDashDayDashPickerLib.typesCommonMod.Modifiers, 
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
  var weekdaysLong: js.UndefOr[
    js.Tuple7[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var weekdaysShort: js.UndefOr[
    js.Tuple7[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

