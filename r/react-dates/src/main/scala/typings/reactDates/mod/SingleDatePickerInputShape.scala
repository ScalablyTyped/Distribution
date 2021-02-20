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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleDatePickerInputShape extends StObject {
  
  var ariaLabel: js.UndefOr[String] = js.native
  
  var block: js.UndefOr[Boolean] = js.native
  
  var customCloseIcon: js.UndefOr[ReactNode] = js.native
  
  var customInputIcon: js.UndefOr[ReactNode] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var displayValue: js.UndefOr[String] = js.native
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var noBorder: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.native
  
  var onClearDate: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownArrowDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownQuestionMark: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownShiftTab: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownTab: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  
  // i18n
  var phrases: js.UndefOr[SingleDatePickerInputPhrases] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var regular: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var screenReaderMessage: js.UndefOr[String] = js.native
  
  var showCaret: js.UndefOr[Boolean] = js.native
  
  var showClearDate: js.UndefOr[Boolean] = js.native
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  var verticalSpacing: js.UndefOr[Double] = js.native
}
object SingleDatePickerInputShape {
  
  @scala.inline
  def apply(id: String): SingleDatePickerInputShape = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleDatePickerInputShape]
  }
  
  @scala.inline
  implicit class SingleDatePickerInputShapeMutableBuilder[Self <: SingleDatePickerInputShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setCustomCloseIcon(value: ReactNode): Self = StObject.set(x, "customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCloseIconUndefined: Self = StObject.set(x, "customCloseIcon", js.undefined)
    
    @scala.inline
    def setCustomInputIcon(value: ReactNode): Self = StObject.set(x, "customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInputIconUndefined: Self = StObject.set(x, "customInputIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIconPosition(value: IconPositionShape): Self = StObject.set(x, "inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIconPositionUndefined: Self = StObject.set(x, "inputIconPosition", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* dateString */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClearDate(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClearDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClearDateUndefined: Self = StObject.set(x, "onClearDate", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDownArrowDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownArrowDownUndefined: Self = StObject.set(x, "onKeyDownArrowDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownQuestionMark(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownQuestionMarkUndefined: Self = StObject.set(x, "onKeyDownQuestionMark", js.undefined)
    
    @scala.inline
    def setOnKeyDownShiftTab(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownShiftTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownShiftTabUndefined: Self = StObject.set(x, "onKeyDownShiftTab", js.undefined)
    
    @scala.inline
    def setOnKeyDownTab(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownTabUndefined: Self = StObject.set(x, "onKeyDownTab", js.undefined)
    
    @scala.inline
    def setOpenDirection(value: OpenDirectionShape): Self = StObject.set(x, "openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDirectionUndefined: Self = StObject.set(x, "openDirection", js.undefined)
    
    @scala.inline
    def setPhrases(value: SingleDatePickerInputPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
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
    def setShowClearDate(value: Boolean): Self = StObject.set(x, "showClearDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearDateUndefined: Self = StObject.set(x, "showClearDate", js.undefined)
    
    @scala.inline
    def setShowDefaultInputIcon(value: Boolean): Self = StObject.set(x, "showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDefaultInputIconUndefined: Self = StObject.set(x, "showDefaultInputIcon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
  }
}
