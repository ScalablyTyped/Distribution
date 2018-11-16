package typings
package registryDashAuthDashTokenLib.registryDashAuthDashTokenMod.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The options for passing into `registry-auth-token`
     */

trait AuthOptions extends js.Object {
  /**
           * An npmrc configuration object used when searching for tokens. If no object is provided,
           * the `.npmrc` file at the base of the project is used.
           */
  var npmrc: js.UndefOr[registryDashAuthDashTokenLib.Anon_RegistryUrls] = js.undefined
  /**
           * Wether or not url's path parts are recursively trimmed from the registry
           * url when searching for tokens
           */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

