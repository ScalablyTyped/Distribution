package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusCancelBlockResponse extends js.Object {
  /** ConsensusCancelBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusCancelBlockResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): IConsensusCancelBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusCancelBlockResponse]
  }
}

