package typings.pubnub.pubnubMod

import typings.pubnub.Anon_Custom
import typings.pubnub.Anon_CustomFields
import typings.pubnub.Anon_Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersInputParameters extends GetObjectsParameters {
  var spaceId: String
  var users: js.Array[Anon_Custom]
}

object MembersInputParameters {
  @scala.inline
  def apply(
    spaceId: String,
    users: js.Array[Anon_Custom],
    include: Anon_CustomFields = null,
    limit: Int | Double = null,
    page: Anon_Next = null
  ): MembersInputParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersInputParameters]
  }
}

