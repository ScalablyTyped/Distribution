package typings
package sjclLib.sjclMod

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
    adata: java.lang.String = null,
    cipher: java.lang.String = null,
    iter: scala.Int | scala.Double = null,
    ks: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    ts: scala.Int | scala.Double = null,
    v: scala.Int | scala.Double = null
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

