package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailListCreateOptions extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var api_key: String
  var api_user: String
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object EmailListCreateOptions {
  @scala.inline
  def apply(
    api_key: String,
    api_user: String,
    address: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): EmailListCreateOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListCreateOptions]
  }
}

