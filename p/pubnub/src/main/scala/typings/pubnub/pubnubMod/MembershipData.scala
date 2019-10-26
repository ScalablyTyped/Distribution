package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipData extends js.Object {
  var created: String
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  var eTag: String
  var spaceId: String
  var updated: String
  var userId: String
}

object MembershipData {
  @scala.inline
  def apply(
    created: String,
    eTag: String,
    spaceId: String,
    updated: String,
    userId: String,
    custom: js.Object = null
  ): MembershipData = {
    val __obj = js.Dynamic.literal(created = created, eTag = eTag, spaceId = spaceId, updated = updated, userId = userId)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    __obj.asInstanceOf[MembershipData]
  }
}

