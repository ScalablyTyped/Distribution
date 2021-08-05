package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.reactDates.anon.EndDate
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-dates.react-dates.DateRangePickerInputShape, 'startDateId' | 'startDatePlaceholderText' | 'isStartDateFocused' | 'startDateAriaLabel' | 'endDateId' | 'endDatePlaceholderText' | 'isEndDateFocused' | 'endDateAriaLabel' | 'screenReaderMessage' | 'showClearDates' | 'showCaret' | 'showDefaultInputIcon' | 'inputIconPosition' | 'disabled' | 'required' | 'readOnly' | 'openDirection' | 'noBorder' | 'block' | 'small' | 'regular' | 'verticalSpacing' | 'onKeyDownArrowDown' | 'onKeyDownQuestionMark' | 'customInputIcon' | 'customArrowIcon' | 'customCloseIcon' | 'isFocused' | 'phrases' | 'isRTL'> */
trait DateRangePickerInputControllerShape extends StObject {
  
  var block: js.UndefOr[Boolean] = js.undefined
  
  var customArrowIcon: js.UndefOr[ReactNode] = js.undefined
  
  var customCloseIcon: js.UndefOr[ReactNode] = js.undefined
  
  var customInputIcon: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[DisabledShape] = js.undefined
  
  var displayFormat: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  var endDate: js.UndefOr[Moment | Null] = js.undefined
  
  var endDateAriaLabel: js.UndefOr[String] = js.undefined
  
  var endDateId: js.UndefOr[String] = js.undefined
  
  var endDatePlaceholderText: js.UndefOr[String] = js.undefined
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.undefined
  
  var isEndDateFocused: js.UndefOr[Boolean] = js.undefined
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.undefined
  
  var isRTL: js.UndefOr[Boolean] = js.undefined
  
  var isStartDateFocused: js.UndefOr[Boolean] = js.undefined
  
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.undefined
  
  var minimumNights: js.UndefOr[Double] = js.undefined
  
  var noBorder: js.UndefOr[Boolean] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* final */ EndDate, Unit]] = js.undefined
  
  var onDatesChange: js.UndefOr[js.Function1[/* arg */ EndDate, Unit]] = js.undefined
  
  var onFocusChange: js.UndefOr[js.Function1[/* arg */ FocusedInputShape | Null, Unit]] = js.undefined
  
  var onKeyDownArrowDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var onKeyDownQuestionMark: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.undefined
  
  var phrases: js.UndefOr[DateRangePickerInputPhrases] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var regular: js.UndefOr[Boolean] = js.undefined
  
  var reopenPickerOnClearDates: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var screenReaderMessage: js.UndefOr[String] = js.undefined
  
  var showCaret: js.UndefOr[Boolean] = js.undefined
  
  var showClearDates: js.UndefOr[Boolean] = js.undefined
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.undefined
  
  var small: js.UndefOr[Boolean] = js.undefined
  
  var startDate: js.UndefOr[Moment | Null] = js.undefined
  
  var startDateAriaLabel: js.UndefOr[String] = js.undefined
  
  var startDateId: js.UndefOr[String] = js.undefined
  
  var startDatePlaceholderText: js.UndefOr[String] = js.undefined
  
  var verticalSpacing: js.UndefOr[Double] = js.undefined
  
  var withFullScreenPortal: js.UndefOr[Boolean] = js.undefined
}
object DateRangePickerInputControllerShape {
  
  inline def apply(): DateRangePickerInputControllerShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputControllerShape]
  }
  
  extension [Self <: DateRangePickerInputControllerShape](x: Self) {
    
    inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setCustomArrowIcon(value: ReactNode): Self = StObject.set(x, "customArrowIcon", value.asInstanceOf[js.Any])
    
    inline def setCustomArrowIconUndefined: Self = StObject.set(x, "customArrowIcon", js.undefined)
    
    inline def setCustomCloseIcon(value: ReactNode): Self = StObject.set(x, "customCloseIcon", value.asInstanceOf[js.Any])
    
    inline def setCustomCloseIconUndefined: Self = StObject.set(x, "customCloseIcon", js.undefined)
    
    inline def setCustomInputIcon(value: ReactNode): Self = StObject.set(x, "customInputIcon", value.asInstanceOf[js.Any])
    
    inline def setCustomInputIconUndefined: Self = StObject.set(x, "customInputIcon", js.undefined)
    
    inline def setDisabled(value: DisabledShape): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayFormat(value: String | js.Function0[String]): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatFunction0(value: () => String): Self = StObject.set(x, "displayFormat", js.Any.fromFunction0(value))
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
    
    inline def setEndDate(value: Moment): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateAriaLabel(value: String): Self = StObject.set(x, "endDateAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setEndDateAriaLabelUndefined: Self = StObject.set(x, "endDateAriaLabel", js.undefined)
    
    inline def setEndDateId(value: String): Self = StObject.set(x, "endDateId", value.asInstanceOf[js.Any])
    
    inline def setEndDateIdUndefined: Self = StObject.set(x, "endDateId", js.undefined)
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDatePlaceholderText(value: String): Self = StObject.set(x, "endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    inline def setEndDatePlaceholderTextUndefined: Self = StObject.set(x, "endDatePlaceholderText", js.undefined)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setInputIconPosition(value: IconPositionShape): Self = StObject.set(x, "inputIconPosition", value.asInstanceOf[js.Any])
    
    inline def setInputIconPositionUndefined: Self = StObject.set(x, "inputIconPosition", js.undefined)
    
    inline def setIsEndDateFocused(value: Boolean): Self = StObject.set(x, "isEndDateFocused", value.asInstanceOf[js.Any])
    
    inline def setIsEndDateFocusedUndefined: Self = StObject.set(x, "isEndDateFocused", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setIsOutsideRange(value: /* day */ Moment => Boolean): Self = StObject.set(x, "isOutsideRange", js.Any.fromFunction1(value))
    
    inline def setIsOutsideRangeUndefined: Self = StObject.set(x, "isOutsideRange", js.undefined)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    inline def setIsStartDateFocused(value: Boolean): Self = StObject.set(x, "isStartDateFocused", value.asInstanceOf[js.Any])
    
    inline def setIsStartDateFocusedUndefined: Self = StObject.set(x, "isStartDateFocused", js.undefined)
    
    inline def setKeepOpenOnDateSelect(value: Boolean): Self = StObject.set(x, "keepOpenOnDateSelect", value.asInstanceOf[js.Any])
    
    inline def setKeepOpenOnDateSelectUndefined: Self = StObject.set(x, "keepOpenOnDateSelect", js.undefined)
    
    inline def setMinimumNights(value: Double): Self = StObject.set(x, "minimumNights", value.asInstanceOf[js.Any])
    
    inline def setMinimumNightsUndefined: Self = StObject.set(x, "minimumNights", js.undefined)
    
    inline def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    inline def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    inline def setOnClose(value: /* final */ EndDate => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnDatesChange(value: /* arg */ EndDate => Unit): Self = StObject.set(x, "onDatesChange", js.Any.fromFunction1(value))
    
    inline def setOnDatesChangeUndefined: Self = StObject.set(x, "onDatesChange", js.undefined)
    
    inline def setOnFocusChange(value: /* arg */ FocusedInputShape | Null => Unit): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction1(value))
    
    inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
    
    inline def setOnKeyDownArrowDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownArrowDownUndefined: Self = StObject.set(x, "onKeyDownArrowDown", js.undefined)
    
    inline def setOnKeyDownQuestionMark(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownQuestionMarkUndefined: Self = StObject.set(x, "onKeyDownQuestionMark", js.undefined)
    
    inline def setOpenDirection(value: OpenDirectionShape): Self = StObject.set(x, "openDirection", value.asInstanceOf[js.Any])
    
    inline def setOpenDirectionUndefined: Self = StObject.set(x, "openDirection", js.undefined)
    
    inline def setPhrases(value: DateRangePickerInputPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRegular(value: Boolean): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    inline def setReopenPickerOnClearDates(value: Boolean): Self = StObject.set(x, "reopenPickerOnClearDates", value.asInstanceOf[js.Any])
    
    inline def setReopenPickerOnClearDatesUndefined: Self = StObject.set(x, "reopenPickerOnClearDates", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setScreenReaderMessage(value: String): Self = StObject.set(x, "screenReaderMessage", value.asInstanceOf[js.Any])
    
    inline def setScreenReaderMessageUndefined: Self = StObject.set(x, "screenReaderMessage", js.undefined)
    
    inline def setShowCaret(value: Boolean): Self = StObject.set(x, "showCaret", value.asInstanceOf[js.Any])
    
    inline def setShowCaretUndefined: Self = StObject.set(x, "showCaret", js.undefined)
    
    inline def setShowClearDates(value: Boolean): Self = StObject.set(x, "showClearDates", value.asInstanceOf[js.Any])
    
    inline def setShowClearDatesUndefined: Self = StObject.set(x, "showClearDates", js.undefined)
    
    inline def setShowDefaultInputIcon(value: Boolean): Self = StObject.set(x, "showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    inline def setShowDefaultInputIconUndefined: Self = StObject.set(x, "showDefaultInputIcon", js.undefined)
    
    inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setStartDate(value: Moment): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateAriaLabel(value: String): Self = StObject.set(x, "startDateAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setStartDateAriaLabelUndefined: Self = StObject.set(x, "startDateAriaLabel", js.undefined)
    
    inline def setStartDateId(value: String): Self = StObject.set(x, "startDateId", value.asInstanceOf[js.Any])
    
    inline def setStartDateIdUndefined: Self = StObject.set(x, "startDateId", js.undefined)
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDatePlaceholderText(value: String): Self = StObject.set(x, "startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    inline def setStartDatePlaceholderTextUndefined: Self = StObject.set(x, "startDatePlaceholderText", js.undefined)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
    
    inline def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
    
    inline def setWithFullScreenPortal(value: Boolean): Self = StObject.set(x, "withFullScreenPortal", value.asInstanceOf[js.Any])
    
    inline def setWithFullScreenPortalUndefined: Self = StObject.set(x, "withFullScreenPortal", js.undefined)
  }
}
