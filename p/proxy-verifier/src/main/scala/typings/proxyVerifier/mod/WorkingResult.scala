package typings.proxyVerifier.mod

import typings.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkingResult extends Result {
  var ok: `true` = js.native
}

object WorkingResult {
  @scala.inline
  def apply(ok: `true`): WorkingResult = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkingResult]
  }
  @scala.inline
  implicit class WorkingResultOps[Self <: WorkingResult] (val x: Self) extends AnyVal {
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
    def setOk(value: `true`): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
  
}

