package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpaceParameters extends js.Object {
  var include: js.UndefOr[Anon_CustomFields] = js.undefined
  var spaceId: String
}

object GetSpaceParameters {
  @scala.inline
  def apply(spaceId: String, include: Anon_CustomFields = null): GetSpaceParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[GetSpaceParameters]
  }
}

