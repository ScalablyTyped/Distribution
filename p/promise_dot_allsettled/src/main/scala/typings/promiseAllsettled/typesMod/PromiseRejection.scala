package typings.promiseAllsettled.typesMod

import typings.promiseAllsettled.promiseAllsettledStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejection[E]
  extends PromiseResult[js.Any, E] {
  var reason: E = js.native
  var status: rejected = js.native
}

object PromiseRejection {
  @scala.inline
  def apply[E](reason: E, status: rejected): PromiseRejection[E] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejection[E]]
  }
  @scala.inline
  implicit class PromiseRejectionOps[Self <: PromiseRejection[_], E] (val x: Self with PromiseRejection[E]) extends AnyVal {
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
    def setReason(value: E): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: rejected): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

