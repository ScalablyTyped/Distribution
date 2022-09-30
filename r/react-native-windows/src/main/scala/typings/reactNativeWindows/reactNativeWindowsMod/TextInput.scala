package typings.reactNativeWindows.reactNativeWindowsMod

import typings.reactNativeWindows.rntypesMod.TextInputState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "TextInput")
@js.native
open class TextInput ()
  extends typings.reactNativeWindows.rntypesMod.TextInput
/* static members */
object TextInput {
  
  @JSImport("react-native-windows", "TextInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Access the current focus state.
    */
  @JSImport("react-native-windows", "TextInput.State")
  @js.native
  def State: TextInputState = js.native
  inline def State_=(x: TextInputState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("State")(x.asInstanceOf[js.Any])
}
