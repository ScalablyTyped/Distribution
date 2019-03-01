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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CustomTestNotWorkingResult]
  }
}

