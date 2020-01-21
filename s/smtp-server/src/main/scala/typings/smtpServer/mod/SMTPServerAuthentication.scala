package typings.smtpServer.mod

import typings.smtpServer.smtpServerStrings.LOGIN
import typings.smtpServer.smtpServerStrings.PLAIN
import typings.smtpServer.smtpServerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerAuthentication extends js.Object {
  /**
    *  the OAuth2 bearer access token if 'XOAUTH2' was used as the authentication method
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * indicates the authentication method used, 'PLAIN', 'LOGIN' or 'XOAUTH2'
    */
  var method: PLAIN | LOGIN | XOAUTH2
  /**
    * the password if LOGIN or PLAIN was used
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * the username of the user
    */
  var username: js.UndefOr[String] = js.undefined
  /**
    * a function for validating CRAM-MD5 challenge responses.
    * Takes the password of the user as an argument and returns true if the response matches the password
    */
  def validatePassword(password: String): Boolean
}

object SMTPServerAuthentication {
  @scala.inline
  def apply(
    method: PLAIN | LOGIN | XOAUTH2,
    validatePassword: String => Boolean,
    accessToken: String = null,
    password: String = null,
    username: String = null
  ): SMTPServerAuthentication = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], validatePassword = js.Any.fromFunction1(validatePassword))
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerAuthentication]
  }
}

