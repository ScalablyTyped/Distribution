package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPDtlsParameters extends StObject {
  
  var fingerprints: js.Array[SDPFingerprint]
  
  var role: String
}
object SDPDtlsParameters {
  
  inline def apply(fingerprints: js.Array[SDPFingerprint], role: String): SDPDtlsParameters = {
    val __obj = js.Dynamic.literal(fingerprints = fingerprints.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPDtlsParameters]
  }
  
  extension [Self <: SDPDtlsParameters](x: Self) {
    
    inline def setFingerprints(value: js.Array[SDPFingerprint]): Self = StObject.set(x, "fingerprints", value.asInstanceOf[js.Any])
    
    inline def setFingerprintsVarargs(value: SDPFingerprint*): Self = StObject.set(x, "fingerprints", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
