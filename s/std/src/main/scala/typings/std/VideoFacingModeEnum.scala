package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.user
  - typings.std.stdStrings.environment
  - typings.std.stdStrings.left
  - typings.std.stdStrings.right
*/
trait VideoFacingModeEnum extends js.Object

object VideoFacingModeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def environment: typings.std.stdStrings.environment = this.cast("environment")
  @scala.inline
  def left: typings.std.stdStrings.left = this.cast("left")
  @scala.inline
  def right: typings.std.stdStrings.right = this.cast("right")
  @scala.inline
  def user: typings.std.stdStrings.user = this.cast("user")
}

