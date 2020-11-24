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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarInfoPosition extends js.Object {
  
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  
  // navigation props
  var dayPickerNavigationInlineStyles: js.UndefOr[(Record[String, _]) | Null] = js.native
  
  var disableNext: js.UndefOr[Boolean] = js.native
  
  var disablePrev: js.UndefOr[Boolean] = js.native
  
  var getFirstFocusableDay: js.UndefOr[(js.Function1[/* month */ Moment, Moment]) | Null] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.native
  
  var initialVisibleMonth: js.UndefOr[js.Function0[Moment]] = js.native
  
  // accessibility props
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var navNext: js.UndefOr[ReactNode] = js.native
  
  var navPosition: js.UndefOr[NavPositionShape] = js.native
  
  var navPrev: js.UndefOr[ReactNode] = js.native
  
  var noBorder: js.UndefOr[Boolean] = js.native
  
  var noNavButtons: js.UndefOr[Boolean] = js.native
  
  var noNavNextButton: js.UndefOr[Boolean] = js.native
  
  var noNavPrevButton: js.UndefOr[Boolean] = js.native
  
  // calendar presentation props
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onBlur: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onMonthChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.native
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var onShiftTab: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTab: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  var onYearChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.native
  
  var phrases: js.UndefOr[DayPickerPhrases] = js.native
  
  var renderCalendarInfo: js.UndefOr[js.Function0[ReactNode] | Null] = js.native
  
  var renderKeyboardShortcutsButton: js.UndefOr[js.Function1[/* props */ OnClick, ReactNode]] = js.native
  
  var renderKeyboardShortcutsPanel: js.UndefOr[js.Function1[/* props */ CloseButtonAriaLabel, ReactNode]] = js.native
  
  var renderNavNextButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, ReactNode]) | Null] = js.native
  
  var renderNavPrevButton: js.UndefOr[(js.Function1[/* props */ AriaLabel, ReactNode]) | Null] = js.native
  
  // month props
  var renderWeekHeaderElement: js.UndefOr[(js.Function1[/* day */ String, ReactNode]) | Null] = js.native
  
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.native
  
  var verticalHeight: js.UndefOr[Double | Null] = js.native
  
  // internationalization
  var weekDayFormat: js.UndefOr[String] = js.native
  
  var withPortal: js.UndefOr[Boolean] = js.native
}
object CalendarInfoPosition {
  
  @scala.inline
  def apply(): CalendarInfoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarInfoPosition]
  }
  
  @scala.inline
  implicit class CalendarInfoPositionOps[Self <: CalendarInfoPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalendarInfoPosition(value: CalendarInfoPositionShape): Self = this.set("calendarInfoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarInfoPosition: Self = this.set("calendarInfoPosition", js.undefined)
    
    @scala.inline
    def setDayPickerNavigationInlineStyles(value: Record[String, _]): Self = this.set("dayPickerNavigationInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPickerNavigationInlineStyles: Self = this.set("dayPickerNavigationInlineStyles", js.undefined)
    
    @scala.inline
    def setDayPickerNavigationInlineStylesNull: Self = this.set("dayPickerNavigationInlineStyles", null)
    
    @scala.inline
    def setDisableNext(value: Boolean): Self = this.set("disableNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNext: Self = this.set("disableNext", js.undefined)
    
    @scala.inline
    def setDisablePrev(value: Boolean): Self = this.set("disablePrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePrev: Self = this.set("disablePrev", js.undefined)
    
    @scala.inline
    def setGetFirstFocusableDay(value: /* month */ Moment => Moment): Self = this.set("getFirstFocusableDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFirstFocusableDay: Self = this.set("getFirstFocusableDay", js.undefined)
    
    @scala.inline
    def setGetFirstFocusableDayNull: Self = this.set("getFirstFocusableDay", null)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHideKeyboardShortcutsPanel(value: Boolean): Self = this.set("hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideKeyboardShortcutsPanel: Self = this.set("hideKeyboardShortcutsPanel", js.undefined)
    
    @scala.inline
    def setInitialVisibleMonth(value: () => Moment): Self = this.set("initialVisibleMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitialVisibleMonth: Self = this.set("initialVisibleMonth", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setNavNext(value: ReactNode): Self = this.set("navNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavNext: Self = this.set("navNext", js.undefined)
    
    @scala.inline
    def setNavPosition(value: NavPositionShape): Self = this.set("navPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPosition: Self = this.set("navPosition", js.undefined)
    
    @scala.inline
    def setNavPrev(value: ReactNode): Self = this.set("navPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPrev: Self = this.set("navPrev", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    
    @scala.inline
    def setNoNavButtons(value: Boolean): Self = this.set("noNavButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNavButtons: Self = this.set("noNavButtons", js.undefined)
    
    @scala.inline
    def setNoNavNextButton(value: Boolean): Self = this.set("noNavNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNavNextButton: Self = this.set("noNavNextButton", js.undefined)
    
    @scala.inline
    def setNoNavPrevButton(value: Boolean): Self = this.set("noNavPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNavPrevButton: Self = this.set("noNavPrevButton", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnBlur(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* newMonth */ Moment => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnNextMonthClick(value: /* newCurrentMonth */ Moment => Unit): Self = this.set("onNextMonthClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNextMonthClick: Self = this.set("onNextMonthClick", js.undefined)
    
    @scala.inline
    def setOnOutsideClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOutsideClick: Self = this.set("onOutsideClick", js.undefined)
    
    @scala.inline
    def setOnPrevMonthClick(value: /* newCurrentMonth */ Moment => Unit): Self = this.set("onPrevMonthClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPrevMonthClick: Self = this.set("onPrevMonthClick", js.undefined)
    
    @scala.inline
    def setOnShiftTab(value: () => Unit): Self = this.set("onShiftTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShiftTab: Self = this.set("onShiftTab", js.undefined)
    
    @scala.inline
    def setOnTab(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* newMonth */ Moment => Unit): Self = this.set("onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    
    @scala.inline
    def setPhrases(value: DayPickerPhrases): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    
    @scala.inline
    def setRenderCalendarInfo(value: () => ReactNode): Self = this.set("renderCalendarInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderCalendarInfo: Self = this.set("renderCalendarInfo", js.undefined)
    
    @scala.inline
    def setRenderCalendarInfoNull: Self = this.set("renderCalendarInfo", null)
    
    @scala.inline
    def setRenderKeyboardShortcutsButton(value: /* props */ OnClick => ReactNode): Self = this.set("renderKeyboardShortcutsButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderKeyboardShortcutsButton: Self = this.set("renderKeyboardShortcutsButton", js.undefined)
    
    @scala.inline
    def setRenderKeyboardShortcutsPanel(value: /* props */ CloseButtonAriaLabel => ReactNode): Self = this.set("renderKeyboardShortcutsPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderKeyboardShortcutsPanel: Self = this.set("renderKeyboardShortcutsPanel", js.undefined)
    
    @scala.inline
    def setRenderNavNextButton(value: /* props */ AriaLabel => ReactNode): Self = this.set("renderNavNextButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderNavNextButton: Self = this.set("renderNavNextButton", js.undefined)
    
    @scala.inline
    def setRenderNavNextButtonNull: Self = this.set("renderNavNextButton", null)
    
    @scala.inline
    def setRenderNavPrevButton(value: /* props */ AriaLabel => ReactNode): Self = this.set("renderNavPrevButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderNavPrevButton: Self = this.set("renderNavPrevButton", js.undefined)
    
    @scala.inline
    def setRenderNavPrevButtonNull: Self = this.set("renderNavPrevButton", null)
    
    @scala.inline
    def setRenderWeekHeaderElement(value: /* day */ String => ReactNode): Self = this.set("renderWeekHeaderElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderWeekHeaderElement: Self = this.set("renderWeekHeaderElement", js.undefined)
    
    @scala.inline
    def setRenderWeekHeaderElementNull: Self = this.set("renderWeekHeaderElement", null)
    
    @scala.inline
    def setShowKeyboardShortcuts(value: Boolean): Self = this.set("showKeyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowKeyboardShortcuts: Self = this.set("showKeyboardShortcuts", js.undefined)
    
    @scala.inline
    def setVerticalHeight(value: Double): Self = this.set("verticalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalHeight: Self = this.set("verticalHeight", js.undefined)
    
    @scala.inline
    def setVerticalHeightNull: Self = this.set("verticalHeight", null)
    
    @scala.inline
    def setWeekDayFormat(value: String): Self = this.set("weekDayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekDayFormat: Self = this.set("weekDayFormat", js.undefined)
    
    @scala.inline
    def setWithPortal(value: Boolean): Self = this.set("withPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithPortal: Self = this.set("withPortal", js.undefined)
  }
}
