package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceTransportEventMap extends StObject {
  
  var gatheringstatechange: Event = js.native
  
  var selectedcandidatepairchange: Event = js.native
  
  var statechange: Event = js.native
}
object RTCIceTransportEventMap {
  
  @scala.inline
  def apply(gatheringstatechange: Event, selectedcandidatepairchange: Event, statechange: Event): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  
  @scala.inline
  implicit class RTCIceTransportEventMapMutableBuilder[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatheringstatechange(value: Event): Self = StObject.set(x, "gatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedcandidatepairchange(value: Event): Self = StObject.set(x, "selectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
