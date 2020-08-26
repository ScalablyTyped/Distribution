package typings.simperium.mod

import typings.simperium.simperiumNumbers.`400`
import typings.simperium.simperiumNumbers.`401`
import typings.simperium.simperiumNumbers.`500`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedAuthDetails extends js.Object {
  var code: `400` | `401` | `500` = js.native
  var msg: String = js.native
}

object FailedAuthDetails {
  @scala.inline
  def apply(code: `400` | `401` | `500`, msg: String): FailedAuthDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAuthDetails]
  }
  @scala.inline
  implicit class FailedAuthDetailsOps[Self <: FailedAuthDetails] (val x: Self) extends AnyVal {
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
    def setCode(value: `400` | `401` | `500`): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
  }
  
}

