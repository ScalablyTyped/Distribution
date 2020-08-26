package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclCipherDecrypted extends SjclCipherEncrypted {
  var key: BitArray_ = js.native
}

object SjclCipherDecrypted {
  @scala.inline
  def apply(ct: BitArray_, iv: BitArray_, key: BitArray_, salt: BitArray_): SjclCipherDecrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherDecrypted]
  }
  @scala.inline
  implicit class SjclCipherDecryptedOps[Self <: SjclCipherDecrypted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyVarargs(value: Double*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: BitArray_): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

