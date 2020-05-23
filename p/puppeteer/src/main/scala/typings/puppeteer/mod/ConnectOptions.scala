package typings.puppeteer.mod

import typings.puppeteer.anon.DeviceScaleFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends BrowserOptions {
  /**
    * A browser url to connect to, in format `http://${host}:${port}`.
    * Use interchangeably with browserWSEndpoint to let Puppeteer fetch it from metadata endpoint.
    */
  var browserURL: js.UndefOr[String] = js.undefined
  /** A browser websocket endpoint to connect to. */
  var browserWSEndpoint: js.UndefOr[String] = js.undefined
  /**
    * **Experimental** Specify a custom transport object for Puppeteer to use.
    */
  var transport: js.UndefOr[ConnectionTransport] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    browserURL: String = null,
    browserWSEndpoint: String = null,
    defaultViewport: js.UndefOr[Null | DeviceScaleFactor] = js.undefined,
    ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined,
    slowMo: js.UndefOr[Double] = js.undefined,
    transport: ConnectionTransport = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (browserURL != null) __obj.updateDynamic("browserURL")(browserURL.asInstanceOf[js.Any])
    if (browserWSEndpoint != null) __obj.updateDynamic("browserWSEndpoint")(browserWSEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultViewport)) __obj.updateDynamic("defaultViewport")(defaultViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slowMo)) __obj.updateDynamic("slowMo")(slowMo.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

