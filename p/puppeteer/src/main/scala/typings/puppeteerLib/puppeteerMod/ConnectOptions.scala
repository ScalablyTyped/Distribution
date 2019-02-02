package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends BrowserOptions {
  /**
    * A browser url to connect to, in format `http://${host}:${port}`.
    * Use interchangeably with browserWSEndpoint to let Puppeteer fetch it from metadata endpoint.
    */
  var browserURL: js.UndefOr[java.lang.String] = js.undefined
  /** A browser websocket endpoint to connect to. */
  var browserWSEndpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * **Experimental** Specify a custom transport object for Puppeteer to use.
    */
  var transport: js.UndefOr[ConnectionTransport] = js.undefined
}

