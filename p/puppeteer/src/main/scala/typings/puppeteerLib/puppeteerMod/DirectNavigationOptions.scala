package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectNavigationOptions extends NavigationOptions {
  /**
     * Referer header value.
     * If provided it will take preference over the referer header value set by
     * [page.setExtraHTTPHeaders()](#pagesetextrahttpheadersheaders).
     */
  var referer: js.UndefOr[java.lang.String] = js.undefined
}

