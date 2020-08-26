package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcsIntegration extends js.Object {
  // credentials for an AWS key integration
  var gcp_service_account: js.UndefOr[GcpServiceAccount] = js.native
}

object GcsIntegration {
  @scala.inline
  def apply(): GcsIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsIntegration]
  }
  @scala.inline
  implicit class GcsIntegrationOps[Self <: GcsIntegration] (val x: Self) extends AnyVal {
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
    def setGcp_service_account(value: GcpServiceAccount): Self = this.set("gcp_service_account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcp_service_account: Self = this.set("gcp_service_account", js.undefined)
  }
  
}

