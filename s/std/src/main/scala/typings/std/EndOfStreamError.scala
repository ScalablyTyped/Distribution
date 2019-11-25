package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.network
  - typings.std.stdStrings.decode
*/
trait EndOfStreamError extends js.Object

object EndOfStreamError {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decode: typings.std.stdStrings.decode = this.cast("decode")
  @scala.inline
  def network: typings.std.stdStrings.network = this.cast("network")
}

