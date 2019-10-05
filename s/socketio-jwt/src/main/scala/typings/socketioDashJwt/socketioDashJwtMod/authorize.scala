package typings.socketioDashJwt.socketioDashJwtMod

import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", "authorize")
@js.native
object authorize extends js.Object {
  def apply(options: JwtAuthOptions): js.Function1[/* socket */ Socket, Unit] = js.native
  def apply(options: JwtAuthOptions, callback: JwtAuthorizeCallback): js.Function1[/* socket */ Socket, Unit] = js.native
}

