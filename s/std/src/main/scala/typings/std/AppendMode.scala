package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.segments
  - typings.std.stdStrings.sequence
*/
trait AppendMode extends js.Object

object AppendMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def segments: typings.std.stdStrings.segments = this.cast("segments")
  @scala.inline
  def sequence: typings.std.stdStrings.sequence = this.cast("sequence")
}

