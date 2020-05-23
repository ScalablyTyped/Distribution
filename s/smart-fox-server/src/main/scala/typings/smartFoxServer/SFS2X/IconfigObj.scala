package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconfigObj extends js.Object {
  /** @type {boolean} Indicates whether the client-server messages console debug should be enabled or not. */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** @type {string} The IP address or host name of the SmartFoxServer 2X instance to connect to. */
  var host: js.UndefOr[String] = js.undefined
  /** @type {number} The TCP port of the SmartFoxServer 2X instance to connect to. */
  var port: js.UndefOr[Double] = js.undefined
  /** @type {boolean} Use an encrypted SSL connection. */
  var useSSL: js.UndefOr[Boolean] = js.undefined
  /** @type {string} The Zone of the SmartFoxServer 2X instance to join during the login process. */
  var zone: js.UndefOr[String] = js.undefined
}

object IconfigObj {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: js.UndefOr[Double] = js.undefined,
    useSSL: js.UndefOr[Boolean] = js.undefined,
    zone: String = null
  ): IconfigObj = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL.get.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconfigObj]
  }
}

