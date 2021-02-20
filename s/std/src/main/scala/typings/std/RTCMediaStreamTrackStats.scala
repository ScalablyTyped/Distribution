package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCMediaStreamTrackStats extends RTCStats {
  
  var audioLevel: js.UndefOr[Double] = js.native
  
  var echoReturnLoss: js.UndefOr[Double] = js.native
  
  var echoReturnLossEnhancement: js.UndefOr[Double] = js.native
  
  var frameHeight: js.UndefOr[Double] = js.native
  
  var frameWidth: js.UndefOr[Double] = js.native
  
  var framesCorrupted: js.UndefOr[Double] = js.native
  
  var framesDecoded: js.UndefOr[Double] = js.native
  
  var framesDropped: js.UndefOr[Double] = js.native
  
  var framesPerSecond: js.UndefOr[Double] = js.native
  
  var framesReceived: js.UndefOr[Double] = js.native
  
  var framesSent: js.UndefOr[Double] = js.native
  
  var remoteSource: js.UndefOr[scala.Boolean] = js.native
  
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var trackIdentifier: js.UndefOr[java.lang.String] = js.native
}
object RTCMediaStreamTrackStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
  
  @scala.inline
  implicit class RTCMediaStreamTrackStatsMutableBuilder[Self <: RTCMediaStreamTrackStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioLevel(value: Double): Self = StObject.set(x, "audioLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioLevelUndefined: Self = StObject.set(x, "audioLevel", js.undefined)
    
    @scala.inline
    def setEchoReturnLoss(value: Double): Self = StObject.set(x, "echoReturnLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoReturnLossEnhancement(value: Double): Self = StObject.set(x, "echoReturnLossEnhancement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoReturnLossEnhancementUndefined: Self = StObject.set(x, "echoReturnLossEnhancement", js.undefined)
    
    @scala.inline
    def setEchoReturnLossUndefined: Self = StObject.set(x, "echoReturnLoss", js.undefined)
    
    @scala.inline
    def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeightUndefined: Self = StObject.set(x, "frameHeight", js.undefined)
    
    @scala.inline
    def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidthUndefined: Self = StObject.set(x, "frameWidth", js.undefined)
    
    @scala.inline
    def setFramesCorrupted(value: Double): Self = StObject.set(x, "framesCorrupted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesCorruptedUndefined: Self = StObject.set(x, "framesCorrupted", js.undefined)
    
    @scala.inline
    def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesDecodedUndefined: Self = StObject.set(x, "framesDecoded", js.undefined)
    
    @scala.inline
    def setFramesDropped(value: Double): Self = StObject.set(x, "framesDropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesDroppedUndefined: Self = StObject.set(x, "framesDropped", js.undefined)
    
    @scala.inline
    def setFramesPerSecond(value: Double): Self = StObject.set(x, "framesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesPerSecondUndefined: Self = StObject.set(x, "framesPerSecond", js.undefined)
    
    @scala.inline
    def setFramesReceived(value: Double): Self = StObject.set(x, "framesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesReceivedUndefined: Self = StObject.set(x, "framesReceived", js.undefined)
    
    @scala.inline
    def setFramesSent(value: Double): Self = StObject.set(x, "framesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesSentUndefined: Self = StObject.set(x, "framesSent", js.undefined)
    
    @scala.inline
    def setRemoteSource(value: scala.Boolean): Self = StObject.set(x, "remoteSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteSourceUndefined: Self = StObject.set(x, "remoteSource", js.undefined)
    
    @scala.inline
    def setSsrcIds(value: js.Array[java.lang.String]): Self = StObject.set(x, "ssrcIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcIdsUndefined: Self = StObject.set(x, "ssrcIds", js.undefined)
    
    @scala.inline
    def setSsrcIdsVarargs(value: java.lang.String*): Self = StObject.set(x, "ssrcIds", js.Array(value :_*))
    
    @scala.inline
    def setTrackIdentifier(value: java.lang.String): Self = StObject.set(x, "trackIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdentifierUndefined: Self = StObject.set(x, "trackIdentifier", js.undefined)
  }
}
