package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpStreamStats
  extends StObject
     with RTCStats {
  
  /* standard dom */
  var codecId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var kind: java.lang.String
  
  /* standard dom */
  var ssrc: Double
  
  /* standard dom */
  var transportId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpStreamStats]
  }
  
  extension [Self <: RTCRtpStreamStats](x: Self) {
    
    inline def setCodecId(value: java.lang.String): Self = StObject.set(x, "codecId", value.asInstanceOf[js.Any])
    
    inline def setCodecIdUndefined: Self = StObject.set(x, "codecId", js.undefined)
    
    inline def setKind(value: java.lang.String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    inline def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
  }
}
