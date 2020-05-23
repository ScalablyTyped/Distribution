package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import typings.pubnub.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectsParameters extends js.Object {
  var include: js.UndefOr[CustomFields] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Next] = js.undefined
}

object GetObjectsParameters {
  @scala.inline
  def apply(include: CustomFields = null, limit: js.UndefOr[Double] = js.undefined, page: Next = null): GetObjectsParameters = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsParameters]
  }
}

