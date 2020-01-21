package typings.reactEventListener.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  /**
    * @default false
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var passive: js.UndefOr[Boolean] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined, passive: js.UndefOr[Boolean] = js.undefined): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

