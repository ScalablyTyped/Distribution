package typings
package socketDotIoDotUsersLib.socketDotIoDotUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", "User")
@js.native
class User () extends js.Object {
  var id: java.lang.String | scala.Double = js.native
  var ip: java.lang.String = js.native
  var remoteAddresses: js.Array[java.lang.String] = js.native
  var rooms: js.Array[java.lang.String] = js.native
  var socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket = js.native
  var sockets: js.Array[socketDotIoLib.socketDotIoMod.SocketIONs.Socket] = js.native
  var store: js.Any = js.native
  def attach(socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket): scala.Unit = js.native
  /** same as in, checks if this user is inside a room */
  def belong(room: java.lang.String): scala.Boolean = js.native
  def detach(): scala.Unit = js.native
  def detachSocket(socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket): scala.Unit = js.native
  def emit(args: js.Any*): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  /** same as belong, checks if this user is inside a room  */
  def in(room: java.lang.String): scala.Boolean = js.native
  def join(room: java.lang.String): scala.Boolean = js.native
  def leave(room: java.lang.String): scala.Unit = js.native
  def leaveAll(): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def to(room: java.lang.String): socketDotIoLib.socketDotIoMod.SocketIONs.Socket = js.native
}

