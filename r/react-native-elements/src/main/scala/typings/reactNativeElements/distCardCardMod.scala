package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.ForwardRefExoticComponentDefaultProps
import typings.reactNativeElements.anon.FunctionComponentPickCard
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardCardMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/card/Card", JSImport.Default)
  @js.native
  val default: FunctionComponentPickCard | ForwardRefExoticComponentDefaultProps = js.native
  
  @JSImport("react-native-elements/dist/card/Card", "Card")
  @js.native
  val Card: typings.reactNativeElements.distCardCardMod.Card = js.native
  type Card = RneFunctionComponent[CardProps]
  
  trait CardProps extends StObject {
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FunctionComponentPickCard | ForwardRefExoticComponentDefaultProps
  
  /* This means you don't have to write `default`, but can instead just say `distCardCardMod.foo` */
  override def _to: FunctionComponentPickCard | ForwardRefExoticComponentDefaultProps = default
}
