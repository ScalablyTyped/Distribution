package typings.socketDotIoDotUsers.socketDotIoDotUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io.users", "Namespaces")
@js.native
class Namespaces () extends js.Object

/* static members */
@JSImport("socket.io.users", "Namespaces")
@js.native
object Namespaces extends js.Object {
  var socketUsersList: js.Any = js.native
  def attach(namespace: String, socketUsersObj: Users): Unit = js.native
  def get(namespace: String): Users = js.native
}

