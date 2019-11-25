package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.proxyDashVerifier.Anon_Code
import typings.proxyDashVerifier.proxyDashVerifierNumbers.`false`
import typings.proxyDashVerifier.proxyDashVerifierNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashVerifier.proxyDashVerifierMod.WorkingResult
  - typings.proxyDashVerifier.proxyDashVerifierMod.NotWorkingResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def WorkingResult(ok: `true`): Result = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def NotWorkingResult(error: Anon_Code, ok: `false`): Result = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

