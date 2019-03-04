package typings
package recaptcha2Lib.recaptcha2Mod.Recaptcha2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var secretKey: java.lang.String
  var siteKey: java.lang.String
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    secretKey: java.lang.String,
    siteKey: java.lang.String,
    ssl: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(secretKey = secretKey, siteKey = siteKey)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[Options]
  }
}

