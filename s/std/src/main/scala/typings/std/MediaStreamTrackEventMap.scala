package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackEventMap extends StObject {
  
  /* standard dom */
  var ended: Event
  
  /* standard dom */
  var mute: Event
  
  /* standard dom */
  var unmute: Event
}
object MediaStreamTrackEventMap {
  
  inline def apply(ended: Event, mute: Event, unmute: Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStreamTrackEventMap] (val x: Self) extends AnyVal {
    
    inline def setEnded(value: Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setMute(value: Event): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setUnmute(value: Event): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
  }
}
