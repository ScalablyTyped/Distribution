package typings.reactNativeElements

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.ButtonPropscolorstringund
import typings.reactNativeElements.anon.PickPricingCardPropsParti
import typings.reactNativeElements.anon.PricingCardPropsPartialTh
import typings.reactNativeElements.buttonMod.ButtonProps
import typings.reactNativeElements.helpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingCardMod {
  
  @JSImport("react-native-elements/dist/pricing/PricingCard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements/dist/pricing/PricingCard", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickPricingCardPropsParti] | ForwardRefExoticComponent[PricingCardPropsPartialTh] = js.native
  
  inline def PricingButton(props: ButtonPropscolorstringund): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PricingButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-elements/dist/pricing/PricingCard", "PricingCard")
  @js.native
  val PricingCard: RneFunctionComponent[PricingCardProps] = js.native
  
  trait ButtonInformation extends StObject {
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object ButtonInformation {
    
    inline def apply(title: String): ButtonInformation = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonInformation]
    }
    
    extension [Self <: ButtonInformation](x: Self) {
      
      inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    }
  }
  
  trait PricingCardProps extends StObject {
    
    var button: js.UndefOr[ButtonProps | ButtonInformation] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var info: js.UndefOr[js.Array[String]] = js.undefined
    
    var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var price: js.UndefOr[String | Double] = js.undefined
    
    var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PricingCardProps {
    
    inline def apply(): PricingCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PricingCardProps]
    }
    
    extension [Self <: PricingCardProps](x: Self) {
      
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
}
