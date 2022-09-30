package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.NativeMethods
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.TimerMixin */ @JSImport("react-native-windows/rntypes", "TextInput")
@js.native
open class TextInput ()
  extends Component[TextInputProps, js.Object, Any] {
  
  /**
    * Removes all text from the input.
    */
  def clear(): Unit = js.native
  
  /**
    * Returns if the input is currently focused.
    */
  def isFocused(): Boolean = js.native
}
/* static members */
object TextInput {
  
  @JSImport("react-native-windows/rntypes", "TextInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Access the current focus state.
    */
  @JSImport("react-native-windows/rntypes", "TextInput.State")
  @js.native
  def State: TextInputState = js.native
  inline def State_=(x: TextInputState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("State")(x.asInstanceOf[js.Any])
}
