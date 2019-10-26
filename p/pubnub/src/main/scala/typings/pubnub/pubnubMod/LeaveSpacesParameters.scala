package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import typings.pubnub.Anon_Next
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
    include: Anon_CustomFields = null,
    limit: Int | Double = null,
    page: Anon_Next = null
  ): LeaveSpacesParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces, userId = userId)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[LeaveSpacesParameters]
  }
}

