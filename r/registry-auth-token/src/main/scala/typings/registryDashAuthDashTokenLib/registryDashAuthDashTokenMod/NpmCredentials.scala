package typings
package registryDashAuthDashTokenLib.registryDashAuthDashTokenMod

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
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The token representing the users credentials
    */
  var token: java.lang.String
  /**
    * The type of token
    */
  var `type`: registryDashAuthDashTokenLib.registryDashAuthDashTokenLibStrings.Basic | registryDashAuthDashTokenLib.registryDashAuthDashTokenLibStrings.Bearer
  /**
    * The username used in `Basic`
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object NpmCredentials {
  @scala.inline
  def apply(
    token: java.lang.String,
    `type`: registryDashAuthDashTokenLib.registryDashAuthDashTokenLibStrings.Basic | registryDashAuthDashTokenLib.registryDashAuthDashTokenLibStrings.Bearer,
    password: java.lang.String = null,
    username: java.lang.String = null
  ): NpmCredentials = {
    val __obj = js.Dynamic.literal(token = token)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[NpmCredentials]
  }
}

