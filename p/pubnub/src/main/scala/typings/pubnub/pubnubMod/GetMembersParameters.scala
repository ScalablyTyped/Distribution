package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import typings.pubnub.Anon_Next
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
    include: Anon_CustomFields = null,
    limit: Int | Double = null,
    page: Anon_Next = null
  ): GetMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersParameters]
  }
}

