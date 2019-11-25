package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcsIntegration extends js.Object {
  // credentials for an AWS key integration
  var gcp_service_account: js.UndefOr[GcpServiceAccount] = js.undefined
}

object GcsIntegration {
  @scala.inline
  def apply(gcp_service_account: GcpServiceAccount = null): GcsIntegration = {
    val __obj = js.Dynamic.literal()
    if (gcp_service_account != null) __obj.updateDynamic("gcp_service_account")(gcp_service_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcsIntegration]
  }
}

