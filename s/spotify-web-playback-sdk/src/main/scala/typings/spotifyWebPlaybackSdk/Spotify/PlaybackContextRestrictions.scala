package typings.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackContextRestrictions extends StObject {
  
  var pause: js.Array[String]
  
  var peek_next: js.Array[String]
  
  var peek_prev: js.Array[String]
  
  var resume: js.Array[String]
  
  var seek: js.Array[String]
  
  var skip_next: js.Array[String]
  
  var skip_prev: js.Array[String]
  
  var toggle_repeat_context: js.Array[String]
  
  var toggle_repeat_track: js.Array[String]
  
  var toggle_shuffle: js.Array[String]
}
object PlaybackContextRestrictions {
  
  inline def apply(
    pause: js.Array[String],
    peek_next: js.Array[String],
    peek_prev: js.Array[String],
    resume: js.Array[String],
    seek: js.Array[String],
    skip_next: js.Array[String],
    skip_prev: js.Array[String],
    toggle_repeat_context: js.Array[String],
    toggle_repeat_track: js.Array[String],
    toggle_shuffle: js.Array[String]
  ): PlaybackContextRestrictions = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], peek_next = peek_next.asInstanceOf[js.Any], peek_prev = peek_prev.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], skip_next = skip_next.asInstanceOf[js.Any], skip_prev = skip_prev.asInstanceOf[js.Any], toggle_repeat_context = toggle_repeat_context.asInstanceOf[js.Any], toggle_repeat_track = toggle_repeat_track.asInstanceOf[js.Any], toggle_shuffle = toggle_shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackContextRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackContextRestrictions] (val x: Self) extends AnyVal {
    
    inline def setPause(value: js.Array[String]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseVarargs(value: String*): Self = StObject.set(x, "pause", js.Array(value*))
    
    inline def setPeek_next(value: js.Array[String]): Self = StObject.set(x, "peek_next", value.asInstanceOf[js.Any])
    
    inline def setPeek_nextVarargs(value: String*): Self = StObject.set(x, "peek_next", js.Array(value*))
    
    inline def setPeek_prev(value: js.Array[String]): Self = StObject.set(x, "peek_prev", value.asInstanceOf[js.Any])
    
    inline def setPeek_prevVarargs(value: String*): Self = StObject.set(x, "peek_prev", js.Array(value*))
    
    inline def setResume(value: js.Array[String]): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    inline def setResumeVarargs(value: String*): Self = StObject.set(x, "resume", js.Array(value*))
    
    inline def setSeek(value: js.Array[String]): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
    
    inline def setSeekVarargs(value: String*): Self = StObject.set(x, "seek", js.Array(value*))
    
    inline def setSkip_next(value: js.Array[String]): Self = StObject.set(x, "skip_next", value.asInstanceOf[js.Any])
    
    inline def setSkip_nextVarargs(value: String*): Self = StObject.set(x, "skip_next", js.Array(value*))
    
    inline def setSkip_prev(value: js.Array[String]): Self = StObject.set(x, "skip_prev", value.asInstanceOf[js.Any])
    
    inline def setSkip_prevVarargs(value: String*): Self = StObject.set(x, "skip_prev", js.Array(value*))
    
    inline def setToggle_repeat_context(value: js.Array[String]): Self = StObject.set(x, "toggle_repeat_context", value.asInstanceOf[js.Any])
    
    inline def setToggle_repeat_contextVarargs(value: String*): Self = StObject.set(x, "toggle_repeat_context", js.Array(value*))
    
    inline def setToggle_repeat_track(value: js.Array[String]): Self = StObject.set(x, "toggle_repeat_track", value.asInstanceOf[js.Any])
    
    inline def setToggle_repeat_trackVarargs(value: String*): Self = StObject.set(x, "toggle_repeat_track", js.Array(value*))
    
    inline def setToggle_shuffle(value: js.Array[String]): Self = StObject.set(x, "toggle_shuffle", value.asInstanceOf[js.Any])
    
    inline def setToggle_shuffleVarargs(value: String*): Self = StObject.set(x, "toggle_shuffle", js.Array(value*))
  }
}
