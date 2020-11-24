package typings.reactNativeWindows

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactNativeWindows.anon.Children
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExt", JSImport.Namespace)
@js.native
object keyboardExtMod extends js.Object {
  
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
}
