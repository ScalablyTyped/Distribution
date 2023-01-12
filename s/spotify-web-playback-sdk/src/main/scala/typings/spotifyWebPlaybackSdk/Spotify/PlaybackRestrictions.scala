package typings.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackRestrictions extends StObject {
  
  var disallow_pausing_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_peeking_next_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_peeking_prev_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_resuming_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_seeking_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_skipping_next_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_skipping_prev_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_toggling_repeat_context_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_toggling_repeat_track_reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var disallow_toggling_shuffle_reasons: js.UndefOr[js.Array[String]] = js.undefined
}
object PlaybackRestrictions {
  
  inline def apply(): PlaybackRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackRestrictions] (val x: Self) extends AnyVal {
    
    inline def setDisallow_pausing_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_pausing_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_pausing_reasonsUndefined: Self = StObject.set(x, "disallow_pausing_reasons", js.undefined)
    
    inline def setDisallow_pausing_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_pausing_reasons", js.Array(value*))
    
    inline def setDisallow_peeking_next_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_peeking_next_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_peeking_next_reasonsUndefined: Self = StObject.set(x, "disallow_peeking_next_reasons", js.undefined)
    
    inline def setDisallow_peeking_next_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_peeking_next_reasons", js.Array(value*))
    
    inline def setDisallow_peeking_prev_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_peeking_prev_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_peeking_prev_reasonsUndefined: Self = StObject.set(x, "disallow_peeking_prev_reasons", js.undefined)
    
    inline def setDisallow_peeking_prev_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_peeking_prev_reasons", js.Array(value*))
    
    inline def setDisallow_resuming_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_resuming_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_resuming_reasonsUndefined: Self = StObject.set(x, "disallow_resuming_reasons", js.undefined)
    
    inline def setDisallow_resuming_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_resuming_reasons", js.Array(value*))
    
    inline def setDisallow_seeking_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_seeking_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_seeking_reasonsUndefined: Self = StObject.set(x, "disallow_seeking_reasons", js.undefined)
    
    inline def setDisallow_seeking_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_seeking_reasons", js.Array(value*))
    
    inline def setDisallow_skipping_next_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_skipping_next_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_skipping_next_reasonsUndefined: Self = StObject.set(x, "disallow_skipping_next_reasons", js.undefined)
    
    inline def setDisallow_skipping_next_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_skipping_next_reasons", js.Array(value*))
    
    inline def setDisallow_skipping_prev_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_skipping_prev_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_skipping_prev_reasonsUndefined: Self = StObject.set(x, "disallow_skipping_prev_reasons", js.undefined)
    
    inline def setDisallow_skipping_prev_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_skipping_prev_reasons", js.Array(value*))
    
    inline def setDisallow_toggling_repeat_context_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_toggling_repeat_context_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_toggling_repeat_context_reasonsUndefined: Self = StObject.set(x, "disallow_toggling_repeat_context_reasons", js.undefined)
    
    inline def setDisallow_toggling_repeat_context_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_toggling_repeat_context_reasons", js.Array(value*))
    
    inline def setDisallow_toggling_repeat_track_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_toggling_repeat_track_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_toggling_repeat_track_reasonsUndefined: Self = StObject.set(x, "disallow_toggling_repeat_track_reasons", js.undefined)
    
    inline def setDisallow_toggling_repeat_track_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_toggling_repeat_track_reasons", js.Array(value*))
    
    inline def setDisallow_toggling_shuffle_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_toggling_shuffle_reasons", value.asInstanceOf[js.Any])
    
    inline def setDisallow_toggling_shuffle_reasonsUndefined: Self = StObject.set(x, "disallow_toggling_shuffle_reasons", js.undefined)
    
    inline def setDisallow_toggling_shuffle_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_toggling_shuffle_reasons", js.Array(value*))
  }
}
