package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidateInit extends StObject {
  
  /* standard dom */
  var candidate: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var sdpMLineIndex: js.UndefOr[Double | Null] = js.undefined
  
  /* standard dom */
  var sdpMid: js.UndefOr[java.lang.String | Null] = js.undefined
  
  /* standard dom */
  var usernameFragment: js.UndefOr[java.lang.String | Null] = js.undefined
}
object RTCIceCandidateInit {
  
  inline def apply(): RTCIceCandidateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceCandidateInit] (val x: Self) extends AnyVal {
    
    inline def setCandidate(value: java.lang.String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setCandidateUndefined: Self = StObject.set(x, "candidate", js.undefined)
    
    inline def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    inline def setSdpMLineIndexNull: Self = StObject.set(x, "sdpMLineIndex", null)
    
    inline def setSdpMLineIndexUndefined: Self = StObject.set(x, "sdpMLineIndex", js.undefined)
    
    inline def setSdpMid(value: java.lang.String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
    
    inline def setSdpMidNull: Self = StObject.set(x, "sdpMid", null)
    
    inline def setSdpMidUndefined: Self = StObject.set(x, "sdpMid", js.undefined)
    
    inline def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    inline def setUsernameFragmentNull: Self = StObject.set(x, "usernameFragment", null)
    
    inline def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
