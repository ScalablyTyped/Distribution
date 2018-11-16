package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "FormInput")
@js.native
class FormInput ()
  extends reactLib.reactMod.Component[FormInputProps, js.Any, js.Any] {
  /**
       * Holds reference to the stored input.
       */
  var input: reactDashNativeLib.reactDashNativeMod.TextInput = js.native
  /**
       * Call blur on the TextInput
       */
  def blur(): scala.Unit = js.native
  /**
       * Call clear on the TextInput
       */
  def clearText(): scala.Unit = js.native
  /**
       * Call focus on the TextInput
       */
  def focus(): scala.Unit = js.native
  /**
       * Shake the TextInput
       *
       * eg `this.formInputRef.shake()`
       */
  def shake(): scala.Unit = js.native
}

