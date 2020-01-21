package typings.reactNativeMaterialTextfield.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-material-textfield", "TextField")
@js.native
class TextField ()
  extends Component[TextFieldProps, js.Any, js.Any] {
  /*
    * Release focus
    */
  def blur(): Unit = js.native
  /*
    * Clear text field
    */
  def clear(): Unit = js.native
  /*
    * Acquire focus
    */
  def focus(): Unit = js.native
  /*
    * Get current focus state
    */
  def isFocused(): Boolean = js.native
  /*
    * Get current restriction state
    */
  def isRestricted(): Boolean = js.native
  /*
    * Set current value
    */
  def setValue(): Unit = js.native
  def setValue(value: String): Unit = js.native
  /*
    * Get current value
    */
  def value(): String = js.native
}

