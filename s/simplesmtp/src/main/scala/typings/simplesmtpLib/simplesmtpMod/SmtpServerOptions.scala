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

