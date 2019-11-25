package typings.rsocketDashCore.rSocketBufferUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketDashCore.rsocketDashCoreStrings.ascii
  - typings.rsocketDashCore.rsocketDashCoreStrings.base64
  - typings.rsocketDashCore.rsocketDashCoreStrings.hex
  - typings.rsocketDashCore.rsocketDashCoreStrings.utf8
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typings.rsocketDashCore.rsocketDashCoreStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typings.rsocketDashCore.rsocketDashCoreStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.rsocketDashCore.rsocketDashCoreStrings.hex = this.cast("hex")
  @scala.inline
  def utf8: typings.rsocketDashCore.rsocketDashCoreStrings.utf8 = this.cast("utf8")
}

