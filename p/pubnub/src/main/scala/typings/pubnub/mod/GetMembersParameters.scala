package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import typings.pubnub.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Member
trait GetMembersParameters extends GetObjectsParameters {
  var spaceId: String
}

object GetMembersParameters {
  @scala.inline
  def apply(
    spaceId: String,
    include: CustomFields = null,
    limit: js.UndefOr[Double] = js.undefined,
    page: Next = null
  ): GetMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersParameters]
  }
}

