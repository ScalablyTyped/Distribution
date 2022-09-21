package typings.spotifyWebPlaybackSdk.Spotify

import typings.spotifyWebPlaybackSdk.anon.Hifistatus
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`0`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`1`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackState extends StObject {
  
  var context: PlaybackContext
  
  var disallows: PlaybackDisallows
  
  var duration: Double
  
  var loading: Boolean
  
  var paused: Boolean
  
  var playback_features: Hifistatus
  
  var playback_id: String
  
  var playback_quality: String
  
  var position: Double
  
  /**
    * 0: NO_REPEAT
    * 1: ONCE_REPEAT
    * 2: FULL_REPEAT
    */
  var repeat_mode: `0` | `1` | `2`
  
  var restrictions: PlaybackRestrictions
  
  var shuffle: Boolean
  
  var timestamp: Double
  
  var track_window: PlaybackTrackWindow
}
object PlaybackState {
  
  inline def apply(
    context: PlaybackContext,
    disallows: PlaybackDisallows,
    duration: Double,
    loading: Boolean,
    paused: Boolean,
    playback_features: Hifistatus,
    playback_id: String,
    playback_quality: String,
    position: Double,
    repeat_mode: `0` | `1` | `2`,
    restrictions: PlaybackRestrictions,
    shuffle: Boolean,
    timestamp: Double,
    track_window: PlaybackTrackWindow
  ): PlaybackState = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], disallows = disallows.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playback_features = playback_features.asInstanceOf[js.Any], playback_id = playback_id.asInstanceOf[js.Any], playback_quality = playback_quality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], track_window = track_window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackState]
  }
  
  extension [Self <: PlaybackState](x: Self) {
    
    inline def setContext(value: PlaybackContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDisallows(value: PlaybackDisallows): Self = StObject.set(x, "disallows", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPlayback_features(value: Hifistatus): Self = StObject.set(x, "playback_features", value.asInstanceOf[js.Any])
    
    inline def setPlayback_id(value: String): Self = StObject.set(x, "playback_id", value.asInstanceOf[js.Any])
    
    inline def setPlayback_quality(value: String): Self = StObject.set(x, "playback_quality", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRepeat_mode(value: `0` | `1` | `2`): Self = StObject.set(x, "repeat_mode", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: PlaybackRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTrack_window(value: PlaybackTrackWindow): Self = StObject.set(x, "track_window", value.asInstanceOf[js.Any])
  }
}
