package typings.ssh2.mod

import typings.ssh2.ssh2Strings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoneAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The method of authentication. */
  @JSName("method")
  var method_NoneAuthContext: none = js.native
}
