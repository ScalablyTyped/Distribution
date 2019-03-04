package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestNotWorkingResult
  extends CustomTestBaseResult
     with CustomTestResult {
  var error: proxyDashVerifierLib.Anon_Code
  var ok: proxyDashVerifierLib.proxyDashVerifierLibNumbers.`false`
}

object CustomTestNotWorkingResult {
  @scala.inline
  def apply(
    data: java.lang.String,
    error: proxyDashVerifierLib.Anon_Code,
    headers: Headers,
    ok: proxyDashVerifierLib.proxyDashVerifierLibNumbers.`false`,
    status: scala.Double
  ): CustomTestNotWorkingResult = {
    val __obj = js.Dynamic.literal(data = data, error = error, headers = headers, ok = ok, status = status)
  
    __obj.asInstanceOf[CustomTestNotWorkingResult]
  }
}

