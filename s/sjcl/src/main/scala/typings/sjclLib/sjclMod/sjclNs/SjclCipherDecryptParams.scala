package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherDecryptParams extends SjclCipherParams {
  var iv: js.UndefOr[BitArray] = js.undefined
  var salt: js.UndefOr[BitArray] = js.undefined
}

object SjclCipherDecryptParams {
  @scala.inline
  def apply(
    adata: java.lang.String = null,
    cipher: java.lang.String = null,
    iter: scala.Int | scala.Double = null,
    iv: BitArray = null,
    ks: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    salt: BitArray = null,
    ts: scala.Int | scala.Double = null,
    v: scala.Int | scala.Double = null
  ): SjclCipherDecryptParams = {
    val __obj = js.Dynamic.literal()
    if (adata != null) __obj.updateDynamic("adata")(adata)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherDecryptParams]
  }
}

