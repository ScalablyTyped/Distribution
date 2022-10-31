package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInput
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Input", JSImport.Default)
  @js.native
  val default: FC[DialogInputProps] = js.native
  
  trait DialogInputProps
    extends StObject
       with TextInputProps {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var textInputRef: js.UndefOr[LegacyRef[TextInput]] = js.undefined
    
    var unstableLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object DialogInputProps {
    
    inline def apply(): DialogInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogInputProps]
    }
    
    extension [Self <: DialogInputProps](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTextInputRef(value: LegacyRef[TextInput]): Self = StObject.set(x, "textInputRef", value.asInstanceOf[js.Any])
      
      inline def setTextInputRefFunction1(value: /* instance */ TextInput | Null => Unit): Self = StObject.set(x, "textInputRef", js.Any.fromFunction1(value))
      
      inline def setTextInputRefNull: Self = StObject.set(x, "textInputRef", null)
      
      inline def setTextInputRefUndefined: Self = StObject.set(x, "textInputRef", js.undefined)
      
      inline def setUnstableLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "unstableLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setUnstableLabelStyleNull: Self = StObject.set(x, "unstableLabelStyle", null)
      
      inline def setUnstableLabelStyleUndefined: Self = StObject.set(x, "unstableLabelStyle", js.undefined)
      
      inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FC[DialogInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `libInputMod.foo` */
  override def _to: FC[DialogInputProps] = default
}
