package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientEventsUnsubscribeResponse extends js.Object {
  /** ClientEventsUnsubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientEventsUnsubscribeResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): IClientEventsUnsubscribeResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsUnsubscribeResponse]
  }
}

