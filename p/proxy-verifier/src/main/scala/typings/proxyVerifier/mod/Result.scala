package typings.proxyVerifier.mod

import typings.proxyVerifier.AnonCode
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import typings.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyVerifier.mod.WorkingResult
  - typings.proxyVerifier.mod.NotWorkingResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def WorkingResult(ok: `true`): Result = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def NotWorkingResult(error: AnonCode, ok: `false`): Result = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

