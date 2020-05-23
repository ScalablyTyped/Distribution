package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpEventAddRequest extends js.Object {
  /** TpEventAddRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  /** TpEventAddRequest event */
  var event: js.UndefOr[IEvent | Null] = js.undefined
}

object ITpEventAddRequest {
  @scala.inline
  def apply(
    contextId: js.UndefOr[Null | String] = js.undefined,
    event: js.UndefOr[Null | IEvent] = js.undefined
  ): ITpEventAddRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextId)) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (!js.isUndefined(event)) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpEventAddRequest]
  }
}

