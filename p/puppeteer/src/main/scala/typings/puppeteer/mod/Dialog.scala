package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  /**
    * Accepts the dialog.
    * @param promptText A text to enter in prompt. Does not cause any effects if the dialog's type is not prompt.
    */
  def accept(): js.Promise[Unit] = js.native
  def accept(promptText: String): js.Promise[Unit] = js.native
  /** If dialog is prompt, returns default prompt value. Otherwise, returns empty string. */
  def defaultValue(): String = js.native
  /** Dismiss the dialog */
  def dismiss(): js.Promise[Unit] = js.native
  /** Returns the message displayed in the dialog. */
  def message(): String = js.native
  /** The dialog type. Dialog's type, can be one of `alert`, `beforeunload`, `confirm` or `prompt`. */
  def `type`(): DialogType = js.native
}

