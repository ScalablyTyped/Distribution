package typings.reactNativeSimpleRadioButton.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonLabelProps extends DefaultRadioFormProps {
  
  var index: Double = js.native
  
  var labelHorizontal: js.UndefOr[Boolean] = js.native
  
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var labelWrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var obj: js.Object = js.native
}
object RadioButtonLabelProps {
  
  @scala.inline
  def apply(index: Double, obj: js.Object): RadioButtonLabelProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonLabelProps]
  }
  
  @scala.inline
  implicit class RadioButtonLabelPropsOps[Self <: RadioButtonLabelProps] (val x: Self) extends AnyVal {
    
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
    def setLabelHorizontal(value: Boolean): Self = this.set("labelHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHorizontal: Self = this.set("labelHorizontal", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    
    @scala.inline
    def setLabelWrapStyle(value: StyleProp[ViewStyle]): Self = this.set("labelWrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWrapStyle: Self = this.set("labelWrapStyle", js.undefined)
    
    @scala.inline
    def setLabelWrapStyleNull: Self = this.set("labelWrapStyle", null)
  }
}
