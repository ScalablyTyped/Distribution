package typings.ssDashUtils.ssutilsNs

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
    heartbeatIntervalMs: Int | Double = null,
    heartbeatUrl: String = null,
    receivers: StringDictionary[js.Any] = null,
    success: (/* selector */ String, /* msg */ String, /* e */ js.Any) => Unit = null,
    unRegisterUrl: String = null,
    validate: (/* op */ js.UndefOr[String], /* target */ js.UndefOr[String], /* msg */ js.UndefOr[String], /* json */ js.UndefOr[String]) => Boolean = null
  ): HandleServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (heartbeatIntervalMs != null) __obj.updateDynamic("heartbeatIntervalMs")(heartbeatIntervalMs.asInstanceOf[js.Any])
    if (heartbeatUrl != null) __obj.updateDynamic("heartbeatUrl")(heartbeatUrl)
    if (receivers != null) __obj.updateDynamic("receivers")(receivers)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (unRegisterUrl != null) __obj.updateDynamic("unRegisterUrl")(unRegisterUrl)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction4(validate))
    __obj.asInstanceOf[HandleServerEventsOptions]
  }
}

