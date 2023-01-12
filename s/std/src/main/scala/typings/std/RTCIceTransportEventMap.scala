package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceTransportEventMap extends StObject {
  
  /* standard dom */
  var gatheringstatechange: Event
  
  /* standard dom */
  var statechange: Event
}
object RTCIceTransportEventMap {
  
  inline def apply(gatheringstatechange: Event, statechange: Event): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
    
    inline def setGatheringstatechange(value: Event): Self = StObject.set(x, "gatheringstatechange", value.asInstanceOf[js.Any])
    
    inline def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
