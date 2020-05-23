package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherEncryptParams extends SjclCipherParams {
  var iv: BitArray_
  var salt: BitArray_
}

object SjclCipherEncryptParams {
  @scala.inline
  def apply(
    iv: BitArray_,
    salt: BitArray_,
    adata: String = null,
    cipher: String = null,
    iter: js.UndefOr[Double] = js.undefined,
    ks: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    ts: js.UndefOr[Double] = js.undefined,
    v: js.UndefOr[Double] = js.undefined
  ): SjclCipherEncryptParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (!js.isUndefined(iter)) __obj.updateDynamic("iter")(iter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ks)) __obj.updateDynamic("ks")(ks.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncryptParams]
  }
}

