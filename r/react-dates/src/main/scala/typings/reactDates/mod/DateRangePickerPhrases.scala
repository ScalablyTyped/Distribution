package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait DateRangePickerPhrases extends js.Object {
  var calendarLabel: js.UndefOr[String] = js.native
  var chooseAvailableEndDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var chooseAvailableStartDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var clearDates: js.UndefOr[String] = js.native
  var closeDatePicker: js.UndefOr[String] = js.native
  var dateIsSelected: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsSelectedAsEndDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsSelectedAsStartDate: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var dateIsUnavailable: js.UndefOr[js.Function1[/* phraseArg */ PhraseArg, String]] = js.native
  var enterKey: js.UndefOr[String] = js.native
  var escape: js.UndefOr[String] = js.native
  var focusStartDate: js.UndefOr[String] = js.native
  var hideKeyboardShortcutsPanel: js.UndefOr[String] = js.native
  var homeEnd: js.UndefOr[String] = js.native
  var jumpToNextMonth: js.UndefOr[String] = js.native
  var jumpToPrevMonth: js.UndefOr[String] = js.native
  var keyboardNavigationInstructions: js.UndefOr[String] = js.native
  var keyboardShortcuts: js.UndefOr[String] = js.native
  var leftArrowRightArrow: js.UndefOr[String] = js.native
  var moveFocusByOneDay: js.UndefOr[String] = js.native
  var moveFocusByOneMonth: js.UndefOr[String] = js.native
  var moveFocusByOneWeek: js.UndefOr[String] = js.native
  var moveFocustoStartAndEndOfWeek: js.UndefOr[String] = js.native
  var openThisPanel: js.UndefOr[String] = js.native
  var pageUpPageDown: js.UndefOr[String] = js.native
  var questionMark: js.UndefOr[String] = js.native
  var returnFocusToInput: js.UndefOr[String] = js.native
  var selectFocusedDate: js.UndefOr[String] = js.native
  var showKeyboardShortcutsPanel: js.UndefOr[String] = js.native
  var upArrowDownArrow: js.UndefOr[String] = js.native
}

object DateRangePickerPhrases {
  @scala.inline
  def apply(): DateRangePickerPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerPhrases]
  }
  @scala.inline
  implicit class DateRangePickerPhrasesOps[Self <: DateRangePickerPhrases] (val x: Self) extends AnyVal {
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
    def setCalendarLabel(value: String): Self = this.set("calendarLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarLabel: Self = this.set("calendarLabel", js.undefined)
    @scala.inline
    def setChooseAvailableEndDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("chooseAvailableEndDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChooseAvailableEndDate: Self = this.set("chooseAvailableEndDate", js.undefined)
    @scala.inline
    def setChooseAvailableStartDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("chooseAvailableStartDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChooseAvailableStartDate: Self = this.set("chooseAvailableStartDate", js.undefined)
    @scala.inline
    def setClearDates(value: String): Self = this.set("clearDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearDates: Self = this.set("clearDates", js.undefined)
    @scala.inline
    def setCloseDatePicker(value: String): Self = this.set("closeDatePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDatePicker: Self = this.set("closeDatePicker", js.undefined)
    @scala.inline
    def setDateIsSelected(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsSelected: Self = this.set("dateIsSelected", js.undefined)
    @scala.inline
    def setDateIsSelectedAsEndDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsSelectedAsEndDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsSelectedAsEndDate: Self = this.set("dateIsSelectedAsEndDate", js.undefined)
    @scala.inline
    def setDateIsSelectedAsStartDate(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsSelectedAsStartDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsSelectedAsStartDate: Self = this.set("dateIsSelectedAsStartDate", js.undefined)
    @scala.inline
    def setDateIsUnavailable(value: /* phraseArg */ PhraseArg => String): Self = this.set("dateIsUnavailable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateIsUnavailable: Self = this.set("dateIsUnavailable", js.undefined)
    @scala.inline
    def setEnterKey(value: String): Self = this.set("enterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterKey: Self = this.set("enterKey", js.undefined)
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setFocusStartDate(value: String): Self = this.set("focusStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusStartDate: Self = this.set("focusStartDate", js.undefined)
    @scala.inline
    def setHideKeyboardShortcutsPanel(value: String): Self = this.set("hideKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideKeyboardShortcutsPanel: Self = this.set("hideKeyboardShortcutsPanel", js.undefined)
    @scala.inline
    def setHomeEnd(value: String): Self = this.set("homeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeEnd: Self = this.set("homeEnd", js.undefined)
    @scala.inline
    def setJumpToNextMonth(value: String): Self = this.set("jumpToNextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumpToNextMonth: Self = this.set("jumpToNextMonth", js.undefined)
    @scala.inline
    def setJumpToPrevMonth(value: String): Self = this.set("jumpToPrevMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumpToPrevMonth: Self = this.set("jumpToPrevMonth", js.undefined)
    @scala.inline
    def setKeyboardNavigationInstructions(value: String): Self = this.set("keyboardNavigationInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardNavigationInstructions: Self = this.set("keyboardNavigationInstructions", js.undefined)
    @scala.inline
    def setKeyboardShortcuts(value: String): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShortcuts: Self = this.set("keyboardShortcuts", js.undefined)
    @scala.inline
    def setLeftArrowRightArrow(value: String): Self = this.set("leftArrowRightArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftArrowRightArrow: Self = this.set("leftArrowRightArrow", js.undefined)
    @scala.inline
    def setMoveFocusByOneDay(value: String): Self = this.set("moveFocusByOneDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveFocusByOneDay: Self = this.set("moveFocusByOneDay", js.undefined)
    @scala.inline
    def setMoveFocusByOneMonth(value: String): Self = this.set("moveFocusByOneMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveFocusByOneMonth: Self = this.set("moveFocusByOneMonth", js.undefined)
    @scala.inline
    def setMoveFocusByOneWeek(value: String): Self = this.set("moveFocusByOneWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveFocusByOneWeek: Self = this.set("moveFocusByOneWeek", js.undefined)
    @scala.inline
    def setMoveFocustoStartAndEndOfWeek(value: String): Self = this.set("moveFocustoStartAndEndOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveFocustoStartAndEndOfWeek: Self = this.set("moveFocustoStartAndEndOfWeek", js.undefined)
    @scala.inline
    def setOpenThisPanel(value: String): Self = this.set("openThisPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenThisPanel: Self = this.set("openThisPanel", js.undefined)
    @scala.inline
    def setPageUpPageDown(value: String): Self = this.set("pageUpPageDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUpPageDown: Self = this.set("pageUpPageDown", js.undefined)
    @scala.inline
    def setQuestionMark(value: String): Self = this.set("questionMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuestionMark: Self = this.set("questionMark", js.undefined)
    @scala.inline
    def setReturnFocusToInput(value: String): Self = this.set("returnFocusToInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnFocusToInput: Self = this.set("returnFocusToInput", js.undefined)
    @scala.inline
    def setSelectFocusedDate(value: String): Self = this.set("selectFocusedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectFocusedDate: Self = this.set("selectFocusedDate", js.undefined)
    @scala.inline
    def setShowKeyboardShortcutsPanel(value: String): Self = this.set("showKeyboardShortcutsPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowKeyboardShortcutsPanel: Self = this.set("showKeyboardShortcutsPanel", js.undefined)
    @scala.inline
    def setUpArrowDownArrow(value: String): Self = this.set("upArrowDownArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpArrowDownArrow: Self = this.set("upArrowDownArrow", js.undefined)
  }
  
}

