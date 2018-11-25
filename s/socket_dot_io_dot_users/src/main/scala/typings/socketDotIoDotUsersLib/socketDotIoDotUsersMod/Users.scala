package typings
package socketDotIoDotUsersLib.socketDotIoDotUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", "Users")
@js.native
class Users ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(namespace: java.lang.String) = this()
  var namespace: java.lang.String = js.native
  var users: js.Array[User] = js.native
  def add(socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket): User = js.native
  def create(socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket): User = js.native
  def emitAll(args: js.Any*): scala.Unit = js.native
  def from(room: java.lang.String): js.Array[User] = js.native
  def get(socket: socketDotIoLib.socketDotIoMod.SocketIONs.Socket): User = js.native
  def getById(id: java.lang.String): User = js.native
  def getById(id: scala.Double): User = js.native
  def in(room: java.lang.String): js.Array[User] = js.native
  def indexOf(user: User): scala.Double = js.native
  def list(): js.Array[User] = js.native
  def push(_user: User): scala.Unit = js.native
  def registerSocketEvents(currentUser: User): scala.Unit = js.native
  def remove(user: User): scala.Unit = js.native
  def room(room: java.lang.String): js.Array[User] = js.native
  def size(): scala.Double = js.native
  def takeId(request: js.Any): java.lang.String | scala.Double = js.native
  def update(user: User): scala.Unit = js.native
}

@JSImport("socket.io.users", "Users")
@js.native
object Users extends js.Object {
  def of(): socketDotIoDotUsersLib.socketDotIoDotUsersMod.Users = js.native
  def of(namespace: java.lang.String): socketDotIoDotUsersLib.socketDotIoDotUsersMod.Users = js.native
}

