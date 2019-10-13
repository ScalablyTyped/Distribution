package typings.ssh2.ssh2Mod

import typings.ssh2.ssh2Strings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordAuthContext
  extends AuthContextBase
     with AuthContext {
  /** The method of authentication. */
  @JSName("method")
  var method_PasswordAuthContext: password = js.native
  /** The password sent by the client. */
  var password: String = js.native
}

