package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclECCKeyPairData extends js.Object {
  
  var curve: String = js.native
  
  var point: String = js.native
  
  var secretKey: Boolean = js.native
  
  var `type`: String = js.native
}
object SjclECCKeyPairData {
  
  @scala.inline
  def apply(curve: String, point: String, secretKey: Boolean, `type`: String): SjclECCKeyPairData = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCKeyPairData]
  }
  
  @scala.inline
  implicit class SjclECCKeyPairDataOps[Self <: SjclECCKeyPairData] (val x: Self) extends AnyVal {
    
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
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: String): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: Boolean): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
