package typings.puppeteer.puppeteerMod

import typings.puppeteer.puppeteerNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptionsHidden extends WaitForSelectorOptions {
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: `true`
}

object WaitForSelectorOptionsHidden {
  @scala.inline
  def apply(hidden: `true`, timeout: Int | Double = null, visible: js.UndefOr[Boolean] = js.undefined): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
}

