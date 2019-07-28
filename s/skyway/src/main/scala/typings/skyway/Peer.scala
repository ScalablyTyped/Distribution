package typings.skyway

import typings.skyway.skywayStrings.call
import typings.skyway.skywayStrings.close
import typings.skyway.skywayStrings.connection
import typings.skyway.skywayStrings.disconnected
import typings.skyway.skywayStrings.error
import typings.skyway.skywayStrings.open
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Peer")
@js.native
class Peer protected () extends js.Object {
  def this(options: Options) = this()
  def this(id: String, options: Options) = this()
  var connections: js.Any = js.native
  var id: String = js.native
  var open: Boolean = js.native
  var rooms: js.Any = js.native
  def call(peerId: String): js.UndefOr[MediaConnection] = js.native
  def call(peerId: String, stream: MediaStream): js.UndefOr[MediaConnection] = js.native
  def call(peerId: String, stream: MediaStream, options: CallOptions): js.UndefOr[MediaConnection] = js.native
  def connect(peerId: String): js.UndefOr[DataConnection] = js.native
  def connect(peerId: String, options: ConnectOptions): js.UndefOr[DataConnection] = js.native
  def destroy(): js.UndefOr[scala.Nothing] = js.native
  def disconnect(): js.UndefOr[scala.Nothing] = js.native
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
  def updateCredential(newCredential: Credential): js.UndefOr[scala.Nothing] = js.native
}

