package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectOptions extends js.Object {
  /** A browser websocket endpoint to connect to. */
  var browserWSEndpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Whether to ignore HTTPS errors during navigation.
     * @default false
     */
  var ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined
}

