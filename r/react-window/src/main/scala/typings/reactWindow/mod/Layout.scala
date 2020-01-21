package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactWindow.reactWindowStrings.vertical
  - typings.reactWindow.reactWindowStrings.horizontal
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.reactWindow.reactWindowStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.reactWindow.reactWindowStrings.vertical = this.cast("vertical")
}

