package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntegrationResponse extends js.Object {
  // integration object
  var data: js.UndefOr[Integration] = js.undefined
}

object GetIntegrationResponse {
  @scala.inline
  def apply(data: Integration = null): GetIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[GetIntegrationResponse]
  }
}

