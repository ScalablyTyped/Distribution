package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.follow
  - typings.std.stdStrings.error
  - typings.std.stdStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.std.stdStrings.error = this.cast("error")
  @scala.inline
  def follow: typings.std.stdStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typings.std.stdStrings.manual = this.cast("manual")
}

