package typings.socketDotIoDotUsers.socketDotIoDotUsersMod

import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", "User")
@js.native
class User () extends js.Object {
  var id: String | Double = js.native
  var ip: String = js.native
  var remoteAddresses: js.Array[String] = js.native
  var rooms: js.Array[String] = js.native
  var socket: Socket = js.native
  var sockets: js.Array[Socket] = js.native
  var store: js.Any = js.native
  def attach(socket: Socket): Unit = js.native
  /** same as in, checks if this user is inside a room */
  def belong(room: String): Boolean = js.native
  def detach(): Unit = js.native
  def detachSocket(socket: Socket): Unit = js.native
  def emit(args: js.Any*): Unit = js.native
  def get(key: String): js.Any = js.native
  /** same as belong, checks if this user is inside a room  */
  def in(room: String): Boolean = js.native
  def join(room: String): Boolean = js.native
  def leave(room: String): Unit = js.native
  def leaveAll(): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def to(room: String): Socket = js.native
}

