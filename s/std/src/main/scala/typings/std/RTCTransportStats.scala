package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTransportStats
  extends StObject
     with RTCStats {
  
  var activeConnection: js.UndefOr[scala.Boolean] = js.undefined
  
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCTransportStats {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCTransportStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
  
  extension [Self <: RTCTransportStats](x: Self) {
    
    inline def setActiveConnection(value: scala.Boolean): Self = StObject.set(x, "activeConnection", value.asInstanceOf[js.Any])
    
    inline def setActiveConnectionUndefined: Self = StObject.set(x, "activeConnection", js.undefined)
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setLocalCertificateId(value: java.lang.String): Self = StObject.set(x, "localCertificateId", value.asInstanceOf[js.Any])
    
    inline def setLocalCertificateIdUndefined: Self = StObject.set(x, "localCertificateId", js.undefined)
    
    inline def setRemoteCertificateId(value: java.lang.String): Self = StObject.set(x, "remoteCertificateId", value.asInstanceOf[js.Any])
    
    inline def setRemoteCertificateIdUndefined: Self = StObject.set(x, "remoteCertificateId", js.undefined)
    
    inline def setRtcpTransportStatsId(value: java.lang.String): Self = StObject.set(x, "rtcpTransportStatsId", value.asInstanceOf[js.Any])
    
    inline def setRtcpTransportStatsIdUndefined: Self = StObject.set(x, "rtcpTransportStatsId", js.undefined)
    
    inline def setSelectedCandidatePairId(value: java.lang.String): Self = StObject.set(x, "selectedCandidatePairId", value.asInstanceOf[js.Any])
    
    inline def setSelectedCandidatePairIdUndefined: Self = StObject.set(x, "selectedCandidatePairId", js.undefined)
  }
}
