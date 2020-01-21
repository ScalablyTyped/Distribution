package typings.pubnub.mod

import typings.pubnub.AnonCustomFields
import typings.pubnub.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaveSpacesParameters extends GetObjectsParameters {
  var spaces: js.Array[String]
  var userId: String
}

object LeaveSpacesParameters {
  @scala.inline
  def apply(
    spaces: js.Array[String],
    userId: String,
    include: AnonCustomFields = null,
    limit: Int | Double = null,
    page: AnonNext = null
  ): LeaveSpacesParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaveSpacesParameters]
  }
}

