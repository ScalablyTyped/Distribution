package typings.socketioJwtAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait authOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var secret: String
  var succeedWithoutToken: js.UndefOr[Boolean] = js.undefined
}

object authOptions {
  @scala.inline
  def apply(secret: String, algorithm: String = null, succeedWithoutToken: js.UndefOr[Boolean] = js.undefined): authOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(succeedWithoutToken)) __obj.updateDynamic("succeedWithoutToken")(succeedWithoutToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[authOptions]
  }
}

