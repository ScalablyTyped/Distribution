package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// encrypt & decrypt
trait CryptoParameters extends js.Object {
  var encryptKey: js.UndefOr[scala.Boolean] = js.undefined
  var keyEncoding: js.UndefOr[java.lang.String] = js.undefined
  var keyLength: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object CryptoParameters {
  @scala.inline
  def apply(
    encryptKey: js.UndefOr[scala.Boolean] = js.undefined,
    keyEncoding: java.lang.String = null,
    keyLength: scala.Int | scala.Double = null,
    mode: java.lang.String = null
  ): CryptoParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptKey)) __obj.updateDynamic("encryptKey")(encryptKey)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding)
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[CryptoParameters]
  }
}

