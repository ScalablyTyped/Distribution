package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIntegrationResponse extends js.Object {
  // integration object that was deleted
  var data: js.UndefOr[Integration] = js.undefined
}

object DeleteIntegrationResponse {
  @scala.inline
  def apply(data: Integration = null): DeleteIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[DeleteIntegrationResponse]
  }
}

