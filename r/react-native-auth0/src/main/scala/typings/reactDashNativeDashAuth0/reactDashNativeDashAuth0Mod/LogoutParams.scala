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
    val __obj = js.Dynamic.literal(federated = federated)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo)
    __obj.asInstanceOf[LogoutParams]
  }
}

