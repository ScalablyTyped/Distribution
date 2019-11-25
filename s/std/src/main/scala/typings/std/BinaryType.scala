package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.blob
  - typings.std.stdStrings.arraybuffer
*/
trait BinaryType extends js.Object

object BinaryType {
  @scala.inline
  def arraybuffer: typings.std.stdStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typings.std.stdStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

