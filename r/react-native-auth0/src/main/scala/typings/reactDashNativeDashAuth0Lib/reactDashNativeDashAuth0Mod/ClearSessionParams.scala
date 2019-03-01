package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearSessionParams extends js.Object {
  var federated: scala.Boolean
}

object ClearSessionParams {
  @scala.inline
  def apply(federated: scala.Boolean): ClearSessionParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("federated")(federated)
    __obj.asInstanceOf[ClearSessionParams]
  }
}

