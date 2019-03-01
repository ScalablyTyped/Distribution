package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotWorkingResult extends Result {
  var error: proxyDashVerifierLib.Anon_Code
  var ok: proxyDashVerifierLib.proxyDashVerifierLibNumbers.`false`
}

object NotWorkingResult {
  @scala.inline
  def apply(
    error: proxyDashVerifierLib.Anon_Code,
    ok: proxyDashVerifierLib.proxyDashVerifierLibNumbers.`false`
  ): NotWorkingResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("ok")(ok)
    __obj.asInstanceOf[NotWorkingResult]
  }
}

