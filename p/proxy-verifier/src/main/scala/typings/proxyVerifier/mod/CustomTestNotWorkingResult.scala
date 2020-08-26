package typings.proxyVerifier.mod

import typings.proxyVerifier.anon.Code
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTestNotWorkingResult
  extends CustomTestBaseResult
     with CustomTestResult {
  var error: Code = js.native
  var ok: `false` = js.native
}

object CustomTestNotWorkingResult {
  @scala.inline
  def apply(data: String, error: Code, headers: Headers, ok: `false`, status: Double): CustomTestNotWorkingResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestNotWorkingResult]
  }
  @scala.inline
  implicit class CustomTestNotWorkingResultOps[Self <: CustomTestNotWorkingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: Code): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: `false`): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
  
}

