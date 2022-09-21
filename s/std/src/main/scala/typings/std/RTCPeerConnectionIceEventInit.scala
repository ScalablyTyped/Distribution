package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionIceEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var candidate: js.UndefOr[RTCIceCandidate | Null] = js.undefined
  
  /* standard dom */
  var url: js.UndefOr[java.lang.String | Null] = js.undefined
}
object RTCPeerConnectionIceEventInit {
  
  inline def apply(): RTCPeerConnectionIceEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCPeerConnectionIceEventInit]
  }
  
  extension [Self <: RTCPeerConnectionIceEventInit](x: Self) {
    
    inline def setCandidate(value: RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setCandidateNull: Self = StObject.set(x, "candidate", null)
    
    inline def setCandidateUndefined: Self = StObject.set(x, "candidate", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
