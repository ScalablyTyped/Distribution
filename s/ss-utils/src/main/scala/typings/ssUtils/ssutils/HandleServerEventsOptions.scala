package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleServerEventsOptions extends js.Object {
  var handlers: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var heartbeatIntervalMs: js.UndefOr[Double] = js.undefined
  var heartbeatUrl: js.UndefOr[String] = js.undefined
  var receivers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var success: js.UndefOr[js.Function3[/* selector */ String, /* msg */ String, /* e */ js.Any, Unit]] = js.undefined
  var unRegisterUrl: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[String], 
      /* target */ js.UndefOr[String], 
      /* msg */ js.UndefOr[String], 
      /* json */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.undefined
}

object HandleServerEventsOptions {
  @scala.inline
  def apply(
    handlers: StringDictionary[js.Function] = null,
    heartbeatIntervalMs: js.UndefOr[Double] = js.undefined,
    heartbeatUrl: String = null,
    receivers: StringDictionary[js.Any] = null,
    success: (/* selector */ String, /* msg */ String, /* e */ js.Any) => Unit = null,
    unRegisterUrl: String = null,
    validate: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => Boolean = null
  ): HandleServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatIntervalMs)) __obj.updateDynamic("heartbeatIntervalMs")(heartbeatIntervalMs.get.asInstanceOf[js.Any])
    if (heartbeatUrl != null) __obj.updateDynamic("heartbeatUrl")(heartbeatUrl.asInstanceOf[js.Any])
    if (receivers != null) __obj.updateDynamic("receivers")(receivers.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (unRegisterUrl != null) __obj.updateDynamic("unRegisterUrl")(unRegisterUrl.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction4(validate))
    __obj.asInstanceOf[HandleServerEventsOptions]
  }
}

