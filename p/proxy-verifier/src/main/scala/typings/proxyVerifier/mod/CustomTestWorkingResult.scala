package typings.proxyVerifier.mod

import typings.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestWorkingResult
  extends CustomTestBaseResult
     with CustomTestResult {
  var ok: `true`
}

object CustomTestWorkingResult {
  @scala.inline
  def apply(data: String, headers: Headers, ok: `true`, status: Double): CustomTestWorkingResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestWorkingResult]
  }
}

