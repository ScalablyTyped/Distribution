package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.negotiate
  - typings.std.stdStrings.require
*/
trait RTCRtcpMuxPolicy extends js.Object

object RTCRtcpMuxPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def negotiate: typings.std.stdStrings.negotiate = this.cast("negotiate")
  @scala.inline
  def require: typings.std.stdStrings.require = this.cast("require")
}

