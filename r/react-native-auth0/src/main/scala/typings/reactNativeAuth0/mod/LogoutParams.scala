package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogoutParams extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var federated: Boolean = js.native
  var returnTo: js.UndefOr[String] = js.native
}

object LogoutParams {
  @scala.inline
  def apply(federated: Boolean): LogoutParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutParams]
  }
  @scala.inline
  implicit class LogoutParamsOps[Self <: LogoutParams] (val x: Self) extends AnyVal {
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
    def setFederated(value: Boolean): Self = this.set("federated", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setReturnTo(value: String): Self = this.set("returnTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnTo: Self = this.set("returnTo", js.undefined)
  }
  
}

