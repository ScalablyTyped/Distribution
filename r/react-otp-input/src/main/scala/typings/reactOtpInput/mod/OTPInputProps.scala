package typings.reactOtpInput.mod

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OTPInputProps extends js.Object {
  
  var containerStyle: js.UndefOr[String | CSSProperties] = js.native
  
  var disabledStyle: js.UndefOr[String | CSSProperties] = js.native
  
  var errorStyle: js.UndefOr[String | CSSProperties] = js.native
  
  var focusStyle: js.UndefOr[String | CSSProperties] = js.native
  
  var hasErrored: js.UndefOr[Boolean] = js.native
  
  var inputStyle: js.UndefOr[String | CSSProperties] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var isInputNum: js.UndefOr[Boolean] = js.native
  
  var numInputs: Double = js.native
  
  var onChange: js.Any = js.native
  
  var separator: js.UndefOr[Element] = js.native
  
  var shouldAutoFocus: js.UndefOr[Boolean] = js.native
  
  var value: Double | String = js.native
}
object OTPInputProps {
  
  @scala.inline
  def apply(numInputs: Double, onChange: js.Any, value: Double | String): OTPInputProps = {
    val __obj = js.Dynamic.literal(numInputs = numInputs.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OTPInputProps]
  }
  
  @scala.inline
  implicit class OTPInputPropsOps[Self <: OTPInputProps] (val x: Self) extends AnyVal {
    
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
    def setNumInputs(value: Double): Self = this.set("numInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: js.Any): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyle(value: String | CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyle(value: String | CSSProperties): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: String | CSSProperties): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    
    @scala.inline
    def setFocusStyle(value: String | CSSProperties): Self = this.set("focusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusStyle: Self = this.set("focusStyle", js.undefined)
    
    @scala.inline
    def setHasErrored(value: Boolean): Self = this.set("hasErrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasErrored: Self = this.set("hasErrored", js.undefined)
    
    @scala.inline
    def setInputStyle(value: String | CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsInputNum(value: Boolean): Self = this.set("isInputNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInputNum: Self = this.set("isInputNum", js.undefined)
    
    @scala.inline
    def setSeparator(value: Element): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setShouldAutoFocus(value: Boolean): Self = this.set("shouldAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldAutoFocus: Self = this.set("shouldAutoFocus", js.undefined)
  }
}
