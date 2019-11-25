package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.temporary
  - typings.std.stdStrings.`persistent-license`
*/
trait MediaKeySessionType extends js.Object

object MediaKeySessionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `persistent-license`: typings.std.stdStrings.`persistent-license` = this.cast("persistent-license")
  @scala.inline
  def temporary: typings.std.stdStrings.temporary = this.cast("temporary")
}

