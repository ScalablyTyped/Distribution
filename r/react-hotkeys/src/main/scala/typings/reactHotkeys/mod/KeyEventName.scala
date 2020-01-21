package typings.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactHotkeys.reactHotkeysStrings.keyup
  - typings.reactHotkeys.reactHotkeysStrings.keydown
  - typings.reactHotkeys.reactHotkeysStrings.keypress
*/
trait KeyEventName extends js.Object

object KeyEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typings.reactHotkeys.reactHotkeysStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typings.reactHotkeys.reactHotkeysStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typings.reactHotkeys.reactHotkeysStrings.keyup = this.cast("keyup")
}

