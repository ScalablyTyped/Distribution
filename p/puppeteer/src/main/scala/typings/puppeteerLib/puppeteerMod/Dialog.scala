package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  /**
     * Accepts the dialog.
     * @param promptText A text to enter in prompt. Does not cause any effects if the dialog's type is not prompt.
     */
  def accept(): stdLib.Promise[scala.Unit] = js.native
  /**
     * Accepts the dialog.
     * @param promptText A text to enter in prompt. Does not cause any effects if the dialog's type is not prompt.
     */
  def accept(promptText: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** If dialog is prompt, returns default prompt value. Otherwise, returns empty string. */
  def defaultValue(): java.lang.String = js.native
  /** Dismiss the dialog */
  def dismiss(): stdLib.Promise[scala.Unit] = js.native
  /** Returns the message displayed in the dialog. */
  def message(): java.lang.String = js.native
  /** The dialog type. Dialog's type, can be one of `alert`, `beforeunload`, `confirm` or `prompt`. */
  def `type`(): DialogType = js.native
}

