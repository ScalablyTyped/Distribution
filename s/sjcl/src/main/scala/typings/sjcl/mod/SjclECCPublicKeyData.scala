package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclECCPublicKeyData extends js.Object {
  
  var x: BitArray_ = js.native
  
  var y: BitArray_ = js.native
}
object SjclECCPublicKeyData {
  
  @scala.inline
  def apply(x: BitArray_, y: BitArray_): SjclECCPublicKeyData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCPublicKeyData]
  }
  
  @scala.inline
  implicit class SjclECCPublicKeyDataOps[Self <: SjclECCPublicKeyData] (val x: Self) extends AnyVal {
    
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
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: BitArray_): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setY(value: BitArray_): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
