package typings.sortablejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sortablejs.sortablejsStrings.vertical
  - typings.sortablejs.sortablejsStrings.horizontal
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.sortablejs.sortablejsStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.sortablejs.sortablejsStrings.vertical = this.cast("vertical")
}

