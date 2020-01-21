package typings.rsocketCore.rsocketbufferutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketCore.rsocketCoreStrings.ascii
  - typings.rsocketCore.rsocketCoreStrings.base64
  - typings.rsocketCore.rsocketCoreStrings.hex
  - typings.rsocketCore.rsocketCoreStrings.utf8
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typings.rsocketCore.rsocketCoreStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typings.rsocketCore.rsocketCoreStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.rsocketCore.rsocketCoreStrings.hex = this.cast("hex")
  @scala.inline
  def utf8: typings.rsocketCore.rsocketCoreStrings.utf8 = this.cast("utf8")
}

