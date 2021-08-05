package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPFingerprint extends StObject {
  
  var algorithm: String
  
  var value: String
}
object SDPFingerprint {
  
  inline def apply(algorithm: String, value: String): SDPFingerprint = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPFingerprint]
  }
  
  extension [Self <: SDPFingerprint](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
