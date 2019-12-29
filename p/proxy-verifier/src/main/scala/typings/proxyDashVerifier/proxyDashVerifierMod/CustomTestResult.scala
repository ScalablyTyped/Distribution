package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.proxyDashVerifier.Anon_Code
import typings.proxyDashVerifier.proxyDashVerifierBooleans.`false`
import typings.proxyDashVerifier.proxyDashVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashVerifier.proxyDashVerifierMod.CustomTestWorkingResult
  - typings.proxyDashVerifier.proxyDashVerifierMod.CustomTestNotWorkingResult
*/
trait CustomTestResult extends js.Object

object CustomTestResult {
  @scala.inline
  def CustomTestWorkingResult(data: String, headers: Headers, ok: `true`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestResult]
  }
  @scala.inline
  def CustomTestNotWorkingResult(data: String, error: Anon_Code, headers: Headers, ok: `false`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestResult]
  }
}

