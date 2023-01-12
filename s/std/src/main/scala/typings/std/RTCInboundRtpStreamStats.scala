package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCInboundRtpStreamStats
  extends StObject
     with RTCReceivedRtpStreamStats {
  
  /* standard dom */
  var audioLevel: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var concealedSamples: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var concealmentEvents: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var decoderImplementation: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var estimatedPlayoutTimestamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var fecPacketsDiscarded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var fecPacketsReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var firCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frameHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frameWidth: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesDecoded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesDropped: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesPerSecond: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var headerBytesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var insertedSamplesForDeceleration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var jitterBufferDelay: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var jitterBufferEmittedCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var keyFramesDecoded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var lastPacketReceivedTimestamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var nackCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetsDiscarded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var pliCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var qpSum: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var remoteId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var removedSamplesForAcceleration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var silentConcealedSamples: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalAudioEnergy: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalDecodeTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalInterFrameDelay: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalProcessingDelay: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalSamplesDuration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalSamplesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var totalSquaredInterFrameDelay: js.UndefOr[Double] = js.undefined
}
object RTCInboundRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCInboundRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRtpStreamStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCInboundRtpStreamStats] (val x: Self) extends AnyVal {
    
    inline def setAudioLevel(value: Double): Self = StObject.set(x, "audioLevel", value.asInstanceOf[js.Any])
    
    inline def setAudioLevelUndefined: Self = StObject.set(x, "audioLevel", js.undefined)
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setConcealedSamples(value: Double): Self = StObject.set(x, "concealedSamples", value.asInstanceOf[js.Any])
    
    inline def setConcealedSamplesUndefined: Self = StObject.set(x, "concealedSamples", js.undefined)
    
    inline def setConcealmentEvents(value: Double): Self = StObject.set(x, "concealmentEvents", value.asInstanceOf[js.Any])
    
    inline def setConcealmentEventsUndefined: Self = StObject.set(x, "concealmentEvents", js.undefined)
    
    inline def setDecoderImplementation(value: java.lang.String): Self = StObject.set(x, "decoderImplementation", value.asInstanceOf[js.Any])
    
    inline def setDecoderImplementationUndefined: Self = StObject.set(x, "decoderImplementation", js.undefined)
    
    inline def setEstimatedPlayoutTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "estimatedPlayoutTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEstimatedPlayoutTimestampUndefined: Self = StObject.set(x, "estimatedPlayoutTimestamp", js.undefined)
    
    inline def setFecPacketsDiscarded(value: Double): Self = StObject.set(x, "fecPacketsDiscarded", value.asInstanceOf[js.Any])
    
    inline def setFecPacketsDiscardedUndefined: Self = StObject.set(x, "fecPacketsDiscarded", js.undefined)
    
    inline def setFecPacketsReceived(value: Double): Self = StObject.set(x, "fecPacketsReceived", value.asInstanceOf[js.Any])
    
    inline def setFecPacketsReceivedUndefined: Self = StObject.set(x, "fecPacketsReceived", js.undefined)
    
    inline def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    inline def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    inline def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
    
    inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setFrameWidthUndefined: Self = StObject.set(x, "frameWidth", js.undefined)
    
    inline def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
    
    inline def setFramesDecodedUndefined: Self = StObject.set(x, "framesDecoded", js.undefined)
    
    inline def setFramesDropped(value: Double): Self = StObject.set(x, "framesDropped", value.asInstanceOf[js.Any])
    
    inline def setFramesDroppedUndefined: Self = StObject.set(x, "framesDropped", js.undefined)
    
    inline def setFramesPerSecond(value: Double): Self = StObject.set(x, "framesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setFramesPerSecondUndefined: Self = StObject.set(x, "framesPerSecond", js.undefined)
    
    inline def setFramesReceived(value: Double): Self = StObject.set(x, "framesReceived", value.asInstanceOf[js.Any])
    
    inline def setFramesReceivedUndefined: Self = StObject.set(x, "framesReceived", js.undefined)
    
    inline def setHeaderBytesReceived(value: Double): Self = StObject.set(x, "headerBytesReceived", value.asInstanceOf[js.Any])
    
    inline def setHeaderBytesReceivedUndefined: Self = StObject.set(x, "headerBytesReceived", js.undefined)
    
    inline def setInsertedSamplesForDeceleration(value: Double): Self = StObject.set(x, "insertedSamplesForDeceleration", value.asInstanceOf[js.Any])
    
    inline def setInsertedSamplesForDecelerationUndefined: Self = StObject.set(x, "insertedSamplesForDeceleration", js.undefined)
    
    inline def setJitterBufferDelay(value: Double): Self = StObject.set(x, "jitterBufferDelay", value.asInstanceOf[js.Any])
    
    inline def setJitterBufferDelayUndefined: Self = StObject.set(x, "jitterBufferDelay", js.undefined)
    
    inline def setJitterBufferEmittedCount(value: Double): Self = StObject.set(x, "jitterBufferEmittedCount", value.asInstanceOf[js.Any])
    
    inline def setJitterBufferEmittedCountUndefined: Self = StObject.set(x, "jitterBufferEmittedCount", js.undefined)
    
    inline def setKeyFramesDecoded(value: Double): Self = StObject.set(x, "keyFramesDecoded", value.asInstanceOf[js.Any])
    
    inline def setKeyFramesDecodedUndefined: Self = StObject.set(x, "keyFramesDecoded", js.undefined)
    
    inline def setLastPacketReceivedTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "lastPacketReceivedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastPacketReceivedTimestampUndefined: Self = StObject.set(x, "lastPacketReceivedTimestamp", js.undefined)
    
    inline def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    inline def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    inline def setPacketsDiscarded(value: Double): Self = StObject.set(x, "packetsDiscarded", value.asInstanceOf[js.Any])
    
    inline def setPacketsDiscardedUndefined: Self = StObject.set(x, "packetsDiscarded", js.undefined)
    
    inline def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    inline def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    inline def setQpSum(value: Double): Self = StObject.set(x, "qpSum", value.asInstanceOf[js.Any])
    
    inline def setQpSumUndefined: Self = StObject.set(x, "qpSum", js.undefined)
    
    inline def setRemoteId(value: java.lang.String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "remoteId", js.undefined)
    
    inline def setRemovedSamplesForAcceleration(value: Double): Self = StObject.set(x, "removedSamplesForAcceleration", value.asInstanceOf[js.Any])
    
    inline def setRemovedSamplesForAccelerationUndefined: Self = StObject.set(x, "removedSamplesForAcceleration", js.undefined)
    
    inline def setSilentConcealedSamples(value: Double): Self = StObject.set(x, "silentConcealedSamples", value.asInstanceOf[js.Any])
    
    inline def setSilentConcealedSamplesUndefined: Self = StObject.set(x, "silentConcealedSamples", js.undefined)
    
    inline def setTotalAudioEnergy(value: Double): Self = StObject.set(x, "totalAudioEnergy", value.asInstanceOf[js.Any])
    
    inline def setTotalAudioEnergyUndefined: Self = StObject.set(x, "totalAudioEnergy", js.undefined)
    
    inline def setTotalDecodeTime(value: Double): Self = StObject.set(x, "totalDecodeTime", value.asInstanceOf[js.Any])
    
    inline def setTotalDecodeTimeUndefined: Self = StObject.set(x, "totalDecodeTime", js.undefined)
    
    inline def setTotalInterFrameDelay(value: Double): Self = StObject.set(x, "totalInterFrameDelay", value.asInstanceOf[js.Any])
    
    inline def setTotalInterFrameDelayUndefined: Self = StObject.set(x, "totalInterFrameDelay", js.undefined)
    
    inline def setTotalProcessingDelay(value: Double): Self = StObject.set(x, "totalProcessingDelay", value.asInstanceOf[js.Any])
    
    inline def setTotalProcessingDelayUndefined: Self = StObject.set(x, "totalProcessingDelay", js.undefined)
    
    inline def setTotalSamplesDuration(value: Double): Self = StObject.set(x, "totalSamplesDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalSamplesDurationUndefined: Self = StObject.set(x, "totalSamplesDuration", js.undefined)
    
    inline def setTotalSamplesReceived(value: Double): Self = StObject.set(x, "totalSamplesReceived", value.asInstanceOf[js.Any])
    
    inline def setTotalSamplesReceivedUndefined: Self = StObject.set(x, "totalSamplesReceived", js.undefined)
    
    inline def setTotalSquaredInterFrameDelay(value: Double): Self = StObject.set(x, "totalSquaredInterFrameDelay", value.asInstanceOf[js.Any])
    
    inline def setTotalSquaredInterFrameDelayUndefined: Self = StObject.set(x, "totalSquaredInterFrameDelay", js.undefined)
  }
}
