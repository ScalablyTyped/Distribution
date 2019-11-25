package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.auto
  - typings.std.stdStrings.ltr
  - typings.std.stdStrings.rtl
*/
trait NotificationDirection extends js.Object

object NotificationDirection {
  @scala.inline
  def auto: typings.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ltr: typings.std.stdStrings.ltr = this.cast("ltr")
  @scala.inline
  def rtl: typings.std.stdStrings.rtl = this.cast("rtl")
}

