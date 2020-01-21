package typings.recaptcha2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var secretKey: String
  var siteKey: String
  var ssl: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(secretKey: String, siteKey: String, ssl: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any], siteKey = siteKey.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

