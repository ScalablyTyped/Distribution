package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPagingControls extends js.Object {
  /** ClientPagingControls limit */
  var limit: js.UndefOr[Double | Null] = js.undefined
  /** ClientPagingControls start */
  var start: js.UndefOr[String | Null] = js.undefined
}

object IClientPagingControls {
  @scala.inline
  def apply(limit: js.UndefOr[Null | Double] = js.undefined, start: js.UndefOr[Null | String] = js.undefined): IClientPagingControls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPagingControls]
  }
}

