package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socketclusterClient.socketclusterClientStrings.connecting
  - typings.socketclusterClient.socketclusterClientStrings.open
  - typings.socketclusterClient.socketclusterClientStrings.closed
*/
trait States extends js.Object

object States {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.socketclusterClient.socketclusterClientStrings.closed = this.cast("closed")
  @scala.inline
  def connecting: typings.socketclusterClient.socketclusterClientStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typings.socketclusterClient.socketclusterClientStrings.open = this.cast("open")
}

