package typings.pubnub.mod

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
    custom: js.UndefOr[Null | js.Object] = js.undefined
  ): MembershipData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], spaceId = spaceId.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipData]
  }
}

