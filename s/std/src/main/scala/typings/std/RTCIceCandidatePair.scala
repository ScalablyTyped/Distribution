package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidatePair extends StObject {
  
  var local: js.UndefOr[RTCIceCandidate] = js.native
  
  var remote: js.UndefOr[RTCIceCandidate] = js.native
}
object RTCIceCandidatePair {
  
  @scala.inline
  def apply(): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
  
  @scala.inline
  implicit class RTCIceCandidatePairMutableBuilder[Self <: RTCIceCandidatePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: RTCIceCandidate): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setRemote(value: RTCIceCandidate): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
