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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleDatePickerInputShape extends js.Object {
  
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
  implicit class SingleDatePickerInputShapeOps[Self <: SingleDatePickerInputShape] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCustomCloseIcon(value: ReactNode): Self = this.set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCloseIcon: Self = this.set("customCloseIcon", js.undefined)
    
    @scala.inline
    def setCustomInputIcon(value: ReactNode): Self = this.set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInputIcon: Self = this.set("customInputIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setInputIconPosition(value: IconPositionShape): Self = this.set("inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIconPosition: Self = this.set("inputIconPosition", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* dateString */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClearDate(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClearDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClearDate: Self = this.set("onClearDate", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDownArrowDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownArrowDown: Self = this.set("onKeyDownArrowDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownQuestionMark(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownQuestionMark: Self = this.set("onKeyDownQuestionMark", js.undefined)
    
    @scala.inline
    def setOnKeyDownShiftTab(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownShiftTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownShiftTab: Self = this.set("onKeyDownShiftTab", js.undefined)
    
    @scala.inline
    def setOnKeyDownTab(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownTab: Self = this.set("onKeyDownTab", js.undefined)
    
    @scala.inline
    def setOpenDirection(value: OpenDirectionShape): Self = this.set("openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDirection: Self = this.set("openDirection", js.undefined)
    
    @scala.inline
    def setPhrases(value: SingleDatePickerInputPhrases): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRegular(value: Boolean): Self = this.set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegular: Self = this.set("regular", js.undefined)
    
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
    def setShowClearDate(value: Boolean): Self = this.set("showClearDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearDate: Self = this.set("showClearDate", js.undefined)
    
    @scala.inline
    def setShowDefaultInputIcon(value: Boolean): Self = this.set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDefaultInputIcon: Self = this.set("showDefaultInputIcon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = this.set("verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalSpacing: Self = this.set("verticalSpacing", js.undefined)
  }
}
