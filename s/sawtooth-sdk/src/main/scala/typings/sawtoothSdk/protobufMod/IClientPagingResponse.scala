package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPagingResponse extends js.Object {
  /** ClientPagingResponse limit */
  var limit: js.UndefOr[Double | Null] = js.undefined
  /** ClientPagingResponse next */
  var next: js.UndefOr[String | Null] = js.undefined
  /** ClientPagingResponse start */
  var start: js.UndefOr[String | Null] = js.undefined
}

object IClientPagingResponse {
  @scala.inline
  def apply(
    limit: js.UndefOr[Null | Double] = js.undefined,
    next: js.UndefOr[Null | String] = js.undefined,
    start: js.UndefOr[Null | String] = js.undefined
  ): IClientPagingResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPagingResponse]
  }
}

