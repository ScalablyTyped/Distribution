package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherDecrypted extends SjclCipherEncrypted {
  var key: BitArray
}

object SjclCipherDecrypted {
  @scala.inline
  def apply(
    ct: BitArray,
    iv: BitArray,
    key: BitArray,
    salt: BitArray,
    adata: java.lang.String = null,
    cipher: java.lang.String = null,
    iter: scala.Int | scala.Double = null,
    kemtag: BitArray = null,
    ks: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    ts: scala.Int | scala.Double = null,
    v: scala.Int | scala.Double = null
  ): SjclCipherDecrypted = {
    val __obj = js.Dynamic.literal(ct = ct, iv = iv, key = key, salt = salt)
    if (adata != null) __obj.updateDynamic("adata")(adata)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (kemtag != null) __obj.updateDynamic("kemtag")(kemtag)
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherDecrypted]
  }
}

