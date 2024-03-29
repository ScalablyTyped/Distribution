package typings.skyway

import typings.skyway.skywayStrings.call
import typings.skyway.skywayStrings.close
import typings.skyway.skywayStrings.connection
import typings.skyway.skywayStrings.disconnected
import typings.skyway.skywayStrings.error
import typings.skyway.skywayStrings.open
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peer extends StObject {
  
  def call(peerId: String): js.UndefOr[MediaConnection] = js.native
  def call(peerId: String, stream: Unit, options: CallOptions): js.UndefOr[MediaConnection] = js.native
  def call(peerId: String, stream: MediaStream): js.UndefOr[MediaConnection] = js.native
  def call(peerId: String, stream: MediaStream, options: CallOptions): js.UndefOr[MediaConnection] = js.native
  
  def connect(peerId: String): js.UndefOr[DataConnection] = js.native
  def connect(peerId: String, options: ConnectOptions): js.UndefOr[DataConnection] = js.native
  
  var connections: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  var id: String = js.native
  
  def joinRoom(roomName: String): js.UndefOr[SFURoom | MeshRoom | Null] = js.native
  def joinRoom(roomName: String, roomOptions: RoomOptions): js.UndefOr[SFURoom | MeshRoom | Null] = js.native
  
  def listAllPeers(cb: js.Function1[/* peerIds */ js.Array[String], Unit]): Unit = js.native
  
  def on(event: String, cb: js.Function1[/* ret */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_call(event: call, cb: js.Function1[/* call */ MediaConnection, Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_connection(event: connection, cb: js.Function1[/* connection */ DataConnection, Unit]): Unit = js.native
  @JSName("on")
  def on_disconnected(event: disconnected, cb: js.Function1[/* id */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_open(event: open, cb: js.Function1[/* id */ String, Unit]): Unit = js.native
  
  var open: Boolean = js.native
  
  var rooms: js.Any = js.native
  
  def updateCredential(newCredential: Credential): Unit = js.native
}
