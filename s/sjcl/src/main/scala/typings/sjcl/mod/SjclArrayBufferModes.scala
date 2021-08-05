package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclArrayBufferModes extends StObject {
  
  var ccm: SjclArrayBufferCCMMode
}
object SjclArrayBufferModes {
  
  inline def apply(ccm: SjclArrayBufferCCMMode): SjclArrayBufferModes = {
    val __obj = js.Dynamic.literal(ccm = ccm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclArrayBufferModes]
  }
  
  extension [Self <: SjclArrayBufferModes](x: Self) {
    
    inline def setCcm(value: SjclArrayBufferCCMMode): Self = StObject.set(x, "ccm", value.asInstanceOf[js.Any])
  }
}
