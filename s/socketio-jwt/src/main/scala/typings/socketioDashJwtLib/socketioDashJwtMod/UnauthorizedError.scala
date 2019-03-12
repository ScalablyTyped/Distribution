package typings
package socketioDashJwtLib.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketio-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected ()
  extends stdLib.Error {
  def this(code: java.lang.String, error: stdLib.Error) = this()
  var data: JwtData = js.native
  var inner: stdLib.Error = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

