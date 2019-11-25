package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.basic
  - typings.std.stdStrings.cors
  - typings.std.stdStrings.default
  - typings.std.stdStrings.error
  - typings.std.stdStrings.opaque
  - typings.std.stdStrings.opaqueredirect
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def basic: typings.std.stdStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.std.stdStrings.cors = this.cast("cors")
  @scala.inline
  def default: typings.std.stdStrings.default = this.cast("default")
  @scala.inline
  def error: typings.std.stdStrings.error = this.cast("error")
  @scala.inline
  def opaque: typings.std.stdStrings.opaque = this.cast("opaque")
  @scala.inline
  def opaqueredirect: typings.std.stdStrings.opaqueredirect = this.cast("opaqueredirect")
}

