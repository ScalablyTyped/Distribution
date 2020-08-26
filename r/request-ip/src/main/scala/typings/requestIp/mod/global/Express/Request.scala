package typings.requestIp.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var clientIp: js.UndefOr[String] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setClientIp(value: String): Self = this.set("clientIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientIp: Self = this.set("clientIp", js.undefined)
  }
  
}

