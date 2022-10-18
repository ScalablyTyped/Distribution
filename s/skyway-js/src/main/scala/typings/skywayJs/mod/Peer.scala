package typings.skywayJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.events.mod.EventEmitter
import typings.skywayJs.skywayJsStrings.call
import typings.skywayJs.skywayJsStrings.close
import typings.skywayJs.skywayJsStrings.connection
import typings.skywayJs.skywayJsStrings.disconnected
import typings.skywayJs.skywayJsStrings.error
import typings.skywayJs.skywayJsStrings.expiresin
import typings.skywayJs.skywayJsStrings.open
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peer extends EventEmitter {
  
  def call(peerId: String): MediaConnection = js.native
  def call(peerId: String, stream: Unit, options: CallOption): MediaConnection = js.native
  def call(peerId: String, stream: MediaStream): MediaConnection = js.native
  def call(peerId: String, stream: MediaStream, options: CallOption): MediaConnection = js.native
  
  def connect(peerId: String): DataConnection = js.native
  def connect(peerId: String, options: ConnectOption): DataConnection = js.native
  
  var connections: StringDictionary[js.Array[DataConnection | MediaConnection]] = js.native
  
  def destroy(): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  def fetchPeerExists(peerId: String): js.Promise[Boolean] = js.native
  
  def getConnection[T /* <: Connection */](peerId: String, connectionId: String): T | Null = js.native
  
  var id: String = js.native
  
  def joinRoom[T /* <: Room */](roomName: String): T = js.native
  def joinRoom[T /* <: Room */](roomName: String, options: RoomOption): T = js.native
  def joinRoom[T /* <: Room */, Options /* <: RoomOption */](roomName: String, options: Options): /* import warning: importer.ImportType#apply Failed type conversion: Options['mode'] extends 'sfu' ? skyway-js.skyway-js.SfuRoom : Options['mode'] extends 'mesh' ? skyway-js.skyway-js.MeshRoom : skyway-js.skyway-js.SfuRoom | skyway-js.skyway-js.MeshRoom */ js.Any = js.native
  @JSName("joinRoom")
  def joinRoom_TOptions_Any[T /* <: Room */, Options /* <: RoomOption */](roomName: String): /* import warning: importer.ImportType#apply Failed type conversion: Options['mode'] extends 'sfu' ? skyway-js.skyway-js.SfuRoom : Options['mode'] extends 'mesh' ? skyway-js.skyway-js.MeshRoom : skyway-js.skyway-js.SfuRoom | skyway-js.skyway-js.MeshRoom */ js.Any = js.native
  
  def listAllPeers(callback: js.Function1[/* peers */ js.Array[String], Unit]): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_call(event: call, listener: js.Function1[/* conn */ MediaConnection, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: js.Function1[/* conn */ DataConnection, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnected(event: disconnected, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("on")
  def on_expiresin(event: expiresin, listener: js.Function1[/* sec */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_call(event: call, listener: js.Function1[/* conn */ MediaConnection, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connection(event: connection, listener: js.Function1[/* conn */ DataConnection, Unit]): this.type = js.native
  @JSName("once")
  def once_disconnected(event: disconnected, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("once")
  def once_expiresin(event: expiresin, listener: js.Function1[/* sec */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: open, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  
  var open: Boolean = js.native
  
  var options: PeerOption = js.native
  
  def reconnect(): Unit = js.native
  
  var rooms: StringDictionary[MeshRoom | SfuRoom] = js.native
  
  def updateCredential(credential: PeerCredential): Unit = js.native
}
