package typings.pubnub.mod

import typings.pubnub.AnonCustom
import typings.pubnub.AnonCustomFields
import typings.pubnub.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersInputParameters extends GetObjectsParameters {
  var spaceId: String
  var users: js.Array[AnonCustom]
}

object MembersInputParameters {
  @scala.inline
  def apply(
    spaceId: String,
    users: js.Array[AnonCustom],
    include: AnonCustomFields = null,
    limit: Int | Double = null,
    page: AnonNext = null
  ): MembersInputParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersInputParameters]
  }
}

