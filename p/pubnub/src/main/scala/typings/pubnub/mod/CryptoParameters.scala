package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// encrypt & decrypt
trait CryptoParameters extends js.Object {
  var encryptKey: js.UndefOr[Boolean] = js.undefined
  var keyEncoding: js.UndefOr[String] = js.undefined
  var keyLength: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object CryptoParameters {
  @scala.inline
  def apply(
    encryptKey: js.UndefOr[Boolean] = js.undefined,
    keyEncoding: String = null,
    keyLength: Int | Double = null,
    mode: String = null
  ): CryptoParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptKey)) __obj.updateDynamic("encryptKey")(encryptKey.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoParameters]
  }
}

