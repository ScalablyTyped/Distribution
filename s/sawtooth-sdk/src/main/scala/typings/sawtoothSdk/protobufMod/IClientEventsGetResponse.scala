package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientEventsGetResponse extends js.Object {
  /** ClientEventsGetResponse events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
  /** ClientEventsGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientEventsGetResponse {
  @scala.inline
  def apply(
    events: js.UndefOr[Null | js.Array[IEvent]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientEventsGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsGetResponse]
  }
}

