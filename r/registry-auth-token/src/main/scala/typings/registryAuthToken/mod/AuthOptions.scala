package typings.registryAuthToken.mod

import typings.registryAuthToken.AnonRegistry
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
  var npmrc: js.UndefOr[AnonRegistry] = js.undefined
  /**
    * Wether or not url's path parts are recursively trimmed from the registry
    * url when searching for tokens
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(npmrc: AnonRegistry = null, recursive: js.UndefOr[Boolean] = js.undefined): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (npmrc != null) __obj.updateDynamic("npmrc")(npmrc.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

