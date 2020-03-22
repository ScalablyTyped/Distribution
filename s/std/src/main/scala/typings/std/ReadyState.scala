package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.closed
  - typings.std.stdStrings.ended
  - typings.std.stdStrings.open
*/
trait ReadyState extends js.Object

object ReadyState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def ended: typings.std.stdStrings.ended = this.cast("ended")
  @scala.inline
  def open: typings.std.stdStrings.open = this.cast("open")
}

