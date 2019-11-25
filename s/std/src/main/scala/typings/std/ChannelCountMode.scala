package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.max
  - typings.std.stdStrings.`clamped-max`
  - typings.std.stdStrings.explicit
*/
trait ChannelCountMode extends js.Object

object ChannelCountMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `clamped-max`: typings.std.stdStrings.`clamped-max` = this.cast("clamped-max")
  @scala.inline
  def explicit: typings.std.stdStrings.explicit = this.cast("explicit")
  @scala.inline
  def max: typings.std.stdStrings.max = this.cast("max")
}

