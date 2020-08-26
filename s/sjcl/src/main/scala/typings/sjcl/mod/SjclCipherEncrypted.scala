package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclCipherEncrypted extends SjclCipherEncryptParams {
  var ct: BitArray_ = js.native
  var kemtag: js.UndefOr[BitArray_] = js.native
}

object SjclCipherEncrypted {
  @scala.inline
  def apply(ct: BitArray_, iv: BitArray_, salt: BitArray_): SjclCipherEncrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncrypted]
  }
  @scala.inline
  implicit class SjclCipherEncryptedOps[Self <: SjclCipherEncrypted] (val x: Self) extends AnyVal {
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
    def setCtVarargs(value: Double*): Self = this.set("ct", js.Array(value :_*))
    @scala.inline
    def setCt(value: BitArray_): Self = this.set("ct", value.asInstanceOf[js.Any])
    @scala.inline
    def setKemtagVarargs(value: Double*): Self = this.set("kemtag", js.Array(value :_*))
    @scala.inline
    def setKemtag(value: BitArray_): Self = this.set("kemtag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKemtag: Self = this.set("kemtag", js.undefined)
  }
  
}

