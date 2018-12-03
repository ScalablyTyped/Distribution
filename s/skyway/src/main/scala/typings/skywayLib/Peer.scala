package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Peer")
@js.native
class Peer protected () extends js.Object {
  def this(options: Options) = this()
  def this(id: java.lang.String, options: Options) = this()
  var connections: js.Any = js.native
  var id: java.lang.String = js.native
  var open: scala.Boolean = js.native
  var rooms: js.Any = js.native
  def call(peerId: java.lang.String): js.UndefOr[MediaConnection] = js.native
  def call(peerId: java.lang.String, stream: stdLib.MediaStream): js.UndefOr[MediaConnection] = js.native
  def call(peerId: java.lang.String, stream: stdLib.MediaStream, options: CallOptions): js.UndefOr[MediaConnection] = js.native
  def connect(peerId: java.lang.String): js.UndefOr[DataConnection] = js.native
  def connect(peerId: java.lang.String, options: ConnectOptions): js.UndefOr[DataConnection] = js.native
  def destroy(): js.UndefOr[scala.Nothing] = js.native
  def disconnect(): js.UndefOr[scala.Nothing] = js.native
  def joinRoom(roomName: java.lang.String): js.UndefOr[SFURoom | MeshRoom | scala.Null] = js.native
  def joinRoom(roomName: java.lang.String, roomOptions: RoomOptions): js.UndefOr[SFURoom | MeshRoom | scala.Null] = js.native
  def listAllPeers(cb: js.Function1[/* peerIds */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function1[/* ret */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_call(event: skywayLib.skywayLibStrings.call, cb: js.Function1[/* call */ MediaConnection, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: skywayLib.skywayLibStrings.close, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_connection(
    event: skywayLib.skywayLibStrings.connection,
    cb: js.Function1[/* connection */ DataConnection, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_disconnected(
    event: skywayLib.skywayLibStrings.disconnected,
    cb: js.Function1[/* id */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_error(event: skywayLib.skywayLibStrings.error, cb: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_open(event: skywayLib.skywayLibStrings.open, cb: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def updateCredential(newCredential: Credential): js.UndefOr[scala.Nothing] = js.native
}

