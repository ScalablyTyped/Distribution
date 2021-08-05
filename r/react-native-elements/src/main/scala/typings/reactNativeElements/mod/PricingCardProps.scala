package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingCardProps extends StObject {
  
  /**
    * {title, icon, buttonStyle}
    * Button information
    */
  var button: ButtonInformation
  
  /**
    * Color scheme for button & title
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Outer component styling
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Pricing information
    */
  var info: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * component info text style
    */
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Function to be run when button is pressed
    */
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Price
    */
  var price: String
  
  /**
    * component pricing text style
    */
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Title
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * component title style
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Inner wrapper component styling
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PricingCardProps {
  
  inline def apply(button: ButtonInformation, price: String): PricingCardProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingCardProps]
  }
  
  extension [Self <: PricingCardProps](x: Self) {
    
    inline def setButton(value: ButtonInformation): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setInfo(value: js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "infoStyle", value.asInstanceOf[js.Any])
    
    inline def setInfoStyleNull: Self = StObject.set(x, "infoStyle", null)
    
    inline def setInfoStyleUndefined: Self = StObject.set(x, "infoStyle", js.undefined)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value :_*))
    
    inline def setOnButtonPress(value: () => Unit): Self = StObject.set(x, "onButtonPress", js.Any.fromFunction0(value))
    
    inline def setOnButtonPressUndefined: Self = StObject.set(x, "onButtonPress", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPricingStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "pricingStyle", value.asInstanceOf[js.Any])
    
    inline def setPricingStyleNull: Self = StObject.set(x, "pricingStyle", null)
    
    inline def setPricingStyleUndefined: Self = StObject.set(x, "pricingStyle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
