package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherEncrypted extends SjclCipherEncryptParams {
  var ct: BitArray_
  var kemtag: js.UndefOr[BitArray_] = js.undefined
}

object SjclCipherEncrypted {
  @scala.inline
  def apply(
    ct: BitArray_,
    iv: BitArray_,
    salt: BitArray_,
    adata: String = null,
    cipher: String = null,
    iter: js.UndefOr[Double] = js.undefined,
    kemtag: BitArray_ = null,
    ks: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    ts: js.UndefOr[Double] = js.undefined,
    v: js.UndefOr[Double] = js.undefined
  ): SjclCipherEncrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (!js.isUndefined(iter)) __obj.updateDynamic("iter")(iter.get.asInstanceOf[js.Any])
    if (kemtag != null) __obj.updateDynamic("kemtag")(kemtag.asInstanceOf[js.Any])
    if (!js.isUndefined(ks)) __obj.updateDynamic("ks")(ks.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncrypted]
  }
}

