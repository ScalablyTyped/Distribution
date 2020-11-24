package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeStatic extends js.Object {
  
  var accentColor: js.UndefOr[String] = js.native
  
  var accentColorRGB: js.UndefOr[String] = js.native
  
  var bgDisabled: js.UndefOr[String] = js.native
  
  var bgPlain: js.UndefOr[String] = js.native
  
  var cardActionStyle: js.UndefOr[CardActionStyle] = js.native
  
  var cardContentStyle: js.UndefOr[CardContentStyle] = js.native
  
  var cardImageStyle: js.UndefOr[CardImageStyle] = js.native
  
  var cardMenuStyle: js.UndefOr[CardMenuStyle] = js.native
  
  var cardStyle: js.UndefOr[CardStyle] = js.native
  
  var cardTitleStyle: js.UndefOr[CardTitleStyle] = js.native
  
  var checkboxStyle: js.UndefOr[CheckboxStyle] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var iconToggleStyle: js.UndefOr[IconToggleStyle] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var primaryColorRGB: js.UndefOr[String] = js.native
  
  var progressStyle: js.UndefOr[ProgressStyle] = js.native
  
  var radioStyle: js.UndefOr[RadioStyle] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
  
  var sliderStyle: js.UndefOr[SliderStyle] = js.native
  
  var spinnerStyle: js.UndefOr[SpinnerStyle] = js.native
  
  var switchStyle: js.UndefOr[SwitchStyle] = js.native
  
  var textfieldStyle: js.UndefOr[TextFieldStyle] = js.native
}
object ThemeStatic {
  
  @scala.inline
  def apply(): ThemeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeStatic]
  }
  
  @scala.inline
  implicit class ThemeStaticOps[Self <: ThemeStatic] (val x: Self) extends AnyVal {
    
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    
    @scala.inline
    def setAccentColorRGB(value: String): Self = this.set("accentColorRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentColorRGB: Self = this.set("accentColorRGB", js.undefined)
    
    @scala.inline
    def setBgDisabled(value: String): Self = this.set("bgDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgDisabled: Self = this.set("bgDisabled", js.undefined)
    
    @scala.inline
    def setBgPlain(value: String): Self = this.set("bgPlain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgPlain: Self = this.set("bgPlain", js.undefined)
    
    @scala.inline
    def setCardActionStyle(value: CardActionStyle): Self = this.set("cardActionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardActionStyle: Self = this.set("cardActionStyle", js.undefined)
    
    @scala.inline
    def setCardContentStyle(value: CardContentStyle): Self = this.set("cardContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardContentStyle: Self = this.set("cardContentStyle", js.undefined)
    
    @scala.inline
    def setCardImageStyle(value: CardImageStyle): Self = this.set("cardImageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardImageStyle: Self = this.set("cardImageStyle", js.undefined)
    
    @scala.inline
    def setCardMenuStyle(value: CardMenuStyle): Self = this.set("cardMenuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardMenuStyle: Self = this.set("cardMenuStyle", js.undefined)
    
    @scala.inline
    def setCardStyle(value: CardStyle): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    
    @scala.inline
    def setCardTitleStyle(value: CardTitleStyle): Self = this.set("cardTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardTitleStyle: Self = this.set("cardTitleStyle", js.undefined)
    
    @scala.inline
    def setCheckboxStyle(value: CheckboxStyle): Self = this.set("checkboxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxStyle: Self = this.set("checkboxStyle", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setIconToggleStyle(value: IconToggleStyle): Self = this.set("iconToggleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconToggleStyle: Self = this.set("iconToggleStyle", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setPrimaryColorRGB(value: String): Self = this.set("primaryColorRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColorRGB: Self = this.set("primaryColorRGB", js.undefined)
    
    @scala.inline
    def setProgressStyle(value: ProgressStyle): Self = this.set("progressStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressStyle: Self = this.set("progressStyle", js.undefined)
    
    @scala.inline
    def setRadioStyle(value: RadioStyle): Self = this.set("radioStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioStyle: Self = this.set("radioStyle", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    
    @scala.inline
    def setSliderStyle(value: SliderStyle): Self = this.set("sliderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderStyle: Self = this.set("sliderStyle", js.undefined)
    
    @scala.inline
    def setSpinnerStyle(value: SpinnerStyle): Self = this.set("spinnerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerStyle: Self = this.set("spinnerStyle", js.undefined)
    
    @scala.inline
    def setSwitchStyle(value: SwitchStyle): Self = this.set("switchStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchStyle: Self = this.set("switchStyle", js.undefined)
    
    @scala.inline
    def setTextfieldStyle(value: TextFieldStyle): Self = this.set("textfieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextfieldStyle: Self = this.set("textfieldStyle", js.undefined)
  }
}
