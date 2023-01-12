package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelInit extends StObject {
  
  /* standard dom */
  var id: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var maxPacketLifeTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var maxRetransmits: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var negotiated: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}
object RTCDataChannelInit {
  
  inline def apply(): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDataChannelInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCDataChannelInit] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
    
    inline def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
    
    inline def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
    
    inline def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
    
    inline def setNegotiated(value: scala.Boolean): Self = StObject.set(x, "negotiated", value.asInstanceOf[js.Any])
    
    inline def setNegotiatedUndefined: Self = StObject.set(x, "negotiated", js.undefined)
    
    inline def setOrdered(value: scala.Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
