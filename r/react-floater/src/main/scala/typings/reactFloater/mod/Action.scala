package typings.reactFloater.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactFloater.reactFloaterStrings.open
  - typings.reactFloater.reactFloaterStrings.close
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typings.reactFloater.reactFloaterStrings.close = this.cast("close")
  @scala.inline
  def open: typings.reactFloater.reactFloaterStrings.open = this.cast("open")
}

