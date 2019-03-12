package typings
package socketioDashJwtLib.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authorize(options: JwtAuthOptions): js.Function1[/* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, scala.Unit] = js.native
  def authorize(options: JwtAuthOptions, callback: JwtAuthorizeCallback): js.Function1[/* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, scala.Unit] = js.native
}

