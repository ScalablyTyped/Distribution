package typings.screenfull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.screenfull.screenfullStrings.change
  - typings.screenfull.screenfullStrings.error
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.screenfull.screenfullStrings.change = this.cast("change")
  @scala.inline
  def error: typings.screenfull.screenfullStrings.error = this.cast("error")
}

