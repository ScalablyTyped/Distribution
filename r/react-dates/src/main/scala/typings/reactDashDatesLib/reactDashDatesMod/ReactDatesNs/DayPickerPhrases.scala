package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
trait DayPickerPhrases extends js.Object {
  var calendarLabel: js.UndefOr[java.lang.String] = js.undefined
  var chooseAvailableDate: js.UndefOr[js.Function1[/* date */ java.lang.String, java.lang.String]] = js.undefined
  var chooseAvailableEndDate: js.UndefOr[js.Function1[/* date */ java.lang.String, java.lang.String]] = js.undefined
  var chooseAvailableStartDate: js.UndefOr[js.Function1[/* date */ java.lang.String, java.lang.String]] = js.undefined
  var dateIsSelected: js.UndefOr[js.Function1[/* date */ java.lang.String, java.lang.String]] = js.undefined
  var dateIsUnavailable: js.UndefOr[js.Function1[/* date */ java.lang.String, java.lang.String]] = js.undefined
  var enterKey: js.UndefOr[java.lang.String] = js.undefined
  var escape: js.UndefOr[java.lang.String] = js.undefined
  var hideKeyboardShortcutsPanel: js.UndefOr[java.lang.String] = js.undefined
  var homeEnd: js.UndefOr[java.lang.String] = js.undefined
  var jumpToNextMonth: js.UndefOr[java.lang.String] = js.undefined
  var jumpToPrevMonth: js.UndefOr[java.lang.String] = js.undefined
  var keyboardShortcuts: js.UndefOr[java.lang.String] = js.undefined
  var leftArrowRightArrow: js.UndefOr[java.lang.String] = js.undefined
  var moveFocusByOneDay: js.UndefOr[java.lang.String] = js.undefined
  var moveFocusByOneMonth: js.UndefOr[java.lang.String] = js.undefined
  var moveFocusByOneWeek: js.UndefOr[java.lang.String] = js.undefined
  var moveFocustoStartAndEndOfWeek: js.UndefOr[java.lang.String] = js.undefined
  var openThisPanel: js.UndefOr[java.lang.String] = js.undefined
  var pageUpPageDown: js.UndefOr[java.lang.String] = js.undefined
  var questionMark: js.UndefOr[java.lang.String] = js.undefined
  var returnFocusToInput: js.UndefOr[java.lang.String] = js.undefined
  var selectFocusedDate: js.UndefOr[java.lang.String] = js.undefined
  var showKeyboardShortcutsPanel: js.UndefOr[java.lang.String] = js.undefined
  var upArrowDownArrow: js.UndefOr[java.lang.String] = js.undefined
}

object DayPickerPhrases {
  @scala.inline
  def apply(
    calendarLabel: java.lang.String = null,
    chooseAvailableDate: /* date */ java.lang.String => java.lang.String = null,
    chooseAvailableEndDate: /* date */ java.lang.String => java.lang.String = null,
    chooseAvailableStartDate: /* date */ java.lang.String => java.lang.String = null,
    dateIsSelected: /* date */ java.lang.String => java.lang.String = null,
    dateIsUnavailable: /* date */ java.lang.String => java.lang.String = null,
    enterKey: java.lang.String = null,
    escape: java.lang.String = null,
    hideKeyboardShortcutsPanel: java.lang.String = null,
    homeEnd: java.lang.String = null,
    jumpToNextMonth: java.lang.String = null,
    jumpToPrevMonth: java.lang.String = null,
    keyboardShortcuts: java.lang.String = null,
    leftArrowRightArrow: java.lang.String = null,
    moveFocusByOneDay: java.lang.String = null,
    moveFocusByOneMonth: java.lang.String = null,
    moveFocusByOneWeek: java.lang.String = null,
    moveFocustoStartAndEndOfWeek: java.lang.String = null,
    openThisPanel: java.lang.String = null,
    pageUpPageDown: java.lang.String = null,
    questionMark: java.lang.String = null,
    returnFocusToInput: java.lang.String = null,
    selectFocusedDate: java.lang.String = null,
    showKeyboardShortcutsPanel: java.lang.String = null,
    upArrowDownArrow: java.lang.String = null
  ): DayPickerPhrases = {
    val __obj = js.Dynamic.literal()
    if (calendarLabel != null) __obj.updateDynamic("calendarLabel")(calendarLabel)
    if (chooseAvailableDate != null) __obj.updateDynamic("chooseAvailableDate")(js.Any.fromFunction1(chooseAvailableDate))
    if (chooseAvailableEndDate != null) __obj.updateDynamic("chooseAvailableEndDate")(js.Any.fromFunction1(chooseAvailableEndDate))
    if (chooseAvailableStartDate != null) __obj.updateDynamic("chooseAvailableStartDate")(js.Any.fromFunction1(chooseAvailableStartDate))
    if (dateIsSelected != null) __obj.updateDynamic("dateIsSelected")(js.Any.fromFunction1(dateIsSelected))
    if (dateIsUnavailable != null) __obj.updateDynamic("dateIsUnavailable")(js.Any.fromFunction1(dateIsUnavailable))
    if (enterKey != null) __obj.updateDynamic("enterKey")(enterKey)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (hideKeyboardShortcutsPanel != null) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel)
    if (homeEnd != null) __obj.updateDynamic("homeEnd")(homeEnd)
    if (jumpToNextMonth != null) __obj.updateDynamic("jumpToNextMonth")(jumpToNextMonth)
    if (jumpToPrevMonth != null) __obj.updateDynamic("jumpToPrevMonth")(jumpToPrevMonth)
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
    __obj.asInstanceOf[DayPickerPhrases]
  }
}

