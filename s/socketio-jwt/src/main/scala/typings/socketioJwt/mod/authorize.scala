package typings.socketioJwt.mod

import typings.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socketio-jwt", "authorize")
@js.native
object authorize extends js.Object {
  
  def apply(options: JwtAuthOptions): js.Function1[/* socket */ Socket, Unit] = js.native
  def apply(options: JwtAuthOptions, callback: JwtAuthorizeCallback): js.Function1[/* socket */ Socket, Unit] = js.native
}
