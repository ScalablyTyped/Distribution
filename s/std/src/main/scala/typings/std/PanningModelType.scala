package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.equalpower
  - typings.std.stdStrings.HRTF
*/
trait PanningModelType extends js.Object

object PanningModelType {
  @scala.inline
  def HRTF: typings.std.stdStrings.HRTF = this.cast("HRTF")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def equalpower: typings.std.stdStrings.equalpower = this.cast("equalpower")
}

