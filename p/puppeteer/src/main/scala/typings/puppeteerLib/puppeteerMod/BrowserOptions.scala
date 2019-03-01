package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserOptions extends js.Object {
  /**
    * Sets a consistent viewport for each page. Defaults to an 800x600 viewport. null disables the default viewport.
    */
  var defaultViewport: js.UndefOr[puppeteerLib.Anon_DeviceScaleFactor | scala.Null] = js.undefined
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @default false
    */
  var ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds.
    * Useful so that you can see what is going on.
    */
  var slowMo: js.UndefOr[scala.Double] = js.undefined
}

object BrowserOptions {
  @scala.inline
  def apply(
    defaultViewport: puppeteerLib.Anon_DeviceScaleFactor = null,
    ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined,
    slowMo: scala.Int | scala.Double = null
  ): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport)
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors)
    if (slowMo != null) __obj.updateDynamic("slowMo")(slowMo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserOptions]
  }
}

