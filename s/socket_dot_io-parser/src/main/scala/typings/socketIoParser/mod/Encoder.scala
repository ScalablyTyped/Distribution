package typings.socketIoParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socket.io-parser", "Encoder")
@js.native
class Encoder () extends js.Object {
  
  def encode(packet: Packet, callback: js.Function1[/* encodedPackets */ js.Array[EncodedPacket], Unit]): Unit = js.native
}
