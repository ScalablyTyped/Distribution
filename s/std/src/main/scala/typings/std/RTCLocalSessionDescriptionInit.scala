package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCLocalSessionDescriptionInit extends StObject {
  
  /* standard dom */
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[RTCSdpType] = js.undefined
}
object RTCLocalSessionDescriptionInit {
  
  inline def apply(): RTCLocalSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCLocalSessionDescriptionInit]
  }
  
  extension [Self <: RTCLocalSessionDescriptionInit](x: Self) {
    
    inline def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    inline def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
    
    inline def setType(value: RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
