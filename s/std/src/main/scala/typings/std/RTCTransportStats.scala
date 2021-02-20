package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCTransportStats extends RTCStats {
  
  var activeConnection: js.UndefOr[scala.Boolean] = js.native
  
  var bytesReceived: js.UndefOr[Double] = js.native
  
  var bytesSent: js.UndefOr[Double] = js.native
  
  var localCertificateId: js.UndefOr[java.lang.String] = js.native
  
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.native
  
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.native
  
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.native
}
object RTCTransportStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCTransportStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
  
  @scala.inline
  implicit class RTCTransportStatsMutableBuilder[Self <: RTCTransportStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveConnection(value: scala.Boolean): Self = StObject.set(x, "activeConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveConnectionUndefined: Self = StObject.set(x, "activeConnection", js.undefined)
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setLocalCertificateId(value: java.lang.String): Self = StObject.set(x, "localCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCertificateIdUndefined: Self = StObject.set(x, "localCertificateId", js.undefined)
    
    @scala.inline
    def setRemoteCertificateId(value: java.lang.String): Self = StObject.set(x, "remoteCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCertificateIdUndefined: Self = StObject.set(x, "remoteCertificateId", js.undefined)
    
    @scala.inline
    def setRtcpTransportStatsId(value: java.lang.String): Self = StObject.set(x, "rtcpTransportStatsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpTransportStatsIdUndefined: Self = StObject.set(x, "rtcpTransportStatsId", js.undefined)
    
    @scala.inline
    def setSelectedCandidatePairId(value: java.lang.String): Self = StObject.set(x, "selectedCandidatePairId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCandidatePairIdUndefined: Self = StObject.set(x, "selectedCandidatePairId", js.undefined)
  }
}
