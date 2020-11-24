package typings.reactNativeSimpleRadioButton.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonInputProps extends DefaultRadioFormProps {
  
  var buttonInnerColor: js.UndefOr[String] = js.native
  
  var buttonOuterColor: js.UndefOr[String] = js.native
  
  var buttonOuterSize: js.UndefOr[Double] = js.native
  
  var buttonSize: js.UndefOr[Double] = js.native
  
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var buttonWrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var index: Double = js.native
  
  var isSelected: js.UndefOr[Boolean] = js.native
  
  var obj: js.Object = js.native
}
object RadioButtonInputProps {
  
  @scala.inline
  def apply(index: Double, obj: js.Object): RadioButtonInputProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonInputProps]
  }
  
  @scala.inline
  implicit class RadioButtonInputPropsOps[Self <: RadioButtonInputProps] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: js.Object): Self = this.set("obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonInnerColor(value: String): Self = this.set("buttonInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonInnerColor: Self = this.set("buttonInnerColor", js.undefined)
    
    @scala.inline
    def setButtonOuterColor(value: String): Self = this.set("buttonOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonOuterColor: Self = this.set("buttonOuterColor", js.undefined)
    
    @scala.inline
    def setButtonOuterSize(value: Double): Self = this.set("buttonOuterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonOuterSize: Self = this.set("buttonOuterSize", js.undefined)
    
    @scala.inline
    def setButtonSize(value: Double): Self = this.set("buttonSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonSize: Self = this.set("buttonSize", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    
    @scala.inline
    def setButtonStyleNull: Self = this.set("buttonStyle", null)
    
    @scala.inline
    def setButtonWrapStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonWrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonWrapStyle: Self = this.set("buttonWrapStyle", js.undefined)
    
    @scala.inline
    def setButtonWrapStyleNull: Self = this.set("buttonWrapStyle", null)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
}
