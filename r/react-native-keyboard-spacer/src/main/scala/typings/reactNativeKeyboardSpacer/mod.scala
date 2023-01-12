package typings.reactNativeKeyboardSpacer

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-keyboard-spacer", JSImport.Default)
  @js.native
  open class default () extends Component[KeyboardSpacerProps, Any, Any]
  
  type KeyboardSpacer = Component[KeyboardSpacerProps, Any, Any]
  
  trait KeyboardSpacerProps extends StObject {
    
    var onToggle: js.UndefOr[js.Function2[/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double, Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var topSpacing: js.UndefOr[Double] = js.undefined
  }
  object KeyboardSpacerProps {
    
    inline def apply(): KeyboardSpacerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardSpacerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardSpacerProps] (val x: Self) extends AnyVal {
      
      inline def setOnToggle(value: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTopSpacing(value: Double): Self = StObject.set(x, "topSpacing", value.asInstanceOf[js.Any])
      
      inline def setTopSpacingUndefined: Self = StObject.set(x, "topSpacing", js.undefined)
    }
  }
}
