package typings.registryDashAuthDashToken.registryDashAuthDashTokenMod

import typings.registryDashAuthDashToken.registryDashAuthDashTokenStrings.Basic
import typings.registryDashAuthDashToken.registryDashAuthDashTokenStrings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The generated authentication information
  */
trait NpmCredentials extends js.Object {
  /**
    * The password used in `Basic`
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * The token representing the users credentials
    */
  var token: String
  /**
    * The type of token
    */
  var `type`: Basic | Bearer
  /**
    * The username used in `Basic`
    */
  var username: js.UndefOr[String] = js.undefined
}

object NpmCredentials {
  @scala.inline
  def apply(token: String, `type`: Basic | Bearer, password: String = null, username: String = null): NpmCredentials = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmCredentials]
  }
}

