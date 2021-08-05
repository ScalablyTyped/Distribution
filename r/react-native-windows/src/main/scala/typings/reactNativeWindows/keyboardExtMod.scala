package typings.reactNativeWindows

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactNativeWindows.anon.Children
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardExtMod {
  
  @JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def supportKeyboard[P /* <: js.Object */](WrappedComponent: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[P & IKeyboardProps & Children]) & RefAttributes[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportKeyboard")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[(PropsWithoutRef[P & IKeyboardProps & Children]) & RefAttributes[js.Any]]]
}
