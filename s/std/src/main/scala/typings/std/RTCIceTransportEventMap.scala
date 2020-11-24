package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceTransportEventMap extends js.Object {
  
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
  implicit class RTCIceTransportEventMapOps[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatheringstatechange(value: Event): Self = this.set("gatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedcandidatepairchange(value: Event): Self = this.set("selectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechange(value: Event): Self = this.set("statechange", value.asInstanceOf[js.Any])
  }
}
