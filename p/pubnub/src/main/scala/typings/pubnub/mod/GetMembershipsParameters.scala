package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import typings.pubnub.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Membership
trait GetMembershipsParameters extends GetObjectsParameters {
  var userId: String
}

object GetMembershipsParameters {
  @scala.inline
  def apply(
    userId: String,
    include: CustomFields = null,
    limit: js.UndefOr[Double] = js.undefined,
    page: Next = null
  ): GetMembershipsParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembershipsParameters]
  }
}

