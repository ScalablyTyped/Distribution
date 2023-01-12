package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distButtonsButtonMod.ButtonProps
import typings.reactNativeElements.distPricingPricingCardMod.ButtonInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/pricing/PricingCard.PricingCardProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/pricing/PricingCard.PricingCardProps>> */
trait PricingCardPropsPartialTh extends StObject {
  
  var button: js.UndefOr[ButtonProps | ButtonInformation] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var info: js.UndefOr[js.Array[String]] = js.undefined
  
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var price: js.UndefOr[String | Double] = js.undefined
  
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var replaceTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
  
  var theme: js.UndefOr[ThemePricingCardProps] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var updateTheme: js.UndefOr[js.Function1[/* updates */ RecursivePartialFullTheme, Unit]] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object PricingCardPropsPartialTh {
  
  inline def apply(): PricingCardPropsPartialTh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingCardPropsPartialTh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PricingCardPropsPartialTh] (val x: Self) extends AnyVal {
    
    inline def setButton(value: ButtonProps | ButtonInformation): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
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
    
    inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
    
    inline def setOnButtonPress(value: () => Unit): Self = StObject.set(x, "onButtonPress", js.Any.fromFunction0(value))
    
    inline def setOnButtonPressUndefined: Self = StObject.set(x, "onButtonPress", js.undefined)
    
    inline def setPrice(value: String | Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPricingStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "pricingStyle", value.asInstanceOf[js.Any])
    
    inline def setPricingStyleNull: Self = StObject.set(x, "pricingStyle", null)
    
    inline def setPricingStyleUndefined: Self = StObject.set(x, "pricingStyle", js.undefined)
    
    inline def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1(value))
    
    inline def setReplaceThemeUndefined: Self = StObject.set(x, "replaceTheme", js.undefined)
    
    inline def setTheme(value: ThemePricingCardProps): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
    
    inline def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
