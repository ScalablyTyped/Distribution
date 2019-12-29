package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings._empty
  - typings.std.stdStrings.rl
  - typings.std.stdStrings.lr
*/
trait DirectionSetting extends js.Object

object DirectionSetting {
  @scala.inline
  def _empty: typings.std.stdStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lr: typings.std.stdStrings.lr = this.cast("lr")
  @scala.inline
  def rl: typings.std.stdStrings.rl = this.cast("rl")
}

