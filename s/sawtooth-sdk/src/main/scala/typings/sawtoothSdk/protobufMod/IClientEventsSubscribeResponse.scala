package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientEventsSubscribeResponse extends js.Object {
  /** ClientEventsSubscribeResponse responseMessage */
  var responseMessage: js.UndefOr[String | Null] = js.undefined
  /** ClientEventsSubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientEventsSubscribeResponse {
  @scala.inline
  def apply(responseMessage: String = null, status: Status = null): IClientEventsSubscribeResponse = {
    val __obj = js.Dynamic.literal()
    if (responseMessage != null) __obj.updateDynamic("responseMessage")(responseMessage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEventsSubscribeResponse]
  }
}

