package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogoutParams extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var federated: Boolean
  var returnTo: js.UndefOr[String] = js.undefined
}

object LogoutParams {
  @scala.inline
  def apply(federated: Boolean, clientId: String = null, returnTo: String = null): LogoutParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutParams]
  }
}

