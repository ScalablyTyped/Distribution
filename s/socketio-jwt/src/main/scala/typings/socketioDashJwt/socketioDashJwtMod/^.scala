package typings.socketioDashJwt.socketioDashJwtMod

import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authorize(options: JwtAuthOptions): js.Function1[/* socket */ Socket, Unit] = js.native
  def authorize(options: JwtAuthOptions, callback: JwtAuthorizeCallback): js.Function1[/* socket */ Socket, Unit] = js.native
}

