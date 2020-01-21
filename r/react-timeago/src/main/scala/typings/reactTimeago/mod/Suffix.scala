package typings.reactTimeago.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTimeago.reactTimeagoStrings.ago
  - typings.reactTimeago.reactTimeagoStrings.`from now`
*/
trait Suffix extends js.Object

object Suffix {
  @scala.inline
  def ago: typings.reactTimeago.reactTimeagoStrings.ago = this.cast("ago")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `from now`: typings.reactTimeago.reactTimeagoStrings.`from now` = this.cast("from now")
}

