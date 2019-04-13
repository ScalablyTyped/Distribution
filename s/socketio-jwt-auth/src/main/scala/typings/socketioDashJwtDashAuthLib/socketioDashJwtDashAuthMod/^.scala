package typings
package socketioDashJwtDashAuthLib.socketioDashJwtDashAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt-auth", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authenticate(options: authOptions, verify: verifyFunc): js.Function2[
    /* socket */ socketDotIoLib.socketDotIoMod.Socket, 
    /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ] = js.native
}

