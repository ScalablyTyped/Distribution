package typings.pubnub.mod

import typings.pubnub.AnonCustomFields
import typings.pubnub.AnonNext
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
    include: AnonCustomFields = null,
    limit: Int | Double = null,
    page: AnonNext = null
  ): GetMembershipsParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembershipsParameters]
  }
}

