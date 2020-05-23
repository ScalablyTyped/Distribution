package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEventListenerOptions extends EventListenerOptions {
  var once: js.UndefOr[scala.Boolean] = js.undefined
  var passive: js.UndefOr[scala.Boolean] = js.undefined
}

object AddEventListenerOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    passive: js.UndefOr[scala.Boolean] = js.undefined
  ): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEventListenerOptions]
  }
}

