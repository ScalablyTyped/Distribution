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

object ConnectOptions {
  @scala.inline
  def apply(
    browserURL: java.lang.String = null,
    browserWSEndpoint: java.lang.String = null,
    defaultViewport: puppeteerLib.Anon_DeviceScaleFactor = null,
    ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined,
    slowMo: scala.Int | scala.Double = null,
    transport: ConnectionTransport = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (browserURL != null) __obj.updateDynamic("browserURL")(browserURL)
    if (browserWSEndpoint != null) __obj.updateDynamic("browserWSEndpoint")(browserWSEndpoint)
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport)
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors)
    if (slowMo != null) __obj.updateDynamic("slowMo")(slowMo.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ConnectOptions]
  }
}

