package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptions extends Timeoutable {
  /**
    * Wait for element to not be found in the DOM or to be hidden,
    * i.e. have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Wait for element to be present in DOM and to be visible,
    * i.e. to not have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object WaitForSelectorOptions {
  @scala.inline
  def apply(
    hidden: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WaitForSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForSelectorOptions]
  }
}

