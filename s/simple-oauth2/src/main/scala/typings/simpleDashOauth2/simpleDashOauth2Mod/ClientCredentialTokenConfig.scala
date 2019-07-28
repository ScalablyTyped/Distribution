package typings.simpleDashOauth2.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialTokenConfig extends js.Object {
  /** A string that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ClientCredentialTokenConfig {
  @scala.inline
  def apply(scope: String | js.Array[String] = null): ClientCredentialTokenConfig = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialTokenConfig]
  }
}

