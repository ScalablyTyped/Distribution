package typings.pubnub.mod

import typings.pubnub.AnonCustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpaceParameters extends js.Object {
  var include: js.UndefOr[AnonCustomFields] = js.undefined
  var spaceId: String
}

object GetSpaceParameters {
  @scala.inline
  def apply(spaceId: String, include: AnonCustomFields = null): GetSpaceParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceParameters]
  }
}

