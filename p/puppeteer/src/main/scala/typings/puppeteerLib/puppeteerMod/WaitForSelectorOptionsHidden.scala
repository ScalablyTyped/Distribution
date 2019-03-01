package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptionsHidden extends WaitForSelectorOptions {
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: puppeteerLib.puppeteerLibNumbers.`true`
}

object WaitForSelectorOptionsHidden {
  @scala.inline
  def apply(
    hidden: puppeteerLib.puppeteerLibNumbers.`true`,
    timeout: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hidden")(hidden)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
}

