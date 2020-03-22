package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.inactive
  - typings.std.stdStrings.recvonly
  - typings.std.stdStrings.sendonly
  - typings.std.stdStrings.sendrecv
  - typings.std.stdStrings.stopped
*/
trait RTCRtpTransceiverDirection extends js.Object

object RTCRtpTransceiverDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.std.stdStrings.inactive = this.cast("inactive")
  @scala.inline
  def recvonly: typings.std.stdStrings.recvonly = this.cast("recvonly")
  @scala.inline
  def sendonly: typings.std.stdStrings.sendonly = this.cast("sendonly")
  @scala.inline
  def sendrecv: typings.std.stdStrings.sendrecv = this.cast("sendrecv")
  @scala.inline
  def stopped: typings.std.stdStrings.stopped = this.cast("stopped")
}

