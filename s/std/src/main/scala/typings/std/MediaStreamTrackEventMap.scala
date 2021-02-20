package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackEventMap extends StObject {
  
  var ended: Event = js.native
  
  var isolationchange: Event = js.native
  
  var mute: Event = js.native
  
  var unmute: Event = js.native
}
object MediaStreamTrackEventMap {
  
  @scala.inline
  def apply(ended: Event, isolationchange: Event, mute: Event, unmute: Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], isolationchange = isolationchange.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
  
  @scala.inline
  implicit class MediaStreamTrackEventMapMutableBuilder[Self <: MediaStreamTrackEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationchange(value: Event): Self = StObject.set(x, "isolationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMute(value: Event): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmute(value: Event): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
  }
}
