package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactWindow.reactWindowStrings.ltr
  - typings.reactWindow.reactWindowStrings.rtl
*/
trait CSSDirection extends js.Object

object CSSDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ltr: typings.reactWindow.reactWindowStrings.ltr = this.cast("ltr")
  @scala.inline
  def rtl: typings.reactWindow.reactWindowStrings.rtl = this.cast("rtl")
}

