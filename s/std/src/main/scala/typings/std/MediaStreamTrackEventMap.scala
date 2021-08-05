package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackEventMap extends StObject {
  
  var ended: Event
  
  var isolationchange: Event
  
  var mute: Event
  
  var unmute: Event
}
object MediaStreamTrackEventMap {
  
  inline def apply(ended: Event, isolationchange: Event, mute: Event, unmute: Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], isolationchange = isolationchange.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
  
  extension [Self <: MediaStreamTrackEventMap](x: Self) {
    
    inline def setEnded(value: Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setIsolationchange(value: Event): Self = StObject.set(x, "isolationchange", value.asInstanceOf[js.Any])
    
    inline def setMute(value: Event): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setUnmute(value: Event): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
  }
}
