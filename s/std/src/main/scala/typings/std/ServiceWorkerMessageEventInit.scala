package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerMessageEventInit extends EventInit {
  var data: js.UndefOr[js.Any] = js.undefined
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var ports: js.UndefOr[js.Array[MessagePort] | Null] = js.undefined
  var source: js.UndefOr[ServiceWorker | MessagePort | Null] = js.undefined
}

object ServiceWorkerMessageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    lastEventId: java.lang.String = null,
    origin: java.lang.String = null,
    ports: js.Array[MessagePort] = null,
    source: ServiceWorker | MessagePort = null
  ): ServiceWorkerMessageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (data != null) __obj.updateDynamic("data")(data)
    if (lastEventId != null) __obj.updateDynamic("lastEventId")(lastEventId)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerMessageEventInit]
  }
}

