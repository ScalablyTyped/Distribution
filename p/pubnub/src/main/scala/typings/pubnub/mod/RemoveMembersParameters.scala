package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import typings.pubnub.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMembersParameters extends GetObjectsParameters {
  var spaceId: String
  var users: js.Array[String]
}

object RemoveMembersParameters {
  @scala.inline
  def apply(
    spaceId: String,
    users: js.Array[String],
    include: CustomFields = null,
    limit: js.UndefOr[Double] = js.undefined,
    page: Next = null
  ): RemoveMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembersParameters]
  }
}

