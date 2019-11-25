package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.direct
  - typings.std.stdStrings.stylus
*/
trait TouchType extends js.Object

object TouchType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def direct: typings.std.stdStrings.direct = this.cast("direct")
  @scala.inline
  def stylus: typings.std.stdStrings.stylus = this.cast("stylus")
}

