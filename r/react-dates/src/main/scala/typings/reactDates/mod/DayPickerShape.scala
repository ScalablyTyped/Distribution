package typings.reactDates.mod

import typings.react.mod.global.JSX.Element
import typings.reactDates.anon.IsVisible
import typings.reactDates.mod.momentPropTypes.momentObj
import typings.reactDates.reactDatesNumbers.`0`
import typings.reactDates.reactDatesNumbers.`1`
import typings.reactDates.reactDatesNumbers.`2`
import typings.reactDates.reactDatesNumbers.`3`
import typings.reactDates.reactDatesNumbers.`4`
import typings.reactDates.reactDatesNumbers.`5`
import typings.reactDates.reactDatesNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerShape.jsx
@js.native
trait DayPickerShape extends js.Object {
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  var dayAriaLabelFormat: js.UndefOr[String] = js.native
  var daySize: js.UndefOr[Double] = js.native
  var enableOutsideDays: js.UndefOr[Boolean] = js.native
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.native
  var horizontalMonthPadding: js.UndefOr[Double] = js.native
  var initialVisibleMonth: js.UndefOr[js.Function0[momentObj]] = js.native
  var isFocused: js.UndefOr[Boolean] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  // i18n
  var monthFormat: js.UndefOr[String] = js.native
  var navNext: js.UndefOr[String | Element] = js.native
  var navPrev: js.UndefOr[String | Element] = js.native
  var noBorder: js.UndefOr[Boolean] = js.native
  var numberOfMonths: js.UndefOr[Double] = js.native
  // accessibility
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
  var phrases: js.UndefOr[SingleDatePickerPhrases] = js.native
  var renderCalendarDay: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.native
  var renderCalendarInfo: js.UndefOr[js.Function0[String | Element]] = js.native
  var renderDayContents: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.native
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ IsVisible, String | Element]] = js.native
  var renderMonthText: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.native
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var verticalHeight: js.UndefOr[Double] = js.native
  var weekDayFormat: js.UndefOr[String] = js.native
  var withPortal: js.UndefOr[Boolean] = js.native
}

object DayPickerShape {
  @scala.inline
  def apply(): DayPickerShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerShape]
  }
  @scala.inline
  implicit class DayPickerShapeOps[Self <: DayPickerShape] (val x: Self) extends AnyVal {
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
    def setDayAriaLabelFormat(value: String): Self = this.set("dayAriaLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayAriaLabelFormat: Self = this.set("dayAriaLabelFormat", js.undefined)
    @scala.inline
    def setDaySize(value: Double): Self = this.set("daySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaySize: Self = this.set("daySize", js.undefined)
    @scala.inline
    def setEnableOutsideDays(value: Boolean): Self = this.set("enableOutsideDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableOutsideDays: Self = this.set("enableOutsideDays", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setHideKeyboardShortcutsPanel(value: Boolean): Self = this.set("hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideKeyboardShortcutsPanel: Self = this.set("hideKeyboardShortcutsPanel", js.undefined)
    @scala.inline
    def setHorizontalMonthPadding(value: Double): Self = this.set("horizontalMonthPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalMonthPadding: Self = this.set("horizontalMonthPadding", js.undefined)
    @scala.inline
    def setInitialVisibleMonth(value: () => momentObj): Self = this.set("initialVisibleMonth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitialVisibleMonth: Self = this.set("initialVisibleMonth", js.undefined)
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    @scala.inline
    def setNavNext(value: String | Element): Self = this.set("navNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavNext: Self = this.set("navNext", js.undefined)
    @scala.inline
    def setNavPrev(value: String | Element): Self = this.set("navPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavPrev: Self = this.set("navPrev", js.undefined)
    @scala.inline
    def setNoBorder(value: Boolean): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnNextMonthClick(value: /* newCurrentMonth */ momentObj => Unit): Self = this.set("onNextMonthClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNextMonthClick: Self = this.set("onNextMonthClick", js.undefined)
    @scala.inline
    def setOnOutsideClick(value: /* e */ js.Any => Unit): Self = this.set("onOutsideClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOutsideClick: Self = this.set("onOutsideClick", js.undefined)
    @scala.inline
    def setOnPrevMonthClick(value: /* newCurrentMonth */ momentObj => Unit): Self = this.set("onPrevMonthClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPrevMonthClick: Self = this.set("onPrevMonthClick", js.undefined)
    @scala.inline
    def setOrientation(value: ScrollableOrientationShape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPhrases(value: SingleDatePickerPhrases): Self = this.set("phrases", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    @scala.inline
    def setRenderCalendarDay(value: /* day */ momentObj => String | Element): Self = this.set("renderCalendarDay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderCalendarDay: Self = this.set("renderCalendarDay", js.undefined)
    @scala.inline
    def setRenderCalendarInfo(value: () => String | Element): Self = this.set("renderCalendarInfo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderCalendarInfo: Self = this.set("renderCalendarInfo", js.undefined)
    @scala.inline
    def setRenderDayContents(value: /* day */ momentObj => String | Element): Self = this.set("renderDayContents", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderDayContents: Self = this.set("renderDayContents", js.undefined)
    @scala.inline
    def setRenderMonthElement(value: /* props */ IsVisible => String | Element): Self = this.set("renderMonthElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderMonthElement: Self = this.set("renderMonthElement", js.undefined)
    @scala.inline
    def setRenderMonthText(value: /* day */ momentObj => String | Element): Self = this.set("renderMonthText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderMonthText: Self = this.set("renderMonthText", js.undefined)
    @scala.inline
    def setShowKeyboardShortcuts(value: Boolean): Self = this.set("showKeyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowKeyboardShortcuts: Self = this.set("showKeyboardShortcuts", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setVerticalHeight(value: Double): Self = this.set("verticalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalHeight: Self = this.set("verticalHeight", js.undefined)
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

