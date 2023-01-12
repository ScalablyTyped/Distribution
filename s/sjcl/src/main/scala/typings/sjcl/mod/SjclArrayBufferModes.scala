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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclArrayBufferModes] (val x: Self) extends AnyVal {
    
    inline def setCcm(value: SjclArrayBufferCCMMode): Self = StObject.set(x, "ccm", value.asInstanceOf[js.Any])
  }
}
