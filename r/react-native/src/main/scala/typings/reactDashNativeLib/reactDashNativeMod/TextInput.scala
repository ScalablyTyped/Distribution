package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native", "TextInput")
@js.native
class TextInput ()
  extends reactLib.reactMod.Component[TextInputProps, js.Object, js.Any] {
  /**
    * Removes all text from the input.
    */
  def clear(): scala.Unit = js.native
  /**
    * Returns if the input is currently focused.
    */
  def isFocused(): scala.Boolean = js.native
}

/* static members */
@JSImport("react-native", "TextInput")
@js.native
object TextInput extends js.Object {
  /**
    * Access the current focus state.
    */
  var State: reactDashNativeLib.reactDashNativeMod.TextInputState = js.native
}

