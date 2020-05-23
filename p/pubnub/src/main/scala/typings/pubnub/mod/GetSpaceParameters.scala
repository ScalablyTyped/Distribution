package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpaceParameters extends js.Object {
  var include: js.UndefOr[CustomFields] = js.undefined
  var spaceId: String
}

object GetSpaceParameters {
  @scala.inline
  def apply(spaceId: String, include: CustomFields = null): GetSpaceParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceParameters]
  }
}

