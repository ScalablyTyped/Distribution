package typings.reactNativeVideo.mod

import typings.reactNativeVideo.anon.Bitrate
import typings.reactNativeVideo.anon.Height
import typings.reactNativeVideo.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLoadData extends StObject {
  
  var audioTracks: js.Array[Index]
  
  var canPlayFastForward: Boolean
  
  var canPlayReverse: Boolean
  
  var canPlaySlowForward: Boolean
  
  var canPlaySlowReverse: Boolean
  
  var canStepBackward: Boolean
  
  var canStepForward: Boolean
  
  var currentPosition: Double
  
  var currentTime: Double
  
  var duration: Double
  
  var naturalSize: Height
  
  var textTracks: js.Array[Index]
  
  var videoTracks: js.Array[Bitrate]
}
object OnLoadData {
  
  inline def apply(
    audioTracks: js.Array[Index],
    canPlayFastForward: Boolean,
    canPlayReverse: Boolean,
    canPlaySlowForward: Boolean,
    canPlaySlowReverse: Boolean,
    canStepBackward: Boolean,
    canStepForward: Boolean,
    currentPosition: Double,
    currentTime: Double,
    duration: Double,
    naturalSize: Height,
    textTracks: js.Array[Index],
    videoTracks: js.Array[Bitrate]
  ): OnLoadData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], canPlayFastForward = canPlayFastForward.asInstanceOf[js.Any], canPlayReverse = canPlayReverse.asInstanceOf[js.Any], canPlaySlowForward = canPlaySlowForward.asInstanceOf[js.Any], canPlaySlowReverse = canPlaySlowReverse.asInstanceOf[js.Any], canStepBackward = canStepBackward.asInstanceOf[js.Any], canStepForward = canStepForward.asInstanceOf[js.Any], currentPosition = currentPosition.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], naturalSize = naturalSize.asInstanceOf[js.Any], textTracks = textTracks.asInstanceOf[js.Any], videoTracks = videoTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoadData]
  }
  
  extension [Self <: OnLoadData](x: Self) {
    
    inline def setAudioTracks(value: js.Array[Index]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksVarargs(value: Index*): Self = StObject.set(x, "audioTracks", js.Array(value*))
    
    inline def setCanPlayFastForward(value: Boolean): Self = StObject.set(x, "canPlayFastForward", value.asInstanceOf[js.Any])
    
    inline def setCanPlayReverse(value: Boolean): Self = StObject.set(x, "canPlayReverse", value.asInstanceOf[js.Any])
    
    inline def setCanPlaySlowForward(value: Boolean): Self = StObject.set(x, "canPlaySlowForward", value.asInstanceOf[js.Any])
    
    inline def setCanPlaySlowReverse(value: Boolean): Self = StObject.set(x, "canPlaySlowReverse", value.asInstanceOf[js.Any])
    
    inline def setCanStepBackward(value: Boolean): Self = StObject.set(x, "canStepBackward", value.asInstanceOf[js.Any])
    
    inline def setCanStepForward(value: Boolean): Self = StObject.set(x, "canStepForward", value.asInstanceOf[js.Any])
    
    inline def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setNaturalSize(value: Height): Self = StObject.set(x, "naturalSize", value.asInstanceOf[js.Any])
    
    inline def setTextTracks(value: js.Array[Index]): Self = StObject.set(x, "textTracks", value.asInstanceOf[js.Any])
    
    inline def setTextTracksVarargs(value: Index*): Self = StObject.set(x, "textTracks", js.Array(value*))
    
    inline def setVideoTracks(value: js.Array[Bitrate]): Self = StObject.set(x, "videoTracks", value.asInstanceOf[js.Any])
    
    inline def setVideoTracksVarargs(value: Bitrate*): Self = StObject.set(x, "videoTracks", js.Array(value*))
  }
}
