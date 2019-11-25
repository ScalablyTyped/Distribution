package typings.pubnub.pubnubMod

import typings.pubnub.Anon_Custom
import typings.pubnub.Anon_CustomFields
import typings.pubnub.Anon_Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipsInputParameters extends GetObjectsParameters {
  var spaces: js.Array[Anon_Custom]
  var userId: String
}

object MembershipsInputParameters {
  @scala.inline
  def apply(
    spaces: js.Array[Anon_Custom],
    userId: String,
    include: Anon_CustomFields = null,
    limit: Int | Double = null,
    page: Anon_Next = null
  ): MembershipsInputParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipsInputParameters]
  }
}

