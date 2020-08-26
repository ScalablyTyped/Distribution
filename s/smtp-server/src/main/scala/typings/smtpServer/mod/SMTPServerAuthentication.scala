package typings.smtpServer.mod

import typings.smtpServer.smtpServerStrings.LOGIN
import typings.smtpServer.smtpServerStrings.PLAIN
import typings.smtpServer.smtpServerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerAuthentication extends js.Object {
  /**
    *  the OAuth2 bearer access token if 'XOAUTH2' was used as the authentication method
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * indicates the authentication method used, 'PLAIN', 'LOGIN' or 'XOAUTH2'
    */
  var method: PLAIN | LOGIN | XOAUTH2 = js.native
  /**
    * the password if LOGIN or PLAIN was used
    */
  var password: js.UndefOr[String] = js.native
  /**
    * the username of the user
    */
  var username: js.UndefOr[String] = js.native
  /**
    * a function for validating CRAM-MD5 challenge responses.
    * Takes the password of the user as an argument and returns true if the response matches the password
    */
  def validatePassword(password: String): Boolean = js.native
}

object SMTPServerAuthentication {
  @scala.inline
  def apply(method: PLAIN | LOGIN | XOAUTH2, validatePassword: String => Boolean): SMTPServerAuthentication = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], validatePassword = js.Any.fromFunction1(validatePassword))
    __obj.asInstanceOf[SMTPServerAuthentication]
  }
  @scala.inline
  implicit class SMTPServerAuthenticationOps[Self <: SMTPServerAuthentication] (val x: Self) extends AnyVal {
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
    def setMethod(value: PLAIN | LOGIN | XOAUTH2): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatePassword(value: String => Boolean): Self = this.set("validatePassword", js.Any.fromFunction1(value))
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

