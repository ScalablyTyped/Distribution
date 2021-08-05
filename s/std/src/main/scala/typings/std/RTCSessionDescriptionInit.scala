package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSessionDescriptionInit extends StObject {
  
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  
  var `type`: js.UndefOr[RTCSdpType] = js.undefined
}
object RTCSessionDescriptionInit {
  
  inline def apply(): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
  
  extension [Self <: RTCSessionDescriptionInit](x: Self) {
    
    inline def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    inline def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
    
    inline def setType(value: RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
