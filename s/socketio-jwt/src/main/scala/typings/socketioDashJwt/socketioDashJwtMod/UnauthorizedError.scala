package typings.socketioDashJwt.socketioDashJwtMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: String, error: Error) = this()
  var data: JwtData = js.native
  var inner: Error = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

