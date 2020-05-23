package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockGetResponse extends js.Object {
  /** ClientBlockGetResponse block */
  var block: js.UndefOr[IBlock | Null] = js.undefined
  /** ClientBlockGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBlockGetResponse {
  @scala.inline
  def apply(block: js.UndefOr[Null | IBlock] = js.undefined, status: js.UndefOr[Null | Status] = js.undefined): IClientBlockGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockGetResponse]
  }
}

