package typings.protooServer.mod

import typings.protooServer.protooServerStrings.close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protoo-server", "Room")
@js.native
class Room () extends js.Object {
  
  def close(): Unit = js.native
  
  var closed: Boolean = js.native
  
  def createPeer(peerId: String, transport: WebSocketTransport): js.Promise[Peer] = js.native
  
  def getPeer(peerId: String): Peer = js.native
  
  def hasPeer(peerId: String): Boolean = js.native
  
  @JSName("on")
  def on_close(eventType: close, callback: EmptyCb): Unit = js.native
  
  var peers: js.Array[Peer] = js.native
}
