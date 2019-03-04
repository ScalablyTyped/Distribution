package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestWorkingResult
  extends CustomTestBaseResult
     with CustomTestResult {
  var ok: proxyDashVerifierLib.proxyDashVerifierLibNumbers.`true`
}

object CustomTestWorkingResult {
  @scala.inline
  def apply(
    data: java.lang.String,
    headers: Headers,
    ok: proxyDashVerifierLib.proxyDashVerifierLibNumbers.`true`,
    status: scala.Double
  ): CustomTestWorkingResult = {
    val __obj = js.Dynamic.literal(data = data, headers = headers, ok = ok, status = status)
  
    __obj.asInstanceOf[CustomTestWorkingResult]
  }
}

