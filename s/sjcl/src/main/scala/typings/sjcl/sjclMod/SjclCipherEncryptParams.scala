package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherEncryptParams extends SjclCipherParams {
  var iv: BitArray
  var salt: BitArray
}

object SjclCipherEncryptParams {
  @scala.inline
  def apply(
    iv: BitArray,
    salt: BitArray,
    adata: String = null,
    cipher: String = null,
    iter: Int | Double = null,
    ks: Int | Double = null,
    mode: String = null,
    ts: Int | Double = null,
    v: Int | Double = null
  ): SjclCipherEncryptParams = {
    val __obj = js.Dynamic.literal(iv = iv, salt = salt)
    if (adata != null) __obj.updateDynamic("adata")(adata)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncryptParams]
  }
}

