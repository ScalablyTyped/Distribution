package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeInputMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/CodeInput", JSImport.Default)
  @js.native
  val default: FC[DialogCodeInputProps] = js.native
  
  trait DialogCodeInputProps
    extends StObject
       with TextInputProps {
    
    var codeLength: js.UndefOr[Double] = js.undefined
    
    var digitContainerFocusedStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var digitContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var digitStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var onCodeChange: js.UndefOr[js.Function1[/* code */ String, Unit]] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object DialogCodeInputProps {
    
    inline def apply(): DialogCodeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogCodeInputProps]
    }
    
    extension [Self <: DialogCodeInputProps](x: Self) {
      
      inline def setCodeLength(value: Double): Self = StObject.set(x, "codeLength", value.asInstanceOf[js.Any])
      
      inline def setCodeLengthUndefined: Self = StObject.set(x, "codeLength", js.undefined)
      
      inline def setDigitContainerFocusedStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "digitContainerFocusedStyle", value.asInstanceOf[js.Any])
      
      inline def setDigitContainerFocusedStyleNull: Self = StObject.set(x, "digitContainerFocusedStyle", null)
      
      inline def setDigitContainerFocusedStyleUndefined: Self = StObject.set(x, "digitContainerFocusedStyle", js.undefined)
      
      inline def setDigitContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "digitContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setDigitContainerStyleNull: Self = StObject.set(x, "digitContainerStyle", null)
      
      inline def setDigitContainerStyleUndefined: Self = StObject.set(x, "digitContainerStyle", js.undefined)
      
      inline def setDigitStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "digitStyle", value.asInstanceOf[js.Any])
      
      inline def setDigitStyleNull: Self = StObject.set(x, "digitStyle", null)
      
      inline def setDigitStyleUndefined: Self = StObject.set(x, "digitStyle", js.undefined)
      
      inline def setOnCodeChange(value: /* code */ String => Unit): Self = StObject.set(x, "onCodeChange", js.Any.fromFunction1(value))
      
      inline def setOnCodeChangeUndefined: Self = StObject.set(x, "onCodeChange", js.undefined)
      
      inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FC[DialogCodeInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `codeInputMod.foo` */
  override def _to: FC[DialogCodeInputProps] = default
}
