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
  
  inline def apply(curve: String, point: String, secretKey: Boolean, `type`: String): SjclECCKeyPairData = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCKeyPairData]
  }
  
  extension [Self <: SjclECCKeyPairData](x: Self) {
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: String): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: Boolean): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
