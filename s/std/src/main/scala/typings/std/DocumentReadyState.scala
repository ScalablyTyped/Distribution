package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.loading
  - typings.std.stdStrings.interactive
  - typings.std.stdStrings.complete
*/
trait DocumentReadyState extends js.Object

object DocumentReadyState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.std.stdStrings.complete = this.cast("complete")
  @scala.inline
  def interactive: typings.std.stdStrings.interactive = this.cast("interactive")
  @scala.inline
  def loading: typings.std.stdStrings.loading = this.cast("loading")
}

