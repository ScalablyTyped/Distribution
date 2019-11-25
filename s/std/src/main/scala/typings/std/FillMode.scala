package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.none
  - typings.std.stdStrings.forwards
  - typings.std.stdStrings.backwards
  - typings.std.stdStrings.both
  - typings.std.stdStrings.auto
*/
trait FillMode extends js.Object

object FillMode {
  @scala.inline
  def auto: typings.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  def backwards: typings.std.stdStrings.backwards = this.cast("backwards")
  @scala.inline
  def both: typings.std.stdStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forwards: typings.std.stdStrings.forwards = this.cast("forwards")
  @scala.inline
  def none: typings.std.stdStrings.none = this.cast("none")
}

