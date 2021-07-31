package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSessionDescriptionInit extends StObject {
  
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  
  var `type`: js.UndefOr[RTCSdpType] = js.undefined
}
object RTCSessionDescriptionInit {
  
  @scala.inline
  def apply(): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
  
  @scala.inline
  implicit class RTCSessionDescriptionInitMutableBuilder[Self <: RTCSessionDescriptionInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
    
    @scala.inline
    def setType(value: RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
