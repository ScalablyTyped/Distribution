package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptions extends Timeoutable {
  /**
    * Wait for element to not be found in the DOM or to be hidden,
    * i.e. have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Wait for element to be present in DOM and to be visible,
    * i.e. to not have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object WaitForSelectorOptions {
  @scala.inline
  def apply(
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WaitForSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WaitForSelectorOptions]
  }
}

