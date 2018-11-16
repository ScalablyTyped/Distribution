package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped TsTypeConstructor() */ @JSImport("react-native", "TextInput")
@js.native
class TextInput () extends js.Object {
  /**
       * Removes all text from the input.
       */
  def clear(): scala.Unit = js.native
  /**
       * Returns if the input is currently focused.
       */
  def isFocused(): scala.Boolean = js.native
}

/* RemoveDifficultInheritance: 
- Dropped TsTypeConstructor() */ @JSImport("react-native", "TextInput")
@js.native
object TextInput extends js.Object {
  /**
       * Access the current focus state.
       */
  var State: reactDashNativeLib.reactDashNativeMod.TextInputState = js.native
}

