package typings.pubnub.pubnubMod

import typings.pubnub.Anon_CustomFields
import typings.pubnub.Anon_Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectsParameters extends js.Object {
  var include: js.UndefOr[Anon_CustomFields] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Anon_Next] = js.undefined
}

object GetObjectsParameters {
  @scala.inline
  def apply(include: Anon_CustomFields = null, limit: Int | Double = null, page: Anon_Next = null): GetObjectsParameters = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsParameters]
  }
}

