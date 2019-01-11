package typings
package socketioDashJwtLib.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authorize(options: socketioDashJwtLib.socketioDashJwtMod.JwtAuthOptions): js.Function1[/* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, scala.Unit] = js.native
  def authorize(
    options: socketioDashJwtLib.socketioDashJwtMod.JwtAuthOptions,
    callback: socketioDashJwtLib.socketioDashJwtMod.JwtAuthorizeCallback
  ): js.Function1[/* socket */ socketDotIoLib.socketDotIoMod.SocketIONs.Socket, scala.Unit] = js.native
}

