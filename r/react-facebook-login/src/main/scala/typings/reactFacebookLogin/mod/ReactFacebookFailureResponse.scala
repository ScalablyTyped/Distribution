package typings.reactFacebookLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactFacebookFailureResponse extends js.Object {
  var status: js.UndefOr[String] = js.native
}

object ReactFacebookFailureResponse {
  @scala.inline
  def apply(): ReactFacebookFailureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactFacebookFailureResponse]
  }
  @scala.inline
  implicit class ReactFacebookFailureResponseOps[Self <: ReactFacebookFailureResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

