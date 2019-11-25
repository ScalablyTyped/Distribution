package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.disabled
  - typings.std.stdStrings.hidden
  - typings.std.stdStrings.showing
*/
trait TextTrackMode extends js.Object

object TextTrackMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.std.stdStrings.disabled = this.cast("disabled")
  @scala.inline
  def hidden: typings.std.stdStrings.hidden = this.cast("hidden")
  @scala.inline
  def showing: typings.std.stdStrings.showing = this.cast("showing")
}

