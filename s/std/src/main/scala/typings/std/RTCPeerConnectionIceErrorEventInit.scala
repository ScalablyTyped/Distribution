package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionIceErrorEventInit
  extends StObject
     with EventInit {
  
  var errorCode: Double
  
  var hostCandidate: js.UndefOr[java.lang.String] = js.undefined
  
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object RTCPeerConnectionIceErrorEventInit {
  
  inline def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  
  extension [Self <: RTCPeerConnectionIceErrorEventInit](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setHostCandidate(value: java.lang.String): Self = StObject.set(x, "hostCandidate", value.asInstanceOf[js.Any])
    
    inline def setHostCandidateUndefined: Self = StObject.set(x, "hostCandidate", js.undefined)
    
    inline def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
