package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearSessionParams extends js.Object {
  var federated: Boolean
}

object ClearSessionParams {
  @scala.inline
  def apply(federated: Boolean): ClearSessionParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSessionParams]
  }
}

