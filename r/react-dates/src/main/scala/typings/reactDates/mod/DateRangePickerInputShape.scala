package typings.reactDates.mod

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangePickerInputShape extends StObject {
  
  var block: js.UndefOr[Boolean] = js.undefined
  
  var customArrowIcon: js.UndefOr[ReactNode] = js.undefined
  
  var customCloseIcon: js.UndefOr[ReactNode] = js.undefined
  
  var customInputIcon: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[DisabledShape] = js.undefined
  
  var endDate: js.UndefOr[String] = js.undefined
  
  var endDateAriaLabel: js.UndefOr[String] = js.undefined
  
  var endDateId: js.UndefOr[String] = js.undefined
  
  var endDatePlaceholderText: js.UndefOr[String] = js.undefined
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.undefined
  
  var isEndDateFocused: js.UndefOr[Boolean] = js.undefined
  
  // accessibility
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var isRTL: js.UndefOr[Boolean] = js.undefined
  
  var isStartDateFocused: js.UndefOr[Boolean] = js.undefined
  
  var noBorder: js.UndefOr[Boolean] = js.undefined
  
  var onClearDates: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  
  var onEndDateChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.undefined
  
  var onEndDateFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  
  var onEndDateTab: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var onKeyDownArrowDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var onKeyDownQuestionMark: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var onStartDateChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.undefined
  
  var onStartDateFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  
  var onStartDateShiftTab: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.undefined
  
  // describes actual DOM focus
  // i18n
  var phrases: js.UndefOr[DateRangePickerInputPhrases] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var regular: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var screenReaderMessage: js.UndefOr[String] = js.undefined
  
  var showCaret: js.UndefOr[Boolean] = js.undefined
  
  var showClearDates: js.UndefOr[Boolean] = js.undefined
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.undefined
  
  var small: js.UndefOr[Boolean] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
  
  var startDateAriaLabel: js.UndefOr[String] = js.undefined
  
  var startDateId: js.UndefOr[String] = js.undefined
  
  var startDatePlaceholderText: js.UndefOr[String] = js.undefined
  
  var verticalSpacing: js.UndefOr[Double] = js.undefined
}
object DateRangePickerInputShape {
  
  @scala.inline
  def apply(): DateRangePickerInputShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputShape]
  }
  
  @scala.inline
  implicit class DateRangePickerInputShapeMutableBuilder[Self <: DateRangePickerInputShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setCustomArrowIcon(value: ReactNode): Self = StObject.set(x, "customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomArrowIconUndefined: Self = StObject.set(x, "customArrowIcon", js.undefined)
    
    @scala.inline
    def setCustomCloseIcon(value: ReactNode): Self = StObject.set(x, "customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCloseIconUndefined: Self = StObject.set(x, "customCloseIcon", js.undefined)
    
    @scala.inline
    def setCustomInputIcon(value: ReactNode): Self = StObject.set(x, "customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInputIconUndefined: Self = StObject.set(x, "customInputIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: DisabledShape): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateAriaLabel(value: String): Self = StObject.set(x, "endDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateAriaLabelUndefined: Self = StObject.set(x, "endDateAriaLabel", js.undefined)
    
    @scala.inline
    def setEndDateId(value: String): Self = StObject.set(x, "endDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateIdUndefined: Self = StObject.set(x, "endDateId", js.undefined)
    
    @scala.inline
    def setEndDatePlaceholderText(value: String): Self = StObject.set(x, "endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDatePlaceholderTextUndefined: Self = StObject.set(x, "endDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setInputIconPosition(value: IconPositionShape): Self = StObject.set(x, "inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIconPositionUndefined: Self = StObject.set(x, "inputIconPosition", js.undefined)
    
    @scala.inline
    def setIsEndDateFocused(value: Boolean): Self = StObject.set(x, "isEndDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEndDateFocusedUndefined: Self = StObject.set(x, "isEndDateFocused", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    @scala.inline
    def setIsStartDateFocused(value: Boolean): Self = StObject.set(x, "isStartDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStartDateFocusedUndefined: Self = StObject.set(x, "isStartDateFocused", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    @scala.inline
    def setOnClearDates(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClearDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClearDatesUndefined: Self = StObject.set(x, "onClearDates", js.undefined)
    
    @scala.inline
    def setOnEndDateChange(value: /* dateString */ String => Unit): Self = StObject.set(x, "onEndDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndDateChangeUndefined: Self = StObject.set(x, "onEndDateChange", js.undefined)
    
    @scala.inline
    def setOnEndDateFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEndDateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndDateFocusUndefined: Self = StObject.set(x, "onEndDateFocus", js.undefined)
    
    @scala.inline
    def setOnEndDateTab(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEndDateTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndDateTabUndefined: Self = StObject.set(x, "onEndDateTab", js.undefined)
    
    @scala.inline
    def setOnKeyDownArrowDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownArrowDownUndefined: Self = StObject.set(x, "onKeyDownArrowDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownQuestionMark(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownQuestionMarkUndefined: Self = StObject.set(x, "onKeyDownQuestionMark", js.undefined)
    
    @scala.inline
    def setOnStartDateChange(value: /* dateString */ String => Unit): Self = StObject.set(x, "onStartDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartDateChangeUndefined: Self = StObject.set(x, "onStartDateChange", js.undefined)
    
    @scala.inline
    def setOnStartDateFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onStartDateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartDateFocusUndefined: Self = StObject.set(x, "onStartDateFocus", js.undefined)
    
    @scala.inline
    def setOnStartDateShiftTab(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onStartDateShiftTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartDateShiftTabUndefined: Self = StObject.set(x, "onStartDateShiftTab", js.undefined)
    
    @scala.inline
    def setOpenDirection(value: OpenDirectionShape): Self = StObject.set(x, "openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDirectionUndefined: Self = StObject.set(x, "openDirection", js.undefined)
    
    @scala.inline
    def setPhrases(value: DateRangePickerInputPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRegular(value: Boolean): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setScreenReaderMessage(value: String): Self = StObject.set(x, "screenReaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenReaderMessageUndefined: Self = StObject.set(x, "screenReaderMessage", js.undefined)
    
    @scala.inline
    def setShowCaret(value: Boolean): Self = StObject.set(x, "showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCaretUndefined: Self = StObject.set(x, "showCaret", js.undefined)
    
    @scala.inline
    def setShowClearDates(value: Boolean): Self = StObject.set(x, "showClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearDatesUndefined: Self = StObject.set(x, "showClearDates", js.undefined)
    
    @scala.inline
    def setShowDefaultInputIcon(value: Boolean): Self = StObject.set(x, "showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDefaultInputIconUndefined: Self = StObject.set(x, "showDefaultInputIcon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateAriaLabel(value: String): Self = StObject.set(x, "startDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateAriaLabelUndefined: Self = StObject.set(x, "startDateAriaLabel", js.undefined)
    
    @scala.inline
    def setStartDateId(value: String): Self = StObject.set(x, "startDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateIdUndefined: Self = StObject.set(x, "startDateId", js.undefined)
    
    @scala.inline
    def setStartDatePlaceholderText(value: String): Self = StObject.set(x, "startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDatePlaceholderTextUndefined: Self = StObject.set(x, "startDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
  }
}
