package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocksClientEstablishedEvent extends js.Object {
  var remoteHost: js.UndefOr[SocksRemoteHost] = js.undefined
  var socket: nodeLib.netMod.Socket
}

object SocksClientEstablishedEvent {
  @scala.inline
  def apply(socket: nodeLib.netMod.Socket, remoteHost: SocksRemoteHost = null): SocksClientEstablishedEvent = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (remoteHost != null) __obj.updateDynamic("remoteHost")(remoteHost)
    __obj.asInstanceOf[SocksClientEstablishedEvent]
  }
}

