package typings.reactDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-dates.react-dates.DayPickerShape, 'renderWeekHeaderElement' | 'enableOutsideDays' | 'numberOfMonths' | 'withPortal' | 'hideKeyboardShortcutsPanel' | 'daySize' | 'noBorder' | 'verticalBorderSpacing' | 'horizontalMonthPadding' | 'dayPickerNavigationInlineStyles' | 'navPosition' | 'navPrev' | 'navNext' | 'renderNavPrevButton' | 'renderNavNextButton' | 'noNavButtons' | 'noNavNextButton' | 'noNavPrevButton' | 'onOutsideClick' | 'renderCalendarDay' | 'renderDayContents' | 'renderCalendarInfo' | 'calendarInfoPosition' | 'firstDayOfWeek' | 'verticalHeight' | 'transitionDuration' | 'onBlur' | 'isFocused' | 'showKeyboardShortcuts' | 'onTab' | 'onShiftTab' | 'monthFormat' | 'weekDayFormat' | 'phrases' | 'dayAriaLabelFormat' | 'isRTL'> */
@js.native
trait PickDayPickerShaperenderWCalendarInfoPosition extends js.Object {
  
  var calendarInfoPosition: js.UndefOr[js.Any] = js.native
  
  var dayAriaLabelFormat: js.UndefOr[js.Any] = js.native
  
  var dayPickerNavigationInlineStyles: js.UndefOr[js.Any] = js.native
  
  var daySize: js.UndefOr[js.Any] = js.native
  
  var enableOutsideDays: js.UndefOr[js.Any] = js.native
  
  var firstDayOfWeek: js.UndefOr[js.Any] = js.native
  
  var hideKeyboardShortcutsPanel: js.UndefOr[js.Any] = js.native
  
  var horizontalMonthPadding: js.UndefOr[js.Any] = js.native
  
  var isFocused: js.UndefOr[js.Any] = js.native
  
  var isRTL: js.UndefOr[js.Any] = js.native
  
  var monthFormat: js.UndefOr[js.Any] = js.native
  
  var navNext: js.UndefOr[js.Any] = js.native
  
  var navPosition: js.UndefOr[js.Any] = js.native
  
  var navPrev: js.UndefOr[js.Any] = js.native
  
  var noBorder: js.UndefOr[js.Any] = js.native
  
  var noNavButtons: js.UndefOr[js.Any] = js.native
  
  var noNavNextButton: js.UndefOr[js.Any] = js.native
  
  var noNavPrevButton: js.UndefOr[js.Any] = js.native
  
  var numberOfMonths: js.UndefOr[js.Any] = js.native
  
  var onBlur: js.UndefOr[js.Any] = js.native
  
  var onOutsideClick: js.UndefOr[js.Any] = js.native
  
  var onShiftTab: js.UndefOr[js.Any] = js.native
  
  var onTab: js.UndefOr[js.Any] = js.native
  
  var phrases: js.UndefOr[js.Any] = js.native
  
  var renderCalendarDay: js.UndefOr[js.Any] = js.native
  
  var renderCalendarInfo: js.UndefOr[js.Any] = js.native
  
  var renderDayContents: js.UndefOr[js.Any] = js.native
  
  var renderNavNextButton: js.UndefOr[js.Any] = js.native
  
  var renderNavPrevButton: js.UndefOr[js.Any] = js.native
  
  var renderWeekHeaderElement: js.UndefOr[js.Any] = js.native
  
  var showKeyboardShortcuts: js.UndefOr[js.Any] = js.native
  
  var transitionDuration: js.UndefOr[js.Any] = js.native
  
  var verticalBorderSpacing: js.UndefOr[js.Any] = js.native
  
  var verticalHeight: js.UndefOr[js.Any] = js.native
  
  var weekDayFormat: js.UndefOr[js.Any] = js.native
  
  var withPortal: js.UndefOr[js.Any] = js.native
}
object PickDayPickerShaperenderWCalendarInfoPosition {
  
  @scala.inline
  def apply(): PickDayPickerShaperenderWCalendarInfoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDayPickerShaperenderWCalendarInfoPosition]
  }
  
  @scala.inline
  implicit class PickDayPickerShaperenderWCalendarInfoPositionOps[Self <: PickDayPickerShaperenderWCalendarInfoPosition] (val x: Self) extends AnyVal {
    
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
    def setCalendarInfoPosition(value: js.Any): Self = this.set("calendarInfoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarInfoPosition: Self = this.set("calendarInfoPosition", js.undefined)
    
    @scala.inline
    def setDayAriaLabelFormat(value: js.Any): Self = this.set("dayAriaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayAriaLabelFormat: Self = this.set("dayAriaLabelFormat", js.undefined)
    
    @scala.inline
    def setDayPickerNavigationInlineStyles(value: js.Any): Self = this.set("dayPickerNavigationInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPickerNavigationInlineStyles: Self = this.set("dayPickerNavigationInlineStyles", js.undefined)
    
    @scala.inline
    def setDaySize(value: js.Any): Self = this.set("daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaySize: Self = this.set("daySize", js.undefined)
    
    @scala.inline
    def setEnableOutsideDays(value: js.Any): Self = this.set("enableOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOutsideDays: Self = this.set("enableOutsideDays", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: js.Any): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setHideKeyboardShortcutsPanel(value: js.Any): Self = this.set("hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideKeyboardShortcutsPanel: Self = this.set("hideKeyboardShortcutsPanel", js.undefined)
    
    @scala.inline
    def setHorizontalMonthPadding(value: js.Any): Self = this.set("horizontalMonthPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalMonthPadding: Self = this.set("horizontalMonthPadding", js.undefined)
    
    @scala.inline
    def setIsFocused(value: js.Any): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsRTL(value: js.Any): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: js.Any): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setNavNext(value: js.Any): Self = this.set("navNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavNext: Self = this.set("navNext", js.undefined)
    
    @scala.inline
    def setNavPosition(value: js.Any): Self = this.set("navPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPosition: Self = this.set("navPosition", js.undefined)
    
    @scala.inline
    def setNavPrev(value: js.Any): Self = this.set("navPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPrev: Self = this.set("navPrev", js.undefined)
    
    @scala.inline
    def setNoBorder(value: js.Any): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    
    @scala.inline
    def setNoNavButtons(value: js.Any): Self = this.set("noNavButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNavButtons: Self = this.set("noNavButtons", js.undefined)
    
    @scala.inline
    def setNoNavNextButton(value: js.Any): Self = this.set("noNavNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNavNextButton: Self = this.set("noNavNextButton", js.undefined)
    
    @scala.inline
    def setNoNavPrevButton(value: js.Any): Self = this.set("noNavPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNavPrevButton: Self = this.set("noNavPrevButton", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: js.Any): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnBlur(value: js.Any): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnOutsideClick(value: js.Any): Self = this.set("onOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOutsideClick: Self = this.set("onOutsideClick", js.undefined)
    
    @scala.inline
    def setOnShiftTab(value: js.Any): Self = this.set("onShiftTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShiftTab: Self = this.set("onShiftTab", js.undefined)
    
    @scala.inline
    def setOnTab(value: js.Any): Self = this.set("onTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    
    @scala.inline
    def setPhrases(value: js.Any): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    
    @scala.inline
    def setRenderCalendarDay(value: js.Any): Self = this.set("renderCalendarDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderCalendarDay: Self = this.set("renderCalendarDay", js.undefined)
    
    @scala.inline
    def setRenderCalendarInfo(value: js.Any): Self = this.set("renderCalendarInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderCalendarInfo: Self = this.set("renderCalendarInfo", js.undefined)
    
    @scala.inline
    def setRenderDayContents(value: js.Any): Self = this.set("renderDayContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDayContents: Self = this.set("renderDayContents", js.undefined)
    
    @scala.inline
    def setRenderNavNextButton(value: js.Any): Self = this.set("renderNavNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderNavNextButton: Self = this.set("renderNavNextButton", js.undefined)
    
    @scala.inline
    def setRenderNavPrevButton(value: js.Any): Self = this.set("renderNavPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderNavPrevButton: Self = this.set("renderNavPrevButton", js.undefined)
    
    @scala.inline
    def setRenderWeekHeaderElement(value: js.Any): Self = this.set("renderWeekHeaderElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderWeekHeaderElement: Self = this.set("renderWeekHeaderElement", js.undefined)
    
    @scala.inline
    def setShowKeyboardShortcuts(value: js.Any): Self = this.set("showKeyboardShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowKeyboardShortcuts: Self = this.set("showKeyboardShortcuts", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: js.Any): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setVerticalBorderSpacing(value: js.Any): Self = this.set("verticalBorderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalBorderSpacing: Self = this.set("verticalBorderSpacing", js.undefined)
    
    @scala.inline
    def setVerticalHeight(value: js.Any): Self = this.set("verticalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalHeight: Self = this.set("verticalHeight", js.undefined)
    
    @scala.inline
    def setWeekDayFormat(value: js.Any): Self = this.set("weekDayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekDayFormat: Self = this.set("weekDayFormat", js.undefined)
    
    @scala.inline
    def setWithPortal(value: js.Any): Self = this.set("withPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithPortal: Self = this.set("withPortal", js.undefined)
  }
}
