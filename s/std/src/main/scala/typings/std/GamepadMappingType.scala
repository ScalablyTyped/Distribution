package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Empty
  - typings.std.stdStrings.standard
*/
trait GamepadMappingType extends js.Object

object GamepadMappingType {
  @scala.inline
  def Empty: typings.std.stdStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def standard: typings.std.stdStrings.standard = this.cast("standard")
}

