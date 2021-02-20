package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPDtlsParameters extends StObject {
  
  var fingerprints: js.Array[SDPFingerprint] = js.native
  
  var role: String = js.native
}
object SDPDtlsParameters {
  
  @scala.inline
  def apply(fingerprints: js.Array[SDPFingerprint], role: String): SDPDtlsParameters = {
    val __obj = js.Dynamic.literal(fingerprints = fingerprints.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPDtlsParameters]
  }
  
  @scala.inline
  implicit class SDPDtlsParametersMutableBuilder[Self <: SDPDtlsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprints(value: js.Array[SDPFingerprint]): Self = StObject.set(x, "fingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintsVarargs(value: SDPFingerprint*): Self = StObject.set(x, "fingerprints", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
