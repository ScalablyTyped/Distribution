package typings.socketioDashJwtDashAuth.socketioDashJwtDashAuthMod

import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt-auth", "authenticate")
@js.native
object authenticate extends js.Object {
  def apply(options: authOptions, verify: verifyFunc): js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit] = js.native
}

