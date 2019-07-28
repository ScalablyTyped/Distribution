package typings.socketDotIoDotUsers.socketDotIoDotUsersMod

import typings.node.eventsMod.EventEmitter
import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", "Users")
@js.native
class Users () extends EventEmitter {
  def this(namespace: String) = this()
  var namespace: String = js.native
  var users: js.Array[User] = js.native
  def add(socket: Socket): User = js.native
  def create(socket: Socket): User = js.native
  def emitAll(args: js.Any*): Unit = js.native
  def from(room: String): js.Array[User] = js.native
  def get(socket: Socket): User = js.native
  def getById(id: String): User = js.native
  def getById(id: Double): User = js.native
  def in(room: String): js.Array[User] = js.native
  def indexOf(user: User): Double = js.native
  def list(): js.Array[User] = js.native
  def push(_user: User): Unit = js.native
  def registerSocketEvents(currentUser: User): Unit = js.native
  def remove(user: User): Unit = js.native
  def room(room: String): js.Array[User] = js.native
  def size(): Double = js.native
  def takeId(request: js.Any): String | Double = js.native
  def update(user: User): Unit = js.native
}

/* static members */
@JSImport("socket.io.users", "Users")
@js.native
object Users extends js.Object {
  def of(): Users = js.native
  def of(namespace: String): Users = js.native
}

