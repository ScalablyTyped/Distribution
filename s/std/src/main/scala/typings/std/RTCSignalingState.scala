package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.stable
  - typings.std.stdStrings.`have-local-offer`
  - typings.std.stdStrings.`have-remote-offer`
  - typings.std.stdStrings.`have-local-pranswer`
  - typings.std.stdStrings.`have-remote-pranswer`
  - typings.std.stdStrings.closed
*/
trait RTCSignalingState extends js.Object

object RTCSignalingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def `have-local-offer`: typings.std.stdStrings.`have-local-offer` = this.cast("have-local-offer")
  @scala.inline
  def `have-local-pranswer`: typings.std.stdStrings.`have-local-pranswer` = this.cast("have-local-pranswer")
  @scala.inline
  def `have-remote-offer`: typings.std.stdStrings.`have-remote-offer` = this.cast("have-remote-offer")
  @scala.inline
  def `have-remote-pranswer`: typings.std.stdStrings.`have-remote-pranswer` = this.cast("have-remote-pranswer")
  @scala.inline
  def stable: typings.std.stdStrings.stable = this.cast("stable")
}

