package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.classic
  - typings.std.stdStrings.module
*/
trait WorkerType extends js.Object

object WorkerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def classic: typings.std.stdStrings.classic = this.cast("classic")
  @scala.inline
  def module: typings.std.stdStrings.module = this.cast("module")
}

