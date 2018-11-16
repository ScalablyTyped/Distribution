package typings
package registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs

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

