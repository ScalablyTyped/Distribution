package typings.reactNativeSimpleRadioButton.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonProps extends js.Object {
  
  var buttonColor: js.UndefOr[String] = js.native
  
  var idSeparator: js.UndefOr[String] = js.native
  
  var isSelected: js.UndefOr[Boolean] = js.native
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelHorizontal: js.UndefOr[Boolean] = js.native
  
  var selectedButtonColor: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var wrapStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object RadioButtonProps {
  
  @scala.inline
  def apply(): RadioButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonProps]
  }
  
  @scala.inline
  implicit class RadioButtonPropsOps[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
    
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
    def setButtonColor(value: String): Self = this.set("buttonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonColor: Self = this.set("buttonColor", js.undefined)
    
    @scala.inline
    def setIdSeparator(value: String): Self = this.set("idSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdSeparator: Self = this.set("idSeparator", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelHorizontal(value: Boolean): Self = this.set("labelHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHorizontal: Self = this.set("labelHorizontal", js.undefined)
    
    @scala.inline
    def setSelectedButtonColor(value: String): Self = this.set("selectedButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedButtonColor: Self = this.set("selectedButtonColor", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setWrapStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapStyle: Self = this.set("wrapStyle", js.undefined)
    
    @scala.inline
    def setWrapStyleNull: Self = this.set("wrapStyle", null)
  }
}
