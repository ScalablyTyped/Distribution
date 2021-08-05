package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCMediaStreamTrackStats
  extends StObject
     with RTCStats {
  
  var audioLevel: js.UndefOr[Double] = js.undefined
  
  var echoReturnLoss: js.UndefOr[Double] = js.undefined
  
  var echoReturnLossEnhancement: js.UndefOr[Double] = js.undefined
  
  var frameHeight: js.UndefOr[Double] = js.undefined
  
  var frameWidth: js.UndefOr[Double] = js.undefined
  
  var framesCorrupted: js.UndefOr[Double] = js.undefined
  
  var framesDecoded: js.UndefOr[Double] = js.undefined
  
  var framesDropped: js.UndefOr[Double] = js.undefined
  
  var framesPerSecond: js.UndefOr[Double] = js.undefined
  
  var framesReceived: js.UndefOr[Double] = js.undefined
  
  var framesSent: js.UndefOr[Double] = js.undefined
  
  var remoteSource: js.UndefOr[scala.Boolean] = js.undefined
  
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var trackIdentifier: js.UndefOr[java.lang.String] = js.undefined
}
object RTCMediaStreamTrackStats {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
  
  extension [Self <: RTCMediaStreamTrackStats](x: Self) {
    
    inline def setAudioLevel(value: Double): Self = StObject.set(x, "audioLevel", value.asInstanceOf[js.Any])
    
    inline def setAudioLevelUndefined: Self = StObject.set(x, "audioLevel", js.undefined)
    
    inline def setEchoReturnLoss(value: Double): Self = StObject.set(x, "echoReturnLoss", value.asInstanceOf[js.Any])
    
    inline def setEchoReturnLossEnhancement(value: Double): Self = StObject.set(x, "echoReturnLossEnhancement", value.asInstanceOf[js.Any])
    
    inline def setEchoReturnLossEnhancementUndefined: Self = StObject.set(x, "echoReturnLossEnhancement", js.undefined)
    
    inline def setEchoReturnLossUndefined: Self = StObject.set(x, "echoReturnLoss", js.undefined)
    
    inline def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
    
    inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setFrameWidthUndefined: Self = StObject.set(x, "frameWidth", js.undefined)
    
    inline def setFramesCorrupted(value: Double): Self = StObject.set(x, "framesCorrupted", value.asInstanceOf[js.Any])
    
    inline def setFramesCorruptedUndefined: Self = StObject.set(x, "framesCorrupted", js.undefined)
    
    inline def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
    
    inline def setFramesDecodedUndefined: Self = StObject.set(x, "framesDecoded", js.undefined)
    
    inline def setFramesDropped(value: Double): Self = StObject.set(x, "framesDropped", value.asInstanceOf[js.Any])
    
    inline def setFramesDroppedUndefined: Self = StObject.set(x, "framesDropped", js.undefined)
    
    inline def setFramesPerSecond(value: Double): Self = StObject.set(x, "framesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setFramesPerSecondUndefined: Self = StObject.set(x, "framesPerSecond", js.undefined)
    
    inline def setFramesReceived(value: Double): Self = StObject.set(x, "framesReceived", value.asInstanceOf[js.Any])
    
    inline def setFramesReceivedUndefined: Self = StObject.set(x, "framesReceived", js.undefined)
    
    inline def setFramesSent(value: Double): Self = StObject.set(x, "framesSent", value.asInstanceOf[js.Any])
    
    inline def setFramesSentUndefined: Self = StObject.set(x, "framesSent", js.undefined)
    
    inline def setRemoteSource(value: scala.Boolean): Self = StObject.set(x, "remoteSource", value.asInstanceOf[js.Any])
    
    inline def setRemoteSourceUndefined: Self = StObject.set(x, "remoteSource", js.undefined)
    
    inline def setSsrcIds(value: js.Array[java.lang.String]): Self = StObject.set(x, "ssrcIds", value.asInstanceOf[js.Any])
    
    inline def setSsrcIdsUndefined: Self = StObject.set(x, "ssrcIds", js.undefined)
    
    inline def setSsrcIdsVarargs(value: java.lang.String*): Self = StObject.set(x, "ssrcIds", js.Array(value :_*))
    
    inline def setTrackIdentifier(value: java.lang.String): Self = StObject.set(x, "trackIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTrackIdentifierUndefined: Self = StObject.set(x, "trackIdentifier", js.undefined)
  }
}
