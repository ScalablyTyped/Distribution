package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserEventObj extends js.Object {
  /** Emitted when puppeteer gets disconnected from the browser instance. */
  var disconnected: js.UndefOr[scala.Nothing]
  /** Emitted when the url of a target changes. */
  var targetchanged: Target
  /** Emitted when a target is created, for example when a new page is opened by `window.open` or `browser.newPage`. */
  var targetcreated: Target
  /** Emitted when a target is destroyed, for example when a page is closed. */
  var targetdestroyed: Target
}

object BrowserEventObj {
  @scala.inline
  def apply(
    targetchanged: Target,
    targetcreated: Target,
    targetdestroyed: Target,
    disconnected: js.UndefOr[scala.Nothing] = js.undefined
  ): BrowserEventObj = {
    val __obj = js.Dynamic.literal(targetchanged = targetchanged, targetcreated = targetcreated, targetdestroyed = targetdestroyed)
    if (!js.isUndefined(disconnected)) __obj.updateDynamic("disconnected")(disconnected)
    __obj.asInstanceOf[BrowserEventObj]
  }
}

