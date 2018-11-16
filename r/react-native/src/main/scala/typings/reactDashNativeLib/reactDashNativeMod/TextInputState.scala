package typings
package reactDashNativeLib.reactDashNativeMod

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
       * @deprecated
       * @param textFieldID id of the text field to focus
       * Unfocuses the specified text field
       * noop if it wasn't focused
       */
  def blurTextInput(): scala.Unit = js.native
  /**
       * @deprecated
       * @param textFieldID id of the text field to focus
       * Unfocuses the specified text field
       * noop if it wasn't focused
       */
  def blurTextInput(textFieldID: scala.Double): scala.Unit = js.native
  /**
       * Returns the ID of the currently focused text field, if one exists
       * If no text field is focused it returns null
       */
  def currentlyFocusedField(): scala.Double = js.native
  /**
       * @deprecated
       * @param TextInputID id of the text field to focus
       * Focuses the specified text field
       * noop if the text field was already focused
       */
  def focusTextInput(): scala.Unit = js.native
  /**
       * @deprecated
       * @param TextInputID id of the text field to focus
       * Focuses the specified text field
       * noop if the text field was already focused
       */
  def focusTextInput(textFieldID: scala.Double): scala.Unit = js.native
}

