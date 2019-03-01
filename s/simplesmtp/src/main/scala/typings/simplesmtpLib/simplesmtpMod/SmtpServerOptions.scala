package typings
package simplesmtpLib.simplesmtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpServerOptions extends js.Object {
  /**
  	 * greeting banner that is sent to the client on connection
  	 */
  var SMTPBanner: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * allowed authentication methods, defaults to <code>['PLAIN', 'LOGIN']</code>
  	 */
  var authMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * TLS credentials
  	 */
  var credentials: js.UndefOr[js.Any] = js.undefined
  /**
  	 * if set to true, print out messages about the connection
  	 */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * if set, do not validate sender domains
  	 */
  var disableDNSValidation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * if set, support HELO only
  	 */
  var disableEHLO: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * if set to true, client may authenticate itself but don't have to
  	 */
  var enableAuthentication: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * if set, allow client do not use STARTTLS
  	 */
  var ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * if set, limit the number of simultaneous connections to the server
  	 */
  var maxClients: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * maximum size of an e-mail in bytes
  	 */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the hostname of the server, will be used for informational messages
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * if set to true, require that the client must authenticate itself
  	 */
  var requireAuthentication: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * start a server on secure connection
  	 */
  var secureConnection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * client timeout in milliseconds, defaults to 60 000
  	 */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object SmtpServerOptions {
  @scala.inline
  def apply(
    SMTPBanner: java.lang.String = null,
    authMethods: js.Array[java.lang.String] = null,
    credentials: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    disableDNSValidation: js.UndefOr[scala.Boolean] = js.undefined,
    disableEHLO: js.UndefOr[scala.Boolean] = js.undefined,
    enableAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreTLS: js.UndefOr[scala.Boolean] = js.undefined,
    maxClients: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    requireAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    secureConnection: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): SmtpServerOptions = {
    val __obj = js.Dynamic.literal()
    if (SMTPBanner != null) __obj.updateDynamic("SMTPBanner")(SMTPBanner)
    if (authMethods != null) __obj.updateDynamic("authMethods")(authMethods)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disableDNSValidation)) __obj.updateDynamic("disableDNSValidation")(disableDNSValidation)
    if (!js.isUndefined(disableEHLO)) __obj.updateDynamic("disableEHLO")(disableEHLO)
    if (!js.isUndefined(enableAuthentication)) __obj.updateDynamic("enableAuthentication")(enableAuthentication)
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS)
    if (maxClients != null) __obj.updateDynamic("maxClients")(maxClients.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(requireAuthentication)) __obj.updateDynamic("requireAuthentication")(requireAuthentication)
    if (!js.isUndefined(secureConnection)) __obj.updateDynamic("secureConnection")(secureConnection)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmtpServerOptions]
  }
}

