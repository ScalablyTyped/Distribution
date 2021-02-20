package typings.reactNativeWindows

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactNativeWindows.anon.Children
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardExtMod {
  
  @JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExt", "supportKeyboard")
  @js.native
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
}
