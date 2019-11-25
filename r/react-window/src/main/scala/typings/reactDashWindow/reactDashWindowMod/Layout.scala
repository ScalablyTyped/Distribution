package typings.reactDashWindow.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashWindow.reactDashWindowStrings.vertical
  - typings.reactDashWindow.reactDashWindowStrings.horizontal
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.reactDashWindow.reactDashWindowStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.reactDashWindow.reactDashWindowStrings.vertical = this.cast("vertical")
}

