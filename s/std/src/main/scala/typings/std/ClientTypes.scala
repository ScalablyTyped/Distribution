package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.window
  - typings.std.stdStrings.worker
  - typings.std.stdStrings.sharedworker
  - typings.std.stdStrings.all
*/
trait ClientTypes extends js.Object

object ClientTypes {
  @scala.inline
  def all: typings.std.stdStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sharedworker: typings.std.stdStrings.sharedworker = this.cast("sharedworker")
  @scala.inline
  def window: typings.std.stdStrings.window = this.cast("window")
  @scala.inline
  def worker: typings.std.stdStrings.worker = this.cast("worker")
}

