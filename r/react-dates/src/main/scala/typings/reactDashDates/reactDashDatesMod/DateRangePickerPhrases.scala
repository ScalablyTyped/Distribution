package typings.reactDashDates.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// PHRASES
//
// defaultPhrases.js
trait DateRangePickerPhrases extends js.Object {
  var calendarLabel: js.UndefOr[String] = js.undefined
  var chooseAvailableEndDate: js.UndefOr[js.Function1[/* date */ String, String]] = js.undefined
  var chooseAvailableStartDate: js.UndefOr[js.Function1[/* date */ String, String]] = js.undefined
  var clearDates: js.UndefOr[String] = js.undefined
  var closeDatePicker: js.UndefOr[String] = js.undefined
  var dateIsSelected: js.UndefOr[js.Function1[/* date */ String, String]] = js.undefined
  var dateIsUnavailable: js.UndefOr[js.Function1[/* date */ String, String]] = js.undefined
  var enterKey: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
  var focusStartDate: js.UndefOr[String] = js.undefined
  var hideKeyboardShortcutsPanel: js.UndefOr[String] = js.undefined
  var homeEnd: js.UndefOr[String] = js.undefined
  var jumpToNextMonth: js.UndefOr[String] = js.undefined
  var jumpToPrevMonth: js.UndefOr[String] = js.undefined
  var keyboardNavigationInstructions: js.UndefOr[String] = js.undefined
  var keyboardShortcuts: js.UndefOr[String] = js.undefined
  var leftArrowRightArrow: js.UndefOr[String] = js.undefined
  var moveFocusByOneDay: js.UndefOr[String] = js.undefined
  var moveFocusByOneMonth: js.UndefOr[String] = js.undefined
  var moveFocusByOneWeek: js.UndefOr[String] = js.undefined
  var moveFocustoStartAndEndOfWeek: js.UndefOr[String] = js.undefined
  var openThisPanel: js.UndefOr[String] = js.undefined
  var pageUpPageDown: js.UndefOr[String] = js.undefined
  var questionMark: js.UndefOr[String] = js.undefined
  var returnFocusToInput: js.UndefOr[String] = js.undefined
  var selectFocusedDate: js.UndefOr[String] = js.undefined
  var showKeyboardShortcutsPanel: js.UndefOr[String] = js.undefined
  var upArrowDownArrow: js.UndefOr[String] = js.undefined
}

object DateRangePickerPhrases {
  @scala.inline
  def apply(
    calendarLabel: String = null,
    chooseAvailableEndDate: /* date */ String => String = null,
    chooseAvailableStartDate: /* date */ String => String = null,
    clearDates: String = null,
    closeDatePicker: String = null,
    dateIsSelected: /* date */ String => String = null,
    dateIsUnavailable: /* date */ String => String = null,
    enterKey: String = null,
    escape: String = null,
    focusStartDate: String = null,
    hideKeyboardShortcutsPanel: String = null,
    homeEnd: String = null,
    jumpToNextMonth: String = null,
    jumpToPrevMonth: String = null,
    keyboardNavigationInstructions: String = null,
    keyboardShortcuts: String = null,
    leftArrowRightArrow: String = null,
    moveFocusByOneDay: String = null,
    moveFocusByOneMonth: String = null,
    moveFocusByOneWeek: String = null,
    moveFocustoStartAndEndOfWeek: String = null,
    openThisPanel: String = null,
    pageUpPageDown: String = null,
    questionMark: String = null,
    returnFocusToInput: String = null,
    selectFocusedDate: String = null,
    showKeyboardShortcutsPanel: String = null,
    upArrowDownArrow: String = null
  ): DateRangePickerPhrases = {
    val __obj = js.Dynamic.literal()
    if (calendarLabel != null) __obj.updateDynamic("calendarLabel")(calendarLabel)
    if (chooseAvailableEndDate != null) __obj.updateDynamic("chooseAvailableEndDate")(js.Any.fromFunction1(chooseAvailableEndDate))
    if (chooseAvailableStartDate != null) __obj.updateDynamic("chooseAvailableStartDate")(js.Any.fromFunction1(chooseAvailableStartDate))
    if (clearDates != null) __obj.updateDynamic("clearDates")(clearDates)
    if (closeDatePicker != null) __obj.updateDynamic("closeDatePicker")(closeDatePicker)
    if (dateIsSelected != null) __obj.updateDynamic("dateIsSelected")(js.Any.fromFunction1(dateIsSelected))
    if (dateIsUnavailable != null) __obj.updateDynamic("dateIsUnavailable")(js.Any.fromFunction1(dateIsUnavailable))
    if (enterKey != null) __obj.updateDynamic("enterKey")(enterKey)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (focusStartDate != null) __obj.updateDynamic("focusStartDate")(focusStartDate)
    if (hideKeyboardShortcutsPanel != null) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel)
    if (homeEnd != null) __obj.updateDynamic("homeEnd")(homeEnd)
    if (jumpToNextMonth != null) __obj.updateDynamic("jumpToNextMonth")(jumpToNextMonth)
    if (jumpToPrevMonth != null) __obj.updateDynamic("jumpToPrevMonth")(jumpToPrevMonth)
    if (keyboardNavigationInstructions != null) __obj.updateDynamic("keyboardNavigationInstructions")(keyboardNavigationInstructions)
    if (keyboardShortcuts != null) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts)
    if (leftArrowRightArrow != null) __obj.updateDynamic("leftArrowRightArrow")(leftArrowRightArrow)
    if (moveFocusByOneDay != null) __obj.updateDynamic("moveFocusByOneDay")(moveFocusByOneDay)
    if (moveFocusByOneMonth != null) __obj.updateDynamic("moveFocusByOneMonth")(moveFocusByOneMonth)
    if (moveFocusByOneWeek != null) __obj.updateDynamic("moveFocusByOneWeek")(moveFocusByOneWeek)
    if (moveFocustoStartAndEndOfWeek != null) __obj.updateDynamic("moveFocustoStartAndEndOfWeek")(moveFocustoStartAndEndOfWeek)
    if (openThisPanel != null) __obj.updateDynamic("openThisPanel")(openThisPanel)
    if (pageUpPageDown != null) __obj.updateDynamic("pageUpPageDown")(pageUpPageDown)
    if (questionMark != null) __obj.updateDynamic("questionMark")(questionMark)
    if (returnFocusToInput != null) __obj.updateDynamic("returnFocusToInput")(returnFocusToInput)
    if (selectFocusedDate != null) __obj.updateDynamic("selectFocusedDate")(selectFocusedDate)
    if (showKeyboardShortcutsPanel != null) __obj.updateDynamic("showKeyboardShortcutsPanel")(showKeyboardShortcutsPanel)
    if (upArrowDownArrow != null) __obj.updateDynamic("upArrowDownArrow")(upArrowDownArrow)
    __obj.asInstanceOf[DateRangePickerPhrases]
  }
}

