package typings.puppeteer.mod

import typings.puppeteer.puppeteerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptionsHidden extends WaitForSelectorOptions {
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: `true`
}

object WaitForSelectorOptionsHidden {
  @scala.inline
  def apply(
    hidden: `true`,
    timeout: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
}

