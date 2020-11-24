package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import typings.reactNativeMaterialKit.mod.MKPropTypes.font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNativeMaterialKit.mod.FloatingLabelProperties because var conflicts: allowFontScaling. Inlined floatingLabelEnabled, floatingLabelAniDuration, floatingLabelBottomMargin, floatingLabelFont */ @js.native
trait MKTextFieldProperties extends TextInputProps {
  
  var additionalInputProps: js.UndefOr[TextInputProps] = js.native
  
  var floatingLabelAniDuration: js.UndefOr[Double] = js.native
  
  var floatingLabelBottomMargin: js.UndefOr[Double] = js.native
  
  var floatingLabelEnabled: js.UndefOr[Boolean] = js.native
  
  var floatingLabelFont: js.UndefOr[font] = js.native
  
  var highlightColor: js.UndefOr[String] = js.native
  
  var onTextChange: js.UndefOr[js.Function1[/* val */ String, Unit]] = js.native
  
  var password: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textInputStyle: js.UndefOr[TextStyle] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
  
  var underlineEnabled: js.UndefOr[Boolean] = js.native
  
  var underlineSize: js.UndefOr[Double] = js.native
}
object MKTextFieldProperties {
  
  @scala.inline
  def apply(): MKTextFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKTextFieldProperties]
  }
  
  @scala.inline
  implicit class MKTextFieldPropertiesOps[Self <: MKTextFieldProperties] (val x: Self) extends AnyVal {
    
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
    def setAdditionalInputProps(value: TextInputProps): Self = this.set("additionalInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalInputProps: Self = this.set("additionalInputProps", js.undefined)
    
    @scala.inline
    def setFloatingLabelAniDuration(value: Double): Self = this.set("floatingLabelAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelAniDuration: Self = this.set("floatingLabelAniDuration", js.undefined)
    
    @scala.inline
    def setFloatingLabelBottomMargin(value: Double): Self = this.set("floatingLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelBottomMargin: Self = this.set("floatingLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setFloatingLabelEnabled(value: Boolean): Self = this.set("floatingLabelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelEnabled: Self = this.set("floatingLabelEnabled", js.undefined)
    
    @scala.inline
    def setFloatingLabelFont(value: font): Self = this.set("floatingLabelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelFont: Self = this.set("floatingLabelFont", js.undefined)
    
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    
    @scala.inline
    def setOnTextChange(value: /* val */ String => Unit): Self = this.set("onTextChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTextChange: Self = this.set("onTextChange", js.undefined)
    
    @scala.inline
    def setPassword(value: Boolean): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextInputStyle(value: TextStyle): Self = this.set("textInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextInputStyle: Self = this.set("textInputStyle", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setUnderlineEnabled(value: Boolean): Self = this.set("underlineEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineEnabled: Self = this.set("underlineEnabled", js.undefined)
    
    @scala.inline
    def setUnderlineSize(value: Double): Self = this.set("underlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineSize: Self = this.set("underlineSize", js.undefined)
  }
}
