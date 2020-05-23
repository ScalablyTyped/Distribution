package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerOptions extends js.Object {
  var capture: js.UndefOr[scala.Boolean] = js.undefined
}

object EventListenerOptions {
  @scala.inline
  def apply(capture: js.UndefOr[scala.Boolean] = js.undefined): EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerOptions]
  }
}

