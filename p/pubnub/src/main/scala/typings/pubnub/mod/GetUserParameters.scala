package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserParameters extends js.Object {
  var include: js.UndefOr[CustomFields] = js.undefined
  var userId: String
}

object GetUserParameters {
  @scala.inline
  def apply(userId: String, include: CustomFields = null): GetUserParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserParameters]
  }
}

