package typings.reactNativeElements.mod

import typings.react.mod.Component
import typings.reactNativeElements.PartialTextInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "Input")
@js.native
class Input ()
  extends Component[InputProps, js.Object, js.Any] {
  /**
    * Calls blur on the Input
    *
    * eg `this.inputRef.blur()`
    */
  def blur(): Unit = js.native
  /**
    * Calls clear on the Input
    *
    * eg `this.inputRef.clear()`
    */
  def clear(): Unit = js.native
  /**
    * Calls focus on the Input
    *
    * eg `this.inputRef.focus()`
    */
  def focus(): Unit = js.native
  /**
    * Calls isFocused() on the Input
    *
    * eg `let focused = this.inputRef.isFocused()`
    */
  def isFocused(): Boolean = js.native
  /**
    * Calls setNativeProps on the Input
    *
    * eg `this.inputRef.setNativeProps({ text: 'any text' })`
    */
  def setNativeProps(nativeProps: PartialTextInputProps): Unit = js.native
  /**
    * Shakes the Input
    *
    * eg `this.inputRef.shake()`
    */
  def shake(): Unit = js.native
}

