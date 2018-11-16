package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Connection")
@js.native
class Connection protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(socket: nodeLib.netMod.Socket, options: ConnectionOptions) = this()
  def end(): scala.Unit = js.native
  def send(packetType: PacketType, payload: js.Any): scala.Unit = js.native
  def send(
    packetType: PacketType,
    payload: js.Any,
    callback: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

