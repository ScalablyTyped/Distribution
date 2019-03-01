package typings
package socketioDashJwtDashAuthLib.socketioDashJwtDashAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait authOptions extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var secret: java.lang.String
  var succeedWithoutToken: js.UndefOr[scala.Boolean] = js.undefined
}

object authOptions {
  @scala.inline
  def apply(
    secret: java.lang.String,
    algorithm: java.lang.String = null,
    succeedWithoutToken: js.UndefOr[scala.Boolean] = js.undefined
  ): authOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secret")(secret)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (!js.isUndefined(succeedWithoutToken)) __obj.updateDynamic("succeedWithoutToken")(succeedWithoutToken)
    __obj.asInstanceOf[authOptions]
  }
}

