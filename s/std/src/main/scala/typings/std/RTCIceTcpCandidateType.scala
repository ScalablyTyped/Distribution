package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.active
  - typings.std.stdStrings.passive
  - typings.std.stdStrings.so
*/
trait RTCIceTcpCandidateType extends js.Object

object RTCIceTcpCandidateType {
  @scala.inline
  def active: typings.std.stdStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def passive: typings.std.stdStrings.passive = this.cast("passive")
  @scala.inline
  def so: typings.std.stdStrings.so = this.cast("so")
}

