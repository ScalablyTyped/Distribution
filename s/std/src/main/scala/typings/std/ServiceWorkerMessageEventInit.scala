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
    ports: js.UndefOr[Null | js.Array[MessagePort]] = js.undefined,
    source: js.UndefOr[Null | ServiceWorker | MessagePort] = js.undefined
  ): ServiceWorkerMessageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (lastEventId != null) __obj.updateDynamic("lastEventId")(lastEventId.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(ports)) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerMessageEventInit]
  }
}

