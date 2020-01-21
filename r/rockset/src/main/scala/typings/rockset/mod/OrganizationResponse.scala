package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationResponse extends js.Object {
  // Organization object
  var data: js.UndefOr[Organization] = js.undefined
}

object OrganizationResponse {
  @scala.inline
  def apply(data: Organization = null): OrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationResponse]
  }
}

