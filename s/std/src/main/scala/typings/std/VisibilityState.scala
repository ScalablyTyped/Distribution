package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.hidden
  - typings.std.stdStrings.visible
*/
trait VisibilityState extends js.Object

object VisibilityState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typings.std.stdStrings.hidden = this.cast("hidden")
  @scala.inline
  def visible: typings.std.stdStrings.visible = this.cast("visible")
}

