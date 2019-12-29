package typings.seneca.senecaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// { level: 'warn+' }
/* Rewritten from type alias, can be one of: 
  - typings.seneca.senecaStrings.none
  - typings.seneca.senecaStrings.debugPlussign
  - typings.seneca.senecaStrings.infoPlussign
  - typings.seneca.senecaStrings.warnPlussign
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debugPlussign: typings.seneca.senecaStrings.debugPlussign = this.cast("debug+")
  @scala.inline
  def infoPlussign: typings.seneca.senecaStrings.infoPlussign = this.cast("info+")
  @scala.inline
  def none: typings.seneca.senecaStrings.none = this.cast("none")
  @scala.inline
  def warnPlussign: typings.seneca.senecaStrings.warnPlussign = this.cast("warn+")
}

