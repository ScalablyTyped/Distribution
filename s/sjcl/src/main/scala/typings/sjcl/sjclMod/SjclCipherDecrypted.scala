package typings.sjcl.sjclMod

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
    adata: String = null,
    cipher: String = null,
    iter: Int | Double = null,
    kemtag: BitArray = null,
    ks: Int | Double = null,
    mode: String = null,
    ts: Int | Double = null,
    v: Int | Double = null
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

