package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.auto
  - typings.std.stdStrings.manual
*/
trait ScrollRestoration extends js.Object

object ScrollRestoration {
  @scala.inline
  def auto: typings.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typings.std.stdStrings.manual = this.cast("manual")
}

