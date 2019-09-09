package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is responsible for coordinating the "focused"
  * state for TextInputs. All calls relating to the keyboard
  * should be funneled through here
  */
@js.native
trait TextInputState extends js.Object {
  /**
    * @deprecated Use ref.blur instead
    * @param textFieldID id of the text field to focus
    * Unfocuses the specified text field
    * noop if it wasn't focused
    */
  def blurTextInput(): Unit = js.native
  def blurTextInput(textFieldID: Double): Unit = js.native
  /**
    * Returns the ID of the currently focused text field, if one exists
    * If no text field is focused it returns null
    */
  def currentlyFocusedField(): Double = js.native
  /**
    * @deprecated Use ref.focus instead
    * @param TextInputID id of the text field to focus
    * Focuses the specified text field
    * noop if the text field was already focused
    */
  def focusTextInput(): Unit = js.native
  def focusTextInput(textFieldID: Double): Unit = js.native
}

