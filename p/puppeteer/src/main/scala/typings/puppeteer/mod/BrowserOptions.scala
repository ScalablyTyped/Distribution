package typings.puppeteer.mod

import typings.puppeteer.anon.DeviceScaleFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserOptions extends js.Object {
  /**
    * Sets a consistent viewport for each page. Defaults to an 800x600 viewport. null disables the default viewport.
    */
  var defaultViewport: js.UndefOr[DeviceScaleFactor | Null] = js.undefined
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @default false
    */
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds.
    * Useful so that you can see what is going on.
    */
  var slowMo: js.UndefOr[Double] = js.undefined
}

object BrowserOptions {
  @scala.inline
  def apply(
    defaultViewport: js.UndefOr[Null | DeviceScaleFactor] = js.undefined,
    ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined,
    slowMo: js.UndefOr[Double] = js.undefined
  ): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultViewport)) __obj.updateDynamic("defaultViewport")(defaultViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slowMo)) __obj.updateDynamic("slowMo")(slowMo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserOptions]
  }
}

