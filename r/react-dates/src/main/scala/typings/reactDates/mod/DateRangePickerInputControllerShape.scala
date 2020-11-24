package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.reactDates.anon.EndDate
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-dates.react-dates.DateRangePickerInputShape, 'startDateId' | 'startDatePlaceholderText' | 'isStartDateFocused' | 'startDateAriaLabel' | 'endDateId' | 'endDatePlaceholderText' | 'isEndDateFocused' | 'endDateAriaLabel' | 'screenReaderMessage' | 'showClearDates' | 'showCaret' | 'showDefaultInputIcon' | 'inputIconPosition' | 'disabled' | 'required' | 'readOnly' | 'openDirection' | 'noBorder' | 'block' | 'small' | 'regular' | 'verticalSpacing' | 'onKeyDownArrowDown' | 'onKeyDownQuestionMark' | 'customInputIcon' | 'customArrowIcon' | 'customCloseIcon' | 'isFocused' | 'phrases' | 'isRTL'> */
@js.native
trait DateRangePickerInputControllerShape extends js.Object {
  
  var block: js.UndefOr[Boolean] = js.native
  
  var customArrowIcon: js.UndefOr[ReactNode] = js.native
  
  var customCloseIcon: js.UndefOr[ReactNode] = js.native
  
  var customInputIcon: js.UndefOr[ReactNode] = js.native
  
  var disabled: js.UndefOr[DisabledShape] = js.native
  
  var displayFormat: js.UndefOr[String | js.Function0[String]] = js.native
  
  var endDate: js.UndefOr[Moment | Null] = js.native
  
  var endDateAriaLabel: js.UndefOr[String] = js.native
  
  var endDateId: js.UndefOr[String] = js.native
  
  var endDatePlaceholderText: js.UndefOr[String] = js.native
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  
  var isEndDateFocused: js.UndefOr[Boolean] = js.native
  
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var isStartDateFocused: js.UndefOr[Boolean] = js.native
  
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  
  var minimumNights: js.UndefOr[Double] = js.native
  
  var noBorder: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* final */ EndDate, Unit]] = js.native
  
  var onDatesChange: js.UndefOr[js.Function1[/* arg */ EndDate, Unit]] = js.native
  
  var onFocusChange: js.UndefOr[js.Function1[/* arg */ FocusedInputShape | Null, Unit]] = js.native
  
  var onKeyDownArrowDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownQuestionMark: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  
  var phrases: js.UndefOr[DateRangePickerInputPhrases] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var regular: js.UndefOr[Boolean] = js.native
  
  var reopenPickerOnClearDates: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var screenReaderMessage: js.UndefOr[String] = js.native
  
  var showCaret: js.UndefOr[Boolean] = js.native
  
  var showClearDates: js.UndefOr[Boolean] = js.native
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  var startDate: js.UndefOr[Moment | Null] = js.native
  
  var startDateAriaLabel: js.UndefOr[String] = js.native
  
  var startDateId: js.UndefOr[String] = js.native
  
  var startDatePlaceholderText: js.UndefOr[String] = js.native
  
  var verticalSpacing: js.UndefOr[Double] = js.native
  
  var withFullScreenPortal: js.UndefOr[Boolean] = js.native
}
object DateRangePickerInputControllerShape {
  
  @scala.inline
  def apply(): DateRangePickerInputControllerShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputControllerShape]
  }
  
  @scala.inline
  implicit class DateRangePickerInputControllerShapeOps[Self <: DateRangePickerInputControllerShape] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCustomArrowIcon(value: ReactNode): Self = this.set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomArrowIcon: Self = this.set("customArrowIcon", js.undefined)
    
    @scala.inline
    def setCustomCloseIcon(value: ReactNode): Self = this.set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCloseIcon: Self = this.set("customCloseIcon", js.undefined)
    
    @scala.inline
    def setCustomInputIcon(value: ReactNode): Self = this.set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInputIcon: Self = this.set("customInputIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: DisabledShape): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayFormatFunction0(value: () => String): Self = this.set("displayFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayFormat(value: String | js.Function0[String]): Self = this.set("displayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFormat: Self = this.set("displayFormat", js.undefined)
    
    @scala.inline
    def setEndDate(value: Moment): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEndDateNull: Self = this.set("endDate", null)
    
    @scala.inline
    def setEndDateAriaLabel(value: String): Self = this.set("endDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateAriaLabel: Self = this.set("endDateAriaLabel", js.undefined)
    
    @scala.inline
    def setEndDateId(value: String): Self = this.set("endDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateId: Self = this.set("endDateId", js.undefined)
    
    @scala.inline
    def setEndDatePlaceholderText(value: String): Self = this.set("endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDatePlaceholderText: Self = this.set("endDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setInputIconPosition(value: IconPositionShape): Self = this.set("inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIconPosition: Self = this.set("inputIconPosition", js.undefined)
    
    @scala.inline
    def setIsEndDateFocused(value: Boolean): Self = this.set("isEndDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEndDateFocused: Self = this.set("isEndDateFocused", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsOutsideRange(value: /* day */ Moment => Boolean): Self = this.set("isOutsideRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsOutsideRange: Self = this.set("isOutsideRange", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setIsStartDateFocused(value: Boolean): Self = this.set("isStartDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStartDateFocused: Self = this.set("isStartDateFocused", js.undefined)
    
    @scala.inline
    def setKeepOpenOnDateSelect(value: Boolean): Self = this.set("keepOpenOnDateSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOpenOnDateSelect: Self = this.set("keepOpenOnDateSelect", js.undefined)
    
    @scala.inline
    def setMinimumNights(value: Double): Self = this.set("minimumNights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumNights: Self = this.set("minimumNights", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* final */ EndDate => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnDatesChange(value: /* arg */ EndDate => Unit): Self = this.set("onDatesChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDatesChange: Self = this.set("onDatesChange", js.undefined)
    
    @scala.inline
    def setOnFocusChange(value: /* arg */ FocusedInputShape | Null => Unit): Self = this.set("onFocusChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusChange: Self = this.set("onFocusChange", js.undefined)
    
    @scala.inline
    def setOnKeyDownArrowDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownArrowDown: Self = this.set("onKeyDownArrowDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownQuestionMark(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownQuestionMark: Self = this.set("onKeyDownQuestionMark", js.undefined)
    
    @scala.inline
    def setOpenDirection(value: OpenDirectionShape): Self = this.set("openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDirection: Self = this.set("openDirection", js.undefined)
    
    @scala.inline
    def setPhrases(value: DateRangePickerInputPhrases): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRegular(value: Boolean): Self = this.set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegular: Self = this.set("regular", js.undefined)
    
    @scala.inline
    def setReopenPickerOnClearDates(value: Boolean): Self = this.set("reopenPickerOnClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReopenPickerOnClearDates: Self = this.set("reopenPickerOnClearDates", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setScreenReaderMessage(value: String): Self = this.set("screenReaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenReaderMessage: Self = this.set("screenReaderMessage", js.undefined)
    
    @scala.inline
    def setShowCaret(value: Boolean): Self = this.set("showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCaret: Self = this.set("showCaret", js.undefined)
    
    @scala.inline
    def setShowClearDates(value: Boolean): Self = this.set("showClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearDates: Self = this.set("showClearDates", js.undefined)
    
    @scala.inline
    def setShowDefaultInputIcon(value: Boolean): Self = this.set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDefaultInputIcon: Self = this.set("showDefaultInputIcon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setStartDate(value: Moment): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartDateNull: Self = this.set("startDate", null)
    
    @scala.inline
    def setStartDateAriaLabel(value: String): Self = this.set("startDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateAriaLabel: Self = this.set("startDateAriaLabel", js.undefined)
    
    @scala.inline
    def setStartDateId(value: String): Self = this.set("startDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateId: Self = this.set("startDateId", js.undefined)
    
    @scala.inline
    def setStartDatePlaceholderText(value: String): Self = this.set("startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDatePlaceholderText: Self = this.set("startDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = this.set("verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalSpacing: Self = this.set("verticalSpacing", js.undefined)
    
    @scala.inline
    def setWithFullScreenPortal(value: Boolean): Self = this.set("withFullScreenPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithFullScreenPortal: Self = this.set("withFullScreenPortal", js.undefined)
  }
}
