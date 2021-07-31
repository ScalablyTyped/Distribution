package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclECCKeyPairData extends StObject {
  
  var curve: String
  
  var point: String
  
  var secretKey: Boolean
  
  var `type`: String
}
object SjclECCKeyPairData {
  
  @scala.inline
  def apply(curve: String, point: String, secretKey: Boolean, `type`: String): SjclECCKeyPairData = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCKeyPairData]
  }
  
  @scala.inline
  implicit class SjclECCKeyPairDataMutableBuilder[Self <: SjclECCKeyPairData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: String): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: Boolean): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
