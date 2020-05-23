package typings.simplesmtp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpServerOptions extends js.Object {
  /**
    * greeting banner that is sent to the client on connection
    */
  var SMTPBanner: js.UndefOr[String] = js.undefined
  /**
    * allowed authentication methods, defaults to <code>['PLAIN', 'LOGIN']</code>
    */
  var authMethods: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * TLS credentials
    */
  var credentials: js.UndefOr[js.Any] = js.undefined
  /**
    * if set to true, print out messages about the connection
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * if set, do not validate sender domains
    */
  var disableDNSValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * if set, support HELO only
    */
  var disableEHLO: js.UndefOr[Boolean] = js.undefined
  /**
    * if set to true, client may authenticate itself but don't have to
    */
  var enableAuthentication: js.UndefOr[Boolean] = js.undefined
  /**
    * if set, allow client do not use STARTTLS
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.undefined
  /**
    * if set, limit the number of simultaneous connections to the server
    */
  var maxClients: js.UndefOr[Double] = js.undefined
  /**
    * maximum size of an e-mail in bytes
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * the hostname of the server, will be used for informational messages
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * if set to true, require that the client must authenticate itself
    */
  var requireAuthentication: js.UndefOr[Boolean] = js.undefined
  /**
    * start a server on secure connection
    */
  var secureConnection: js.UndefOr[Boolean] = js.undefined
  /**
    * client timeout in milliseconds, defaults to 60 000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object SmtpServerOptions {
  @scala.inline
  def apply(
    SMTPBanner: String = null,
    authMethods: js.Array[String] = null,
    credentials: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableDNSValidation: js.UndefOr[Boolean] = js.undefined,
    disableEHLO: js.UndefOr[Boolean] = js.undefined,
    enableAuthentication: js.UndefOr[Boolean] = js.undefined,
    ignoreTLS: js.UndefOr[Boolean] = js.undefined,
    maxClients: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    name: String = null,
    requireAuthentication: js.UndefOr[Boolean] = js.undefined,
    secureConnection: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): SmtpServerOptions = {
    val __obj = js.Dynamic.literal()
    if (SMTPBanner != null) __obj.updateDynamic("SMTPBanner")(SMTPBanner.asInstanceOf[js.Any])
    if (authMethods != null) __obj.updateDynamic("authMethods")(authMethods.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDNSValidation)) __obj.updateDynamic("disableDNSValidation")(disableDNSValidation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEHLO)) __obj.updateDynamic("disableEHLO")(disableEHLO.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAuthentication)) __obj.updateDynamic("enableAuthentication")(enableAuthentication.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTLS)) __obj.updateDynamic("ignoreTLS")(ignoreTLS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxClients)) __obj.updateDynamic("maxClients")(maxClients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(requireAuthentication)) __obj.updateDynamic("requireAuthentication")(requireAuthentication.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureConnection)) __obj.updateDynamic("secureConnection")(secureConnection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmtpServerOptions]
  }
}

