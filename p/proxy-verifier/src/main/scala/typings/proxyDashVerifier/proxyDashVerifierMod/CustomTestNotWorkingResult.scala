package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.proxyDashVerifier.Anon_Code
import typings.proxyDashVerifier.proxyDashVerifierNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestNotWorkingResult
  extends CustomTestBaseResult
     with CustomTestResult {
  var error: Anon_Code
  var ok: `false`
}

object CustomTestNotWorkingResult {
  @scala.inline
  def apply(data: String, error: Anon_Code, headers: Headers, ok: `false`, status: Double): CustomTestNotWorkingResult = {
    val __obj = js.Dynamic.literal(data = data, error = error, headers = headers, ok = ok, status = status)
  
    __obj.asInstanceOf[CustomTestNotWorkingResult]
  }
}

