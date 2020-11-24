package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclCipherDecryptParams extends SjclCipherParams {
  
  var iv: js.UndefOr[BitArray_] = js.native
  
  var salt: js.UndefOr[BitArray_] = js.native
}
object SjclCipherDecryptParams {
  
  @scala.inline
  def apply(): SjclCipherDecryptParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SjclCipherDecryptParams]
  }
  
  @scala.inline
  implicit class SjclCipherDecryptParamsOps[Self <: SjclCipherDecryptParams] (val x: Self) extends AnyVal {
    
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
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setSaltVarargs(value: Double*): Self = this.set("salt", js.Array(value :_*))
    
    @scala.inline
    def setSalt(value: BitArray_): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
}
