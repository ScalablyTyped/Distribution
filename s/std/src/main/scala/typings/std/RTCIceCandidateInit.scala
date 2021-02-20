package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidateInit extends StObject {
  
  var candidate: js.UndefOr[java.lang.String] = js.native
  
  var sdpMLineIndex: js.UndefOr[Double | Null] = js.native
  
  var sdpMid: js.UndefOr[java.lang.String | Null] = js.native
  
  var usernameFragment: js.UndefOr[java.lang.String | Null] = js.native
}
object RTCIceCandidateInit {
  
  @scala.inline
  def apply(): RTCIceCandidateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateInit]
  }
  
  @scala.inline
  implicit class RTCIceCandidateInitMutableBuilder[Self <: RTCIceCandidateInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: java.lang.String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateUndefined: Self = StObject.set(x, "candidate", js.undefined)
    
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMLineIndexNull: Self = StObject.set(x, "sdpMLineIndex", null)
    
    @scala.inline
    def setSdpMLineIndexUndefined: Self = StObject.set(x, "sdpMLineIndex", js.undefined)
    
    @scala.inline
    def setSdpMid(value: java.lang.String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMidNull: Self = StObject.set(x, "sdpMid", null)
    
    @scala.inline
    def setSdpMidUndefined: Self = StObject.set(x, "sdpMid", js.undefined)
    
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragmentNull: Self = StObject.set(x, "usernameFragment", null)
    
    @scala.inline
    def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
