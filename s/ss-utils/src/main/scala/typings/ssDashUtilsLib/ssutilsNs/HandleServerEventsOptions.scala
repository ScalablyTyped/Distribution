package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleServerEventsOptions extends js.Object {
  var handlers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function]] = js.undefined
  var heartbeatIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var heartbeatUrl: js.UndefOr[java.lang.String] = js.undefined
  var receivers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* selector */ java.lang.String, 
      /* msg */ java.lang.String, 
      /* e */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var unRegisterUrl: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[
    js.Function4[
      /* op */ js.UndefOr[java.lang.String], 
      /* target */ js.UndefOr[java.lang.String], 
      /* msg */ js.UndefOr[java.lang.String], 
      /* json */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
}

object HandleServerEventsOptions {
  @scala.inline
  def apply(
    handlers: org.scalablytyped.runtime.StringDictionary[js.Function] = null,
    heartbeatIntervalMs: scala.Int | scala.Double = null,
    heartbeatUrl: java.lang.String = null,
    receivers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    success: (/* selector */ java.lang.String, /* msg */ java.lang.String, /* e */ js.Any) => scala.Unit = null,
    unRegisterUrl: java.lang.String = null,
    validate: (/* op */ js.UndefOr[java.lang.String], /* target */ js.UndefOr[java.lang.String], /* msg */ js.UndefOr[java.lang.String], /* json */ js.UndefOr[java.lang.String]) => scala.Boolean = null
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

