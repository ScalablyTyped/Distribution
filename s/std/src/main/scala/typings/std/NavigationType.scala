package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.navigate
  - typings.std.stdStrings.reload
  - typings.std.stdStrings.back_forward
  - typings.std.stdStrings.prerender
*/
trait NavigationType extends js.Object

object NavigationType {
  @scala.inline
  def back_forward: typings.std.stdStrings.back_forward = this.cast("back_forward")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def navigate: typings.std.stdStrings.navigate = this.cast("navigate")
  @scala.inline
  def prerender: typings.std.stdStrings.prerender = this.cast("prerender")
  @scala.inline
  def reload: typings.std.stdStrings.reload = this.cast("reload")
}

