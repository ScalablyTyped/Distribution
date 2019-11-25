package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.connecting
  - typings.std.stdStrings.open
  - typings.std.stdStrings.closing
  - typings.std.stdStrings.closed
*/
trait RTCDataChannelState extends js.Object

object RTCDataChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def closing: typings.std.stdStrings.closing = this.cast("closing")
  @scala.inline
  def connecting: typings.std.stdStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typings.std.stdStrings.open = this.cast("open")
}

