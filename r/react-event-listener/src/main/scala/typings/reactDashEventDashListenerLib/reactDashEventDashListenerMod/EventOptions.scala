package typings
package reactDashEventDashListenerLib.reactDashEventDashListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  /**
    * @default false
    */
  var capture: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    */
  var passive: js.UndefOr[scala.Boolean] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    passive: js.UndefOr[scala.Boolean] = js.undefined
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    __obj.asInstanceOf[EventOptions]
  }
}

