package typings.socks.typingsCommonConstantsMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocksClientEstablishedEvent extends js.Object {
  var remoteHost: js.UndefOr[SocksRemoteHost] = js.undefined
  var socket: Socket
}

object SocksClientEstablishedEvent {
  @scala.inline
  def apply(socket: Socket, remoteHost: SocksRemoteHost = null): SocksClientEstablishedEvent = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (remoteHost != null) __obj.updateDynamic("remoteHost")(remoteHost)
    __obj.asInstanceOf[SocksClientEstablishedEvent]
  }
}

