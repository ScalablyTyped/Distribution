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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CustomTestWorkingResult]
  }
}

