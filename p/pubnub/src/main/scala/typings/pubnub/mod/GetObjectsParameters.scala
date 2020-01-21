package typings.pubnub.mod

import typings.pubnub.AnonCustomFields
import typings.pubnub.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectsParameters extends js.Object {
  var include: js.UndefOr[AnonCustomFields] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[AnonNext] = js.undefined
}

object GetObjectsParameters {
  @scala.inline
  def apply(include: AnonCustomFields = null, limit: Int | Double = null, page: AnonNext = null): GetObjectsParameters = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsParameters]
  }
}

