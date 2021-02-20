package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPFingerprint extends StObject {
  
  var algorithm: String = js.native
  
  var value: String = js.native
}
object SDPFingerprint {
  
  @scala.inline
  def apply(algorithm: String, value: String): SDPFingerprint = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPFingerprint]
  }
  
  @scala.inline
  implicit class SDPFingerprintMutableBuilder[Self <: SDPFingerprint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
