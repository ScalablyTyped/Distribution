package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.navigate
  - typings.std.stdStrings.`same-origin`
  - typings.std.stdStrings.`no-cors`
  - typings.std.stdStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.std.stdStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typings.std.stdStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typings.std.stdStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.std.stdStrings.`same-origin` = this.cast("same-origin")
}

