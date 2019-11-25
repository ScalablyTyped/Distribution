package typings.seneca.senecaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// { level: 'warn+' }
/* Rewritten from type alias, can be one of: 
  - typings.seneca.senecaStrings.none
  - typings.seneca.senecaStrings.`debug+`
  - typings.seneca.senecaStrings.`info+`
  - typings.seneca.senecaStrings.`warn+`
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `debug+`: typings.seneca.senecaStrings.`debug+` = this.cast("debug+")
  @scala.inline
  def `info+`: typings.seneca.senecaStrings.`info+` = this.cast("info+")
  @scala.inline
  def none: typings.seneca.senecaStrings.none = this.cast("none")
  @scala.inline
  def `warn+`: typings.seneca.senecaStrings.`warn+` = this.cast("warn+")
}

