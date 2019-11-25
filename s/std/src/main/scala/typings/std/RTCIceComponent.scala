package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.rtp
  - typings.std.stdStrings.rtcp
*/
trait RTCIceComponent extends js.Object

object RTCIceComponent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rtcp: typings.std.stdStrings.rtcp = this.cast("rtcp")
  @scala.inline
  def rtp: typings.std.stdStrings.rtp = this.cast("rtp")
}

