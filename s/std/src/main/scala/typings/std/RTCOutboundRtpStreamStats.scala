package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOutboundRtpStreamStats
  extends StObject
     with RTCSentRtpStreamStats {
  
  /* standard dom */
  var firCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frameHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frameWidth: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesEncoded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesPerSecond: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var headerBytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var hugeFramesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var keyFramesEncoded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var mediaSourceId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var nackCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var pliCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var qpSum: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var qualityLimitationResolutionChanges: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var remoteId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var retransmittedBytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var retransmittedPacketsSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var rid: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var targetBitrate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalEncodeTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalEncodedBytesTarget: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalPacketSendDelay: js.UndefOr[Double] = js.undefined
}
object RTCOutboundRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCOutboundRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRtpStreamStats]
  }
  
  extension [Self <: RTCOutboundRtpStreamStats](x: Self) {
    
    inline def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    inline def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    inline def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
    
    inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setFrameWidthUndefined: Self = StObject.set(x, "frameWidth", js.undefined)
    
    inline def setFramesEncoded(value: Double): Self = StObject.set(x, "framesEncoded", value.asInstanceOf[js.Any])
    
    inline def setFramesEncodedUndefined: Self = StObject.set(x, "framesEncoded", js.undefined)
    
    inline def setFramesPerSecond(value: Double): Self = StObject.set(x, "framesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setFramesPerSecondUndefined: Self = StObject.set(x, "framesPerSecond", js.undefined)
    
    inline def setFramesSent(value: Double): Self = StObject.set(x, "framesSent", value.asInstanceOf[js.Any])
    
    inline def setFramesSentUndefined: Self = StObject.set(x, "framesSent", js.undefined)
    
    inline def setHeaderBytesSent(value: Double): Self = StObject.set(x, "headerBytesSent", value.asInstanceOf[js.Any])
    
    inline def setHeaderBytesSentUndefined: Self = StObject.set(x, "headerBytesSent", js.undefined)
    
    inline def setHugeFramesSent(value: Double): Self = StObject.set(x, "hugeFramesSent", value.asInstanceOf[js.Any])
    
    inline def setHugeFramesSentUndefined: Self = StObject.set(x, "hugeFramesSent", js.undefined)
    
    inline def setKeyFramesEncoded(value: Double): Self = StObject.set(x, "keyFramesEncoded", value.asInstanceOf[js.Any])
    
    inline def setKeyFramesEncodedUndefined: Self = StObject.set(x, "keyFramesEncoded", js.undefined)
    
    inline def setMediaSourceId(value: java.lang.String): Self = StObject.set(x, "mediaSourceId", value.asInstanceOf[js.Any])
    
    inline def setMediaSourceIdUndefined: Self = StObject.set(x, "mediaSourceId", js.undefined)
    
    inline def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    inline def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    inline def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    inline def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    inline def setQpSum(value: Double): Self = StObject.set(x, "qpSum", value.asInstanceOf[js.Any])
    
    inline def setQpSumUndefined: Self = StObject.set(x, "qpSum", js.undefined)
    
    inline def setQualityLimitationResolutionChanges(value: Double): Self = StObject.set(x, "qualityLimitationResolutionChanges", value.asInstanceOf[js.Any])
    
    inline def setQualityLimitationResolutionChangesUndefined: Self = StObject.set(x, "qualityLimitationResolutionChanges", js.undefined)
    
    inline def setRemoteId(value: java.lang.String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "remoteId", js.undefined)
    
    inline def setRetransmittedBytesSent(value: Double): Self = StObject.set(x, "retransmittedBytesSent", value.asInstanceOf[js.Any])
    
    inline def setRetransmittedBytesSentUndefined: Self = StObject.set(x, "retransmittedBytesSent", js.undefined)
    
    inline def setRetransmittedPacketsSent(value: Double): Self = StObject.set(x, "retransmittedPacketsSent", value.asInstanceOf[js.Any])
    
    inline def setRetransmittedPacketsSentUndefined: Self = StObject.set(x, "retransmittedPacketsSent", js.undefined)
    
    inline def setRid(value: java.lang.String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
    
    inline def setTargetBitrate(value: Double): Self = StObject.set(x, "targetBitrate", value.asInstanceOf[js.Any])
    
    inline def setTargetBitrateUndefined: Self = StObject.set(x, "targetBitrate", js.undefined)
    
    inline def setTotalEncodeTime(value: Double): Self = StObject.set(x, "totalEncodeTime", value.asInstanceOf[js.Any])
    
    inline def setTotalEncodeTimeUndefined: Self = StObject.set(x, "totalEncodeTime", js.undefined)
    
    inline def setTotalEncodedBytesTarget(value: Double): Self = StObject.set(x, "totalEncodedBytesTarget", value.asInstanceOf[js.Any])
    
    inline def setTotalEncodedBytesTargetUndefined: Self = StObject.set(x, "totalEncodedBytesTarget", js.undefined)
    
    inline def setTotalPacketSendDelay(value: Double): Self = StObject.set(x, "totalPacketSendDelay", value.asInstanceOf[js.Any])
    
    inline def setTotalPacketSendDelayUndefined: Self = StObject.set(x, "totalPacketSendDelay", js.undefined)
  }
}
