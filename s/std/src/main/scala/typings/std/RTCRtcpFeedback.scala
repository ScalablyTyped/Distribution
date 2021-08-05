package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtcpFeedback extends StObject {
  
  var parameter: js.UndefOr[java.lang.String] = js.undefined
  
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtcpFeedback {
  
  inline def apply(): RTCRtcpFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtcpFeedback]
  }
  
  extension [Self <: RTCRtcpFeedback](x: Self) {
    
    inline def setParameter(value: java.lang.String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
