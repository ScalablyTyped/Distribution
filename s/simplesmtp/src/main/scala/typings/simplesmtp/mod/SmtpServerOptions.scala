package typings.simplesmtp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmtpServerOptions extends js.Object {
  /**
    * greeting banner that is sent to the client on connection
    */
  var SMTPBanner: js.UndefOr[String] = js.native
  /**
    * allowed authentication methods, defaults to <code>['PLAIN', 'LOGIN']</code>
    */
  var authMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * TLS credentials
    */
  var credentials: js.UndefOr[js.Any] = js.native
  /**
    * if set to true, print out messages about the connection
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * if set, do not validate sender domains
    */
  var disableDNSValidation: js.UndefOr[Boolean] = js.native
  /**
    * if set, support HELO only
    */
  var disableEHLO: js.UndefOr[Boolean] = js.native
  /**
    * if set to true, client may authenticate itself but don't have to
    */
  var enableAuthentication: js.UndefOr[Boolean] = js.native
  /**
    * if set, allow client do not use STARTTLS
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  /**
    * if set, limit the number of simultaneous connections to the server
    */
  var maxClients: js.UndefOr[Double] = js.native
  /**
    * maximum size of an e-mail in bytes
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * the hostname of the server, will be used for informational messages
    */
  var name: js.UndefOr[String] = js.native
  /**
    * if set to true, require that the client must authenticate itself
    */
  var requireAuthentication: js.UndefOr[Boolean] = js.native
  /**
    * start a server on secure connection
    */
  var secureConnection: js.UndefOr[Boolean] = js.native
  /**
    * client timeout in milliseconds, defaults to 60 000
    */
  var timeout: js.UndefOr[Double] = js.native
}

object SmtpServerOptions {
  @scala.inline
  def apply(): SmtpServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpServerOptions]
  }
  @scala.inline
  implicit class SmtpServerOptionsOps[Self <: SmtpServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSMTPBanner(value: String): Self = this.set("SMTPBanner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSMTPBanner: Self = this.set("SMTPBanner", js.undefined)
    @scala.inline
    def setAuthMethodsVarargs(value: String*): Self = this.set("authMethods", js.Array(value :_*))
    @scala.inline
    def setAuthMethods(value: js.Array[String]): Self = this.set("authMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMethods: Self = this.set("authMethods", js.undefined)
    @scala.inline
    def setCredentials(value: js.Any): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDisableDNSValidation(value: Boolean): Self = this.set("disableDNSValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDNSValidation: Self = this.set("disableDNSValidation", js.undefined)
    @scala.inline
    def setDisableEHLO(value: Boolean): Self = this.set("disableEHLO", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableEHLO: Self = this.set("disableEHLO", js.undefined)
    @scala.inline
    def setEnableAuthentication(value: Boolean): Self = this.set("enableAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAuthentication: Self = this.set("enableAuthentication", js.undefined)
    @scala.inline
    def setIgnoreTLS(value: Boolean): Self = this.set("ignoreTLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTLS: Self = this.set("ignoreTLS", js.undefined)
    @scala.inline
    def setMaxClients(value: Double): Self = this.set("maxClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxClients: Self = this.set("maxClients", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequireAuthentication(value: Boolean): Self = this.set("requireAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireAuthentication: Self = this.set("requireAuthentication", js.undefined)
    @scala.inline
    def setSecureConnection(value: Boolean): Self = this.set("secureConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureConnection: Self = this.set("secureConnection", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

