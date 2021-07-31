package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ButtonInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.PricingCardProps> */
trait PartialPricingCardProps extends StObject {
  
  var button: js.UndefOr[ButtonInformation] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var info: js.UndefOr[js.Array[String]] = js.undefined
  
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var price: js.UndefOr[String] = js.undefined
  
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PartialPricingCardProps {
  
  @scala.inline
  def apply(): PartialPricingCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPricingCardProps]
  }
  
  @scala.inline
  implicit class PartialPricingCardPropsMutableBuilder[Self <: PartialPricingCardProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: ButtonInformation): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setInfo(value: js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "infoStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoStyleNull: Self = StObject.set(x, "infoStyle", null)
    
    @scala.inline
    def setInfoStyleUndefined: Self = StObject.set(x, "infoStyle", js.undefined)
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value :_*))
    
    @scala.inline
    def setOnButtonPress(value: () => Unit): Self = StObject.set(x, "onButtonPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnButtonPressUndefined: Self = StObject.set(x, "onButtonPress", js.undefined)
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setPricingStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "pricingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingStyleNull: Self = StObject.set(x, "pricingStyle", null)
    
    @scala.inline
    def setPricingStyleUndefined: Self = StObject.set(x, "pricingStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
