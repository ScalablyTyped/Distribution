package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceGathererEventMap extends StObject {
  
  var error: Event
  
  var localcandidate: RTCIceGathererEvent
}
object RTCIceGathererEventMap {
  
  inline def apply(error: Event, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], localcandidate = localcandidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
  
  extension [Self <: RTCIceGathererEventMap](x: Self) {
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLocalcandidate(value: RTCIceGathererEvent): Self = StObject.set(x, "localcandidate", value.asInstanceOf[js.Any])
  }
}
