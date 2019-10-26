package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import typings.pubnub.Anon_Next
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
    include: Anon_CustomFields = null,
    limit: Int | Double = null,
    page: Anon_Next = null
  ): GetMembershipsParameters = {
    val __obj = js.Dynamic.literal(userId = userId)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[GetMembershipsParameters]
  }
}

