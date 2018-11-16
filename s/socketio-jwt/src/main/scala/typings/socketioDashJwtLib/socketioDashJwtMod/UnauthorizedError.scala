package typings
package socketioDashJwtLib.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected ()
  extends nodeLib.Error {
  def this(code: java.lang.String, error: nodeLib.Error) = this()
  var data: JwtData = js.native
  var inner: nodeLib.Error = js.native
  var message: java.lang.String = js.native
}

