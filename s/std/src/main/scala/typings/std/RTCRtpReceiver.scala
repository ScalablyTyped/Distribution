package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
trait RTCRtpReceiver extends StObject {
  
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  
  def getParameters(): RTCRtpReceiveParameters
  
  def getStats(): js.Promise[RTCStatsReport]
  
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource]
  
  val rtcpTransport: RTCDtlsTransport | Null
  
  val track: MediaStreamTrack
  
  val transport: RTCDtlsTransport | Null
}
object RTCRtpReceiver {
  
  inline def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => js.Promise[RTCStatsReport],
    getSynchronizationSources: () => js.Array[RTCRtpSynchronizationSource],
    track: MediaStreamTrack
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any], rtcpTransport = null, transport = null)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  extension [Self <: RTCRtpReceiver](x: Self) {
    
    inline def setGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = StObject.set(x, "getContributingSources", js.Any.fromFunction0(value))
    
    inline def setGetParameters(value: () => RTCRtpReceiveParameters): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setGetStats(value: () => js.Promise[RTCStatsReport]): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
    
    inline def setGetSynchronizationSources(value: () => js.Array[RTCRtpSynchronizationSource]): Self = StObject.set(x, "getSynchronizationSources", js.Any.fromFunction0(value))
    
    inline def setRtcpTransport(value: RTCDtlsTransport): Self = StObject.set(x, "rtcpTransport", value.asInstanceOf[js.Any])
    
    inline def setRtcpTransportNull: Self = StObject.set(x, "rtcpTransport", null)
    
    inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: RTCDtlsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportNull: Self = StObject.set(x, "transport", null)
  }
}
