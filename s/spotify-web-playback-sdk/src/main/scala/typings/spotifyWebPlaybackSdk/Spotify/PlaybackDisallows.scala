package typings.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackDisallows extends StObject {
  
  var pausing: js.UndefOr[Boolean] = js.undefined
  
  var peeking_next: js.UndefOr[Boolean] = js.undefined
  
  var peeking_prev: js.UndefOr[Boolean] = js.undefined
  
  var resuming: js.UndefOr[Boolean] = js.undefined
  
  var seeking: js.UndefOr[Boolean] = js.undefined
  
  var skipping_next: js.UndefOr[Boolean] = js.undefined
  
  var skipping_prev: js.UndefOr[Boolean] = js.undefined
  
  var toggling_repeat_context: js.UndefOr[Boolean] = js.undefined
  
  var toggling_repeat_track: js.UndefOr[Boolean] = js.undefined
  
  var toggling_shuffle: js.UndefOr[Boolean] = js.undefined
}
object PlaybackDisallows {
  
  inline def apply(): PlaybackDisallows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackDisallows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackDisallows] (val x: Self) extends AnyVal {
    
    inline def setPausing(value: Boolean): Self = StObject.set(x, "pausing", value.asInstanceOf[js.Any])
    
    inline def setPausingUndefined: Self = StObject.set(x, "pausing", js.undefined)
    
    inline def setPeeking_next(value: Boolean): Self = StObject.set(x, "peeking_next", value.asInstanceOf[js.Any])
    
    inline def setPeeking_nextUndefined: Self = StObject.set(x, "peeking_next", js.undefined)
    
    inline def setPeeking_prev(value: Boolean): Self = StObject.set(x, "peeking_prev", value.asInstanceOf[js.Any])
    
    inline def setPeeking_prevUndefined: Self = StObject.set(x, "peeking_prev", js.undefined)
    
    inline def setResuming(value: Boolean): Self = StObject.set(x, "resuming", value.asInstanceOf[js.Any])
    
    inline def setResumingUndefined: Self = StObject.set(x, "resuming", js.undefined)
    
    inline def setSeeking(value: Boolean): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
    
    inline def setSeekingUndefined: Self = StObject.set(x, "seeking", js.undefined)
    
    inline def setSkipping_next(value: Boolean): Self = StObject.set(x, "skipping_next", value.asInstanceOf[js.Any])
    
    inline def setSkipping_nextUndefined: Self = StObject.set(x, "skipping_next", js.undefined)
    
    inline def setSkipping_prev(value: Boolean): Self = StObject.set(x, "skipping_prev", value.asInstanceOf[js.Any])
    
    inline def setSkipping_prevUndefined: Self = StObject.set(x, "skipping_prev", js.undefined)
    
    inline def setToggling_repeat_context(value: Boolean): Self = StObject.set(x, "toggling_repeat_context", value.asInstanceOf[js.Any])
    
    inline def setToggling_repeat_contextUndefined: Self = StObject.set(x, "toggling_repeat_context", js.undefined)
    
    inline def setToggling_repeat_track(value: Boolean): Self = StObject.set(x, "toggling_repeat_track", value.asInstanceOf[js.Any])
    
    inline def setToggling_repeat_trackUndefined: Self = StObject.set(x, "toggling_repeat_track", js.undefined)
    
    inline def setToggling_shuffle(value: Boolean): Self = StObject.set(x, "toggling_shuffle", value.asInstanceOf[js.Any])
    
    inline def setToggling_shuffleUndefined: Self = StObject.set(x, "toggling_shuffle", js.undefined)
  }
}
