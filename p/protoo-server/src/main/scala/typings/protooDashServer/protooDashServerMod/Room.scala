package typings.protooDashServer.protooDashServerMod

import typings.protooDashServer.protooDashServerStrings.close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoo-server", "Room")
@js.native
class Room () extends js.Object {
  var closed: Boolean = js.native
  var peers: js.Array[Peer] = js.native
  def close(): Unit = js.native
  def createPeer(peerId: String, transport: WebSocketTransport): js.Promise[Peer] = js.native
  def getPeer(peerId: String): Peer = js.native
  def hasPeer(peerId: String): Boolean = js.native
  @JSName("on")
  def on_close(eventType: close, callback: EmptyCb): Unit = js.native
}

