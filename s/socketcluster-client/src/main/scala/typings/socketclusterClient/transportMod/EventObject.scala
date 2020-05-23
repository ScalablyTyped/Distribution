package typings.socketclusterClient.transportMod

import typings.node.NodeJS.Timer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var callback: js.UndefOr[EventObjectCallback] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
  var data: js.Any
  var event: String
  var timeout: js.UndefOr[Timer] = js.undefined
}

object EventObject {
  @scala.inline
  def apply(
    data: js.Any,
    event: String,
    callback: (/* error */ Error, /* eventObject */ EventObject) => Unit = null,
    cid: js.UndefOr[Double] = js.undefined,
    timeout: Timer = null
  ): EventObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
}

