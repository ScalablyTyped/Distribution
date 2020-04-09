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
  def apply(limit: Int | Double = null, next: String = null, start: String = null): IClientPagingResponse = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPagingResponse]
  }
}

