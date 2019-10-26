package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserParameters extends js.Object {
  var include: js.UndefOr[Anon_CustomFields] = js.undefined
  var userId: String
}

object GetUserParameters {
  @scala.inline
  def apply(userId: String, include: Anon_CustomFields = null): GetUserParameters = {
    val __obj = js.Dynamic.literal(userId = userId)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[GetUserParameters]
  }
}

