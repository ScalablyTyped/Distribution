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
  def apply(contextId: String = null, event: IEvent = null): ITpEventAddRequest = {
    val __obj = js.Dynamic.literal()
    if (contextId != null) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpEventAddRequest]
  }
}

