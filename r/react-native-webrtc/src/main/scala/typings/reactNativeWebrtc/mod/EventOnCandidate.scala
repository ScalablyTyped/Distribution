package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventOnCandidate extends StObject {
  
  var candidate: RTCIceCandidateType
}
object EventOnCandidate {
  
  inline def apply(candidate: RTCIceCandidateType): EventOnCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnCandidate]
  }
  
  extension [Self <: EventOnCandidate](x: Self) {
    
    inline def setCandidate(value: RTCIceCandidateType): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
  }
}
