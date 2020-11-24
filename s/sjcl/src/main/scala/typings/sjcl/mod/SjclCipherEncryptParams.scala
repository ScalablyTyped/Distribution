package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclCipherEncryptParams extends SjclCipherParams {
  
  var iv: BitArray_ = js.native
  
  var salt: BitArray_ = js.native
}
object SjclCipherEncryptParams {
  
  @scala.inline
  def apply(iv: BitArray_, salt: BitArray_): SjclCipherEncryptParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncryptParams]
  }
  
  @scala.inline
  implicit class SjclCipherEncryptParamsOps[Self <: SjclCipherEncryptParams] (val x: Self) extends AnyVal {
    
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
    def setIvVarargs(value: Double*): Self = this.set("iv", js.Array(value :_*))
    
    @scala.inline
    def setIv(value: BitArray_): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltVarargs(value: Double*): Self = this.set("salt", js.Array(value :_*))
    
    @scala.inline
    def setSalt(value: BitArray_): Self = this.set("salt", value.asInstanceOf[js.Any])
  }
}
