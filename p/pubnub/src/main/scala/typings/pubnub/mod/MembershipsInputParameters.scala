package typings.pubnub.mod

import typings.pubnub.AnonCustom
import typings.pubnub.AnonCustomFields
import typings.pubnub.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipsInputParameters extends GetObjectsParameters {
  var spaces: js.Array[AnonCustom]
  var userId: String
}

object MembershipsInputParameters {
  @scala.inline
  def apply(
    spaces: js.Array[AnonCustom],
    userId: String,
    include: AnonCustomFields = null,
    limit: Int | Double = null,
    page: AnonNext = null
  ): MembershipsInputParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipsInputParameters]
  }
}

