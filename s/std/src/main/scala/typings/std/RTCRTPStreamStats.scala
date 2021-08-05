package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRTPStreamStats
  extends StObject
     with RTCStats {
  
  var associateStatsId: js.UndefOr[java.lang.String] = js.undefined
  
  var codecId: js.UndefOr[java.lang.String] = js.undefined
  
  var firCount: js.UndefOr[Double] = js.undefined
  
  var isRemote: js.UndefOr[scala.Boolean] = js.undefined
  
  var mediaTrackId: js.UndefOr[java.lang.String] = js.undefined
  
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  
  var nackCount: js.UndefOr[Double] = js.undefined
  
  var pliCount: js.UndefOr[Double] = js.undefined
  
  var sliCount: js.UndefOr[Double] = js.undefined
  
  var ssrc: js.UndefOr[java.lang.String] = js.undefined
  
  var transportId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRTPStreamStats {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRTPStreamStats]
  }
  
  extension [Self <: RTCRTPStreamStats](x: Self) {
    
    inline def setAssociateStatsId(value: java.lang.String): Self = StObject.set(x, "associateStatsId", value.asInstanceOf[js.Any])
    
    inline def setAssociateStatsIdUndefined: Self = StObject.set(x, "associateStatsId", js.undefined)
    
    inline def setCodecId(value: java.lang.String): Self = StObject.set(x, "codecId", value.asInstanceOf[js.Any])
    
    inline def setCodecIdUndefined: Self = StObject.set(x, "codecId", js.undefined)
    
    inline def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    inline def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    inline def setIsRemote(value: scala.Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    
    inline def setIsRemoteUndefined: Self = StObject.set(x, "isRemote", js.undefined)
    
    inline def setMediaTrackId(value: java.lang.String): Self = StObject.set(x, "mediaTrackId", value.asInstanceOf[js.Any])
    
    inline def setMediaTrackIdUndefined: Self = StObject.set(x, "mediaTrackId", js.undefined)
    
    inline def setMediaType(value: java.lang.String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    inline def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    inline def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    inline def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    inline def setSliCount(value: Double): Self = StObject.set(x, "sliCount", value.asInstanceOf[js.Any])
    
    inline def setSliCountUndefined: Self = StObject.set(x, "sliCount", js.undefined)
    
    inline def setSsrc(value: java.lang.String): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    inline def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
    
    inline def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    inline def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
  }
}
