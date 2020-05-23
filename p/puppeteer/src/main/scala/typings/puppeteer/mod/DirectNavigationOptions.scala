package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectNavigationOptions extends NavigationOptions {
  /**
    * Referer header value.
    * If provided it will take preference over the referer header value set by
    * [page.setExtraHTTPHeaders()](#pagesetextrahttpheadersheaders).
    */
  var referer: js.UndefOr[String] = js.undefined
}

object DirectNavigationOptions {
  @scala.inline
  def apply(
    referer: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    waitUntil: LoadEvent | js.Array[LoadEvent] = null
  ): DirectNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (referer != null) __obj.updateDynamic("referer")(referer.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (waitUntil != null) __obj.updateDynamic("waitUntil")(waitUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectNavigationOptions]
  }
}

