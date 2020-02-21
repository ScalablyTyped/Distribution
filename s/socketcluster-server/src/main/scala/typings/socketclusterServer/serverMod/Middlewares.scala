package typings.socketclusterServer.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socketclusterServer.socketclusterServerStrings.handshake
  - typings.socketclusterServer.socketclusterServerStrings.inboundRaw
  - typings.socketclusterServer.socketclusterServerStrings.inbound
  - typings.socketclusterServer.socketclusterServerStrings.outbound
*/
trait Middlewares extends js.Object

object Middlewares {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handshake: typings.socketclusterServer.socketclusterServerStrings.handshake = this.cast("handshake")
  @scala.inline
  def inbound: typings.socketclusterServer.socketclusterServerStrings.inbound = this.cast("inbound")
  @scala.inline
  def inboundRaw: typings.socketclusterServer.socketclusterServerStrings.inboundRaw = this.cast("inboundRaw")
  @scala.inline
  def outbound: typings.socketclusterServer.socketclusterServerStrings.outbound = this.cast("outbound")
}

