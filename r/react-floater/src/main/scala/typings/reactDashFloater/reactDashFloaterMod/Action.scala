package typings.reactDashFloater.reactDashFloaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashFloater.reactDashFloaterStrings.open
  - typings.reactDashFloater.reactDashFloaterStrings.close
*/
trait Action extends js.Object

object Action {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typings.reactDashFloater.reactDashFloaterStrings.close = this.cast("close")
  @scala.inline
  def open: typings.reactDashFloater.reactDashFloaterStrings.open = this.cast("open")
}

