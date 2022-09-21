package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.RefAttributes
import typings.reactNativePaper.anon.ActiveOutlineColor
import typings.reactNativePaper.anon.PartialProps
import typings.reactNativePaper.anon.PickTextInputPropsRefAttr
import typings.reactNativePaper.anon.TextInputPropsRefAttribut
import typings.reactNativePaper.anon.TypeofNativeTextInput
import typings.reactNativePaper.textInputIconMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/TextInput", JSImport.Default)
  @js.native
  val default: ComponentType[PickTextInputPropsRefAttr] & (NonReactStatics[ComponentType[TextInputPropsRefAttribut] & CompoundedComponent, js.Object]) = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[TextInputProps & RefAttributes[TextInputHandles]] {
    
    var Affix: FunctionComponent[PartialProps] = js.native
    
    var Icon: FunctionComponent[Props] = js.native
  }
  
  /* Inlined std.Pick<react-native.react-native.TextInput, 'focus' | 'clear' | 'blur' | 'isFocused' | 'setNativeProps'> */
  trait TextInputHandles extends StObject {
    
    var blur: js.UndefOr[Any] = js.undefined
    
    var clear: js.Function0[Unit]
    
    var focus: js.UndefOr[Any] = js.undefined
    
    var isFocused: js.Function0[Boolean]
    
    var setNativeProps: js.UndefOr[Any] = js.undefined
  }
  object TextInputHandles {
    
    inline def apply(clear: () => Unit, isFocused: () => Boolean): TextInputHandles = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), isFocused = js.Any.fromFunction0(isFocused))
      __obj.asInstanceOf[TextInputHandles]
    }
    
    extension [Self <: TextInputHandles](x: Self) {
      
      inline def setBlur(value: Any): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setFocus(value: Any): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      inline def setSetNativeProps(value: Any): Self = StObject.set(x, "setNativeProps", value.asInstanceOf[js.Any])
      
      inline def setSetNativePropsUndefined: Self = StObject.set(x, "setNativeProps", js.undefined)
    }
  }
  
  type TextInputProps = ComponentPropsWithRef[TypeofNativeTextInput] & ActiveOutlineColor
  
  type _To = ComponentType[PickTextInputPropsRefAttr] & (NonReactStatics[ComponentType[TextInputPropsRefAttribut] & CompoundedComponent, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `textInputMod.foo` */
  override def _to: ComponentType[PickTextInputPropsRefAttr] & (NonReactStatics[ComponentType[TextInputPropsRefAttribut] & CompoundedComponent, js.Object]) = default
}
