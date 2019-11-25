package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.pending
  - typings.std.stdStrings.done
*/
trait IDBRequestReadyState extends js.Object

object IDBRequestReadyState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typings.std.stdStrings.done = this.cast("done")
  @scala.inline
  def pending: typings.std.stdStrings.pending = this.cast("pending")
}

