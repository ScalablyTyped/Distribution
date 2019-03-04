package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogoutParams extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var federated: scala.Boolean
  var returnTo: js.UndefOr[java.lang.String] = js.undefined
}

object LogoutParams {
  @scala.inline
  def apply(federated: scala.Boolean, clientId: java.lang.String = null, returnTo: java.lang.String = null): LogoutParams = {
    val __obj = js.Dynamic.literal(federated = federated)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (returnTo != null) __obj.updateDynamic("returnTo")(returnTo)
    __obj.asInstanceOf[LogoutParams]
  }
}

