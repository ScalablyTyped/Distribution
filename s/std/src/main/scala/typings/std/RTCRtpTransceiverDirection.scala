package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.sendrecv
  - typings.std.stdStrings.sendonly
  - typings.std.stdStrings.recvonly
  - typings.std.stdStrings.inactive
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
}

