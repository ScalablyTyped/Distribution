package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactDates.mod.CalendarInfoPositionShape
import typings.reactDates.mod.DayPickerPhrases
import typings.reactDates.mod.NavPositionShape
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarInfoPosition extends StObject {
  
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.undefined
  
  // navigation props
  var dayPickerNavigationInlineStyles: js.UndefOr[(Record[String, js.Any]) | Null] = js.undefined
  
  var disableNext: js.UndefOr[Boolean] = js.undefined
  
  var disablePrev: js.UndefOr[Boolean] = js.undefined
  
  var getFirstFocusableDay: js.UndefOr[(js.Function1[/* month */ Moment, Moment]) | Null] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined
  
  var initialVisibleMonth: js.UndefOr[js.Function0[Moment]] = js.undefined
  
  // accessibility props
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var navNext: js.UndefOr[ReactNode] = js.undefined
  
  var navPosition: js.UndefOr[NavPositionShape] = js.undefined
  
  var navPrev: js.UndefOr[ReactNode] = js.undefined
  
  var noBorder: js.UndefOr[Boolean] = js.undefined
  
  var noNavButtons: js.UndefOr[Boolean] = js.undefined
  
  var noNavNextButton: js.UndefOr[Boolean] = js.undefined
  
  var noNavPrevButton: js.UndefOr[Boolean] = js.undefined
  
  // calendar presentation props
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onMonthChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.undefined
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.undefined
  
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.undefined
  
  var onShiftTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTab: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
  
  var onYearChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.undefined
  
  var phrases: js.UndefOr[DayPickerPhrases] = js.undefined
  
  var renderCalendarInfo: js.UndefOr[js.Function0[ReactNode] | Null] = js.undefined
  
  var renderKeyboardShortcutsButton: js.UndefOr[js.Function1[/* props */ OnClick, ReactNode]] = js.undefined
  
  var renderKeyboardShortcutsPanel: js.UndefOr[js.Function1[/* props */ CloseButtonAriaLabel, ReactNode]] = js.undefined
  
  var renderNavNextButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, ReactNode]) | Null] = js.undefined
  
  var renderNavPrevButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, ReactNode]) | Null] = js.undefined
  
  // month props
  var renderWeekHeaderElement: js.UndefOr[(js.Function1[/* day */ String, ReactNode]) | Null] = js.undefined
  
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  
  var verticalHeight: js.UndefOr[Double | Null] = js.undefined
  
  // internationalization
  var weekDayFormat: js.UndefOr[String] = js.undefined
  
  var withPortal: js.UndefOr[Boolean] = js.undefined
}
object CalendarInfoPosition {
  
  @scala.inline
  def apply(): CalendarInfoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarInfoPosition]
  }
  
  @scala.inline
  implicit class CalendarInfoPositionMutableBuilder[Self <: CalendarInfoPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarInfoPosition(value: CalendarInfoPositionShape): Self = StObject.set(x, "calendarInfoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarInfoPositionUndefined: Self = StObject.set(x, "calendarInfoPosition", js.undefined)
    
    @scala.inline
    def setDayPickerNavigationInlineStyles(value: Record[String, js.Any]): Self = StObject.set(x, "dayPickerNavigationInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPickerNavigationInlineStylesNull: Self = StObject.set(x, "dayPickerNavigationInlineStyles", null)
    
    @scala.inline
    def setDayPickerNavigationInlineStylesUndefined: Self = StObject.set(x, "dayPickerNavigationInlineStyles", js.undefined)
    
    @scala.inline
    def setDisableNext(value: Boolean): Self = StObject.set(x, "disableNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNextUndefined: Self = StObject.set(x, "disableNext", js.undefined)
    
    @scala.inline
    def setDisablePrev(value: Boolean): Self = StObject.set(x, "disablePrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePrevUndefined: Self = StObject.set(x, "disablePrev", js.undefined)
    
    @scala.inline
    def setGetFirstFocusableDay(value: /* month */ Moment => Moment): Self = StObject.set(x, "getFirstFocusableDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFirstFocusableDayNull: Self = StObject.set(x, "getFirstFocusableDay", null)
    
    @scala.inline
    def setGetFirstFocusableDayUndefined: Self = StObject.set(x, "getFirstFocusableDay", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHideKeyboardShortcutsPanel(value: Boolean): Self = StObject.set(x, "hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideKeyboardShortcutsPanelUndefined: Self = StObject.set(x, "hideKeyboardShortcutsPanel", js.undefined)
    
    @scala.inline
    def setInitialVisibleMonth(value: () => Moment): Self = StObject.set(x, "initialVisibleMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialVisibleMonthUndefined: Self = StObject.set(x, "initialVisibleMonth", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setNavNext(value: ReactNode): Self = StObject.set(x, "navNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavNextUndefined: Self = StObject.set(x, "navNext", js.undefined)
    
    @scala.inline
    def setNavPosition(value: NavPositionShape): Self = StObject.set(x, "navPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavPositionUndefined: Self = StObject.set(x, "navPosition", js.undefined)
    
    @scala.inline
    def setNavPrev(value: ReactNode): Self = StObject.set(x, "navPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavPrevUndefined: Self = StObject.set(x, "navPrev", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    @scala.inline
    def setNoNavButtons(value: Boolean): Self = StObject.set(x, "noNavButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNavButtonsUndefined: Self = StObject.set(x, "noNavButtons", js.undefined)
    
    @scala.inline
    def setNoNavNextButton(value: Boolean): Self = StObject.set(x, "noNavNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNavNextButtonUndefined: Self = StObject.set(x, "noNavNextButton", js.undefined)
    
    @scala.inline
    def setNoNavPrevButton(value: Boolean): Self = StObject.set(x, "noNavPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNavPrevButtonUndefined: Self = StObject.set(x, "noNavPrevButton", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnBlur(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* newMonth */ Moment => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    @scala.inline
    def setOnNextMonthClick(value: /* newCurrentMonth */ Moment => Unit): Self = StObject.set(x, "onNextMonthClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNextMonthClickUndefined: Self = StObject.set(x, "onNextMonthClick", js.undefined)
    
    @scala.inline
    def setOnOutsideClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOutsideClickUndefined: Self = StObject.set(x, "onOutsideClick", js.undefined)
    
    @scala.inline
    def setOnPrevMonthClick(value: /* newCurrentMonth */ Moment => Unit): Self = StObject.set(x, "onPrevMonthClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPrevMonthClickUndefined: Self = StObject.set(x, "onPrevMonthClick", js.undefined)
    
    @scala.inline
    def setOnShiftTab(value: () => Unit): Self = StObject.set(x, "onShiftTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShiftTabUndefined: Self = StObject.set(x, "onShiftTab", js.undefined)
    
    @scala.inline
    def setOnTab(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* newMonth */ Moment => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    @scala.inline
    def setPhrases(value: DayPickerPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setRenderCalendarInfo(value: () => ReactNode): Self = StObject.set(x, "renderCalendarInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderCalendarInfoNull: Self = StObject.set(x, "renderCalendarInfo", null)
    
    @scala.inline
    def setRenderCalendarInfoUndefined: Self = StObject.set(x, "renderCalendarInfo", js.undefined)
    
    @scala.inline
    def setRenderKeyboardShortcutsButton(value: /* props */ OnClick => ReactNode): Self = StObject.set(x, "renderKeyboardShortcutsButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderKeyboardShortcutsButtonUndefined: Self = StObject.set(x, "renderKeyboardShortcutsButton", js.undefined)
    
    @scala.inline
    def setRenderKeyboardShortcutsPanel(value: /* props */ CloseButtonAriaLabel => ReactNode): Self = StObject.set(x, "renderKeyboardShortcutsPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderKeyboardShortcutsPanelUndefined: Self = StObject.set(x, "renderKeyboardShortcutsPanel", js.undefined)
    
    @scala.inline
    def setRenderNavNextButton(value: /* props */ AriaLabel => ReactNode): Self = StObject.set(x, "renderNavNextButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderNavNextButtonNull: Self = StObject.set(x, "renderNavNextButton", null)
    
    @scala.inline
    def setRenderNavNextButtonUndefined: Self = StObject.set(x, "renderNavNextButton", js.undefined)
    
    @scala.inline
    def setRenderNavPrevButton(value: /* props */ AriaLabel => ReactNode): Self = StObject.set(x, "renderNavPrevButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderNavPrevButtonNull: Self = StObject.set(x, "renderNavPrevButton", null)
    
    @scala.inline
    def setRenderNavPrevButtonUndefined: Self = StObject.set(x, "renderNavPrevButton", js.undefined)
    
    @scala.inline
    def setRenderWeekHeaderElement(value: /* day */ String => ReactNode): Self = StObject.set(x, "renderWeekHeaderElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderWeekHeaderElementNull: Self = StObject.set(x, "renderWeekHeaderElement", null)
    
    @scala.inline
    def setRenderWeekHeaderElementUndefined: Self = StObject.set(x, "renderWeekHeaderElement", js.undefined)
    
    @scala.inline
    def setShowKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "showKeyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowKeyboardShortcutsUndefined: Self = StObject.set(x, "showKeyboardShortcuts", js.undefined)
    
    @scala.inline
    def setVerticalHeight(value: Double): Self = StObject.set(x, "verticalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalHeightNull: Self = StObject.set(x, "verticalHeight", null)
    
    @scala.inline
    def setVerticalHeightUndefined: Self = StObject.set(x, "verticalHeight", js.undefined)
    
    @scala.inline
    def setWeekDayFormat(value: String): Self = StObject.set(x, "weekDayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekDayFormatUndefined: Self = StObject.set(x, "weekDayFormat", js.undefined)
    
    @scala.inline
    def setWithPortal(value: Boolean): Self = StObject.set(x, "withPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithPortalUndefined: Self = StObject.set(x, "withPortal", js.undefined)
  }
}
