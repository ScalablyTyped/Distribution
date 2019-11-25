package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.transparent
  - typings.std.stdStrings.native
*/
trait EndingType extends js.Object

object EndingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def native: typings.std.stdStrings.native = this.cast("native")
  @scala.inline
  def transparent: typings.std.stdStrings.transparent = this.cast("transparent")
}

