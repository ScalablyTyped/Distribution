package typings.socketclusterDashClient.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socketclusterDashClient.socketclusterDashClientStrings.connecting
  - typings.socketclusterDashClient.socketclusterDashClientStrings.open
  - typings.socketclusterDashClient.socketclusterDashClientStrings.closed
*/
trait States extends js.Object

object States {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.socketclusterDashClient.socketclusterDashClientStrings.closed = this.cast("closed")
  @scala.inline
  def connecting: typings.socketclusterDashClient.socketclusterDashClientStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typings.socketclusterDashClient.socketclusterDashClientStrings.open = this.cast("open")
}

