package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIntegrationsResponse extends js.Object {
  // list of integration objects
  var data: js.UndefOr[js.Array[Integration]] = js.undefined
}

object ListIntegrationsResponse {
  @scala.inline
  def apply(data: js.Array[Integration] = null): ListIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIntegrationsResponse]
  }
}

