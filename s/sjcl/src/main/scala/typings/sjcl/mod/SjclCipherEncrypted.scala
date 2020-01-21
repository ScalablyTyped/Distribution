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
    iter: Int | Double = null,
    kemtag: BitArray_ = null,
    ks: Int | Double = null,
    mode: String = null,
    ts: Int | Double = null,
    v: Int | Double = null
  ): SjclCipherEncrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (kemtag != null) __obj.updateDynamic("kemtag")(kemtag.asInstanceOf[js.Any])
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncrypted]
  }
}

