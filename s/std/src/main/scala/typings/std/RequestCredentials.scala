package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.omit
  - typings.std.stdStrings.`same-origin`
  - typings.std.stdStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typings.std.stdStrings.include = this.cast("include")
  @scala.inline
  def omit: typings.std.stdStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typings.std.stdStrings.`same-origin` = this.cast("same-origin")
}

