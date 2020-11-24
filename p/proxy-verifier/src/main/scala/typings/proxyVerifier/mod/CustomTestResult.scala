package typings.proxyVerifier.mod

import typings.proxyVerifier.anon.Code
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import typings.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.proxyVerifier.mod.CustomTestWorkingResult
  - typings.proxyVerifier.mod.CustomTestNotWorkingResult
*/
trait CustomTestResult extends js.Object
object CustomTestResult {
  
  @scala.inline
  def CustomTestWorkingResult(data: String, headers: Headers, ok: `true`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestResult]
  }
  
  @scala.inline
  def CustomTestNotWorkingResult(data: String, error: Code, headers: Headers, ok: `false`, status: Double): CustomTestResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestResult]
  }
}
