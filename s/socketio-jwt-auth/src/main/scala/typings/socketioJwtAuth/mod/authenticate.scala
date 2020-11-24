package typings.socketioJwtAuth.mod

import typings.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socketio-jwt-auth", "authenticate")
@js.native
object authenticate extends js.Object {
  
  def apply(options: authOptions, verify: verifyFunc): js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit] = js.native
}
