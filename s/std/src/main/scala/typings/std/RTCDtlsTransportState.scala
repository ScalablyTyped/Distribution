package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`new`
  - typings.std.stdStrings.connecting
  - typings.std.stdStrings.connected
  - typings.std.stdStrings.closed
  - typings.std.stdStrings.failed
*/
trait RTCDtlsTransportState extends js.Object

object RTCDtlsTransportState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def connected: typings.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.std.stdStrings.connecting = this.cast("connecting")
  @scala.inline
  def failed: typings.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typings.std.stdStrings.`new` = this.cast("new")
}

