package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidatePair extends StObject {
  
  /* standard dom */
  var local: js.UndefOr[RTCIceCandidate] = js.undefined
  
  /* standard dom */
  var remote: js.UndefOr[RTCIceCandidate] = js.undefined
}
object RTCIceCandidatePair {
  
  inline def apply(): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceCandidatePair] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: RTCIceCandidate): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setRemote(value: RTCIceCandidate): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
