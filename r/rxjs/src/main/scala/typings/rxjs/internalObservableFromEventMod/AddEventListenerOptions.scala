package typings.rxjs.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEventListenerOptions extends EventListenerOptions

object AddEventListenerOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined
  ): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    __obj.asInstanceOf[AddEventListenerOptions]
  }
}

