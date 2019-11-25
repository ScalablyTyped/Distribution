package typings.sortablejs.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwapOptions extends js.Object {
  /**
    * Enable swap mode
    */
  var swap: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name for swap item (if swap mode is enabled)
    */
  var swapClass: js.UndefOr[String] = js.undefined
}

object SwapOptions {
  @scala.inline
  def apply(swap: js.UndefOr[Boolean] = js.undefined, swapClass: String = null): SwapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swap)) __obj.updateDynamic("swap")(swap.asInstanceOf[js.Any])
    if (swapClass != null) __obj.updateDynamic("swapClass")(swapClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapOptions]
  }
}

