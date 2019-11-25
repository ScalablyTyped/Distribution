package typings.rheostat.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rheostat.rheostatStrings.horizontal
  - typings.rheostat.rheostatStrings.vertical
*/
trait Orientation extends js.Object

object Orientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.rheostat.rheostatStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.rheostat.rheostatStrings.vertical = this.cast("vertical")
}

