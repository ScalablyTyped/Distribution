package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordAuthContext
  extends AuthContextBase
     with AuthContext {
  /** The method of authentication. */
  @JSName("method")
  var method_PasswordAuthContext: ssh2Lib.ssh2LibStrings.password = js.native
  /** The password sent by the client. */
  var password: java.lang.String = js.native
}

