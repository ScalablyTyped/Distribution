package typings.std

import typings.std.stdStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseRejectedResult
  extends PromiseSettledResult[js.Any] {
  var reason: js.Any = js.native
  var status: rejected = js.native
}

object PromiseRejectedResult {
  @scala.inline
  def apply(reason: js.Any, status: rejected): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectedResult]
  }
  @scala.inline
  implicit class PromiseRejectedResultOps[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: rejected): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

